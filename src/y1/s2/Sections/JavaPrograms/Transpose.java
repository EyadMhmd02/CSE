package y1.s2.Sections.JavaPrograms;

/**
 * Program to Find Transpose of a Matrix
 * <p>
 * <p>
 * Matrix
 * <p>
 * a11      a12     a13
 * <p>
 * a21      a22     a23
 * <p>
 * <p>
 * Transposed Matrix
 * <p>
 * a11      a21
 * <p>
 * a12      a22
 * <p>
 * a13      a23
 */

public class Transpose {
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };
        // Display current matrix
        display(matrix);
        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        // Display transposed matrix
        display(transpose);
    }

    public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
