package y1.s2.Modules.ModuleFinalExam.h1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _5_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        } finally {
            System.out.println("Eyad");
            scanner.close();
        }
    }
}
