package y1.s2.Sections.JavaPrograms;

/**
 * Print right trinagle star pattern
 * <p>
 * *
 * <p>
 * **
 * <p>
 * ***
 * <p>
 * ****
 * <p>
 * *****
 */

public class RightTriangleStarPattern {
    // Function to demonstrate printing pattern
    public static void printStars(int n) {
        int i, j;
        // outer loop to handle number of rows
        // n in this case
        for (i = 0; i < n; i++) {
            // inner loop to handle number of columns
            // values changing acc. to outer loop
            for (j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }
            // ending line after each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String[] args) {
        int n = 5;
        printStars(n);
    }
}
