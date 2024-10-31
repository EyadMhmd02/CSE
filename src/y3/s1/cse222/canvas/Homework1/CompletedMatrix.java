package y3.s1.cse222.canvas.ser222_01_02_hw02;

/**
 * An implementation of the Matrix ADT. Provides four basic operations over an immutable type.
 * <p>
 * Last updated 10/27/2024.
 *
 * @author Eyad Mohamed AbdelMohsen Ghanem
 * @version 1.0
 */

class CompletedMatrix implements Matrix {
    private final int[][] matrix;

    public CompletedMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * Returns the element at particular point in the matrix.
     * @param y y position
     * @param x x position
     * @return element
     */
    @Override
    public int getElement(int y, int x) throws IllegalArgumentException {
        return this.matrix[y][x];
    }

    /**
     * Returns the number of rows in the matrix.
     * @return rows
     */
    @Override
    public int getRows() throws IllegalArgumentException {
        return this.matrix.length;
    }

    /**
     * Returns the number of columns in the matrix.
     * @return columns
     */
    @Override
    public int getColumns() throws IllegalArgumentException {
        // throws an exception if the matrix is empty
        if (this.matrix.length == 0) throw new IllegalArgumentException("Matrix is empty.");

        return this.matrix[0].length;
    }

    /**
     * Returns this matrix scaled by a factor. That is, computes kA where k is a
     * constant and A is a matrix (this object).
     *
     * @param scalar scalar
     * @return matrix
     */
    @Override
    public Matrix scale(int scalar) {
        int[][] scaledMatrix = new int[this.getRows()][this.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                scaledMatrix[i][j] = this.getElement(i, j) * scalar;
            }
        }
        return new CompletedMatrix(scaledMatrix); // returns a new matrix object with the scaled matrix
    }

    /**
     * Returns this matrix added with another matrix. That is, computes A+B
     * where A and B are matrices (this object, and another respectively).
     * @param other addend
     * @return matrix
     * @throws RuntimeException if matrices do not have matching dimensions.
     * @throws IllegalArgumentException if other matrix is null.
     */
    @Override
    public Matrix plus(Matrix other) throws RuntimeException, IllegalArgumentException {
        if (this.getRows() != other.getRows() || this.getColumns() != other.getColumns()) {
            throw new RuntimeException("Matrices do not have matching dimensions.");
        }

        if (other == null) throw new IllegalArgumentException("Other matrix is null.");

        int[][] plusMatrix = new int[this.getRows()][this.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                plusMatrix[i][j] = this.getElement(i, j) + other.getElement(i, j);
            }
        }
        return new CompletedMatrix(plusMatrix);
    }

    /**
     * Returns this matrix subtracted by another matrix. That is, computes A-B
     * where A and B are matrices (this object, and another respectively).
     * @param other subtrahend
     * @return matrix
     * @throws RuntimeException if matrices do not have matching dimensions.
     * @throws IllegalArgumentException if other matrix is null.
     */
    @Override
    public Matrix minus(Matrix other) throws RuntimeException, IllegalArgumentException {
        if (this.getRows() != other.getRows() || this.getColumns() != other.getColumns()) {
            throw new RuntimeException("Matrices do not have matching dimensions.");
        }

        if (other == null) throw new IllegalArgumentException("Other matrix is null.");

        int[][] minusMatrix = new int[this.getRows()][this.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                minusMatrix[i][j] = this.getElement(i, j) - other.getElement(i, j);
            }
        }
        return new CompletedMatrix(minusMatrix);
    }

    /**
     * Returns this matrix multiplied by another matrix (using dot products).
     * That is, computes AB where A and B are matrices (this object, and another
     * respectively).
     * @param other multiplicand
     * @return matrix
     * @throws RuntimeException if matrices do not have appropriate dimensions.
     * @throws IllegalArgumentException if other matrix is null.
     */
    @Override
    public Matrix multiply(Matrix other) throws RuntimeException, IllegalArgumentException {
        // throws a RuntimeException if the matrices do not have appropriate dimensions
        if (this.getColumns() != other.getRows()) {
            throw new RuntimeException("Matrices do not have appropriate dimensions.");
        }

        // throws an IllegalArgumentException if the other matrix is null
        if (other == null) throw new IllegalArgumentException("Other matrix is null.");

        int[][] multiplyMatrix = new int[this.getRows()][other.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < other.getColumns(); j++) {
                for (int k = 0; k < this.getColumns(); k++) {
                    multiplyMatrix[i][j] += this.getElement(i, k) * other.getElement(k, j);
                }
            }
        }
        return new CompletedMatrix(multiplyMatrix); // returns a new matrix object with the multiplied matrix
    }

    /**
     * Returns true if this matrix matches another matrix.
     * @param other another matrix
     * @return equality
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null) return false;
        if (other.getClass() != this.getClass())
            return false;
        Matrix m = (Matrix) other;
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getElement(i, j) != m.getElement(i, j)) return false;
            }
        }
        return true;
    }

    /**
     * Returns a string representation of this matrix. A new line character will
     * separate each row, while a space will separate each column.
     * @return string representation
     */
    @Override
    public String toString() {
        String string = "";
        int i, j;
        for (i = 0; i < this.getRows(); ++i) {
            for (j = 0; j < this.getColumns() - 1; ++j) {
                string += this.getElement(i, j) + " ";
            }
            string += this.getElement(i, j) + "\n";
        }
        return string;
    }
}