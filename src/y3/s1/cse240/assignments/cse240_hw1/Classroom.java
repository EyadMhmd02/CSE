package y3.s1.cse240.assignments.cse240_hw1;

/**
 * @author Eyad Mohamed AbdelMohsen Ghanem
 * */

class Classroom {
    private final Student[][] seats; // [row][column]

    /**
     * It instantiates a two-dimensional array of the size "rowNum" by "columnNum". Then it initializes each student element of this array using the constructor of the class Student without any parameter. So, each student will have default values for its instance variables.
     * */
    public Classroom(int rowNum, int columnNum) {
        seats = new Student[rowNum][columnNum];

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = new Student();
            }
        }
    }

    /**
     * The method assign the Student object referenced as "data" to the seat at "row" and "col".
     * If the seat has a default student, i.e., a student with the last name "bar" and the first name "foo", then we can assign the new student "data" to that seat and the method returns true. Otherwise, this seat is considered to be taken by someone else, the method does not assign the student and returns false.
     * */
    public boolean setStudentAt(int row, int col, Student data) {
        if((getStudentAt(row,col).getFirstName().equals("foo")) && (getStudentAt(row,col).getLastName().equals("bar"))) {
            seats[row][col] = null;
        }
        if (getStudentAt(row, col) == null) {
            seats[row][col] = data;
            return true;
        } else {
            return false;
        }
    }

    /**
     * It returns the student object at the indexes row and col (specified by the parameters) from the 2D array "seats".
     * */
    private Student getStudentAt(int row, int col) {
        return seats[row][col];
    }

    /**
     * The method checks if the parameters row and col are valid. If at least one of the parameters "row" or "col" is less than 0 or larger than the last index of the array then it returns false. Otherwise it returns true.
     * */
    private boolean isValidIndex(int row, int col) {
        return row >= 0 && row < seats.length && col >= 0 && col < seats[row].length;
    }

    /**
     * The method checks if the parameters row and col are valid. If at least one of the parameters "row" or "col" is less than 0 or larger than the last index of the array then it returns false. Otherwise it returns true.
     * */
    public boolean isValid(int row, int col) {
        return isValidIndex(row, col);
    }

    /**
     * Returns a String containing the information of the array “seats”. It should use the toString method of the class Student and return the following format:
     * “The current seating:
     * D.J. f.b. E.T.
     * f.b. f.b. S.W.
     * T.C. A.T. f.b.”
     * * the “” where used to indicate that the 4 line as are one string. But, should not be included in the returned value.
     * */
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("\nThe current seating:\n");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                string.append(getStudentAt(i, j));
                if (j < seats[i].length - 1) {
                    string.append(" ");
                }
            }
            string.append("\n");
        }
        return string.toString();
    }
}
