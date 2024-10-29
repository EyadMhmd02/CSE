package y1.s2.Sections.JavaPrograms.Eyad;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt(), exponent = sc.nextInt();
        int result = 1;
        while (exponent != 0) {
            result *= base;
            exponent--;
        }

        System.out.println(result);
    }
}
