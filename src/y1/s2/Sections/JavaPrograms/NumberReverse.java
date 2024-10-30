package y1.s2.Sections.JavaPrograms;

/**
 * Reverse a Number using a while loop in Java
 */

public class NumberReverse {
    public static void main(String[] args) {
        int num = 1234567, reversed = 0;
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
