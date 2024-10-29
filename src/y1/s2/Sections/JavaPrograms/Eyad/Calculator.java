package y1.s2.Sections.JavaPrograms.Eyad;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1, n2, result = 0;
        char operation;

        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            default:
                System.out.println("wrong operation");
        }

        System.out.println(result);
    }
}
