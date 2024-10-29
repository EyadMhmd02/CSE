package y1.s2.Sections.JavaPrograms.Eyad;

/**
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

public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
