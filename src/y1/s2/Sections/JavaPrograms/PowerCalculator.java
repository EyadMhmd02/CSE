package y1.s2.Sections.JavaPrograms;

/**
 * Calculate the power of a number using a while loop
 */

public class PowerCalculator {
    public static void main(String[] args) {
        int base = 3, exponent = 4;
        long result = 1;
        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        System.out.println("Answer = " + result);
    }
}
