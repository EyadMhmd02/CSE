package y1.s2.Modules.Module0;

// https://mygu.instructure.com/courses/769/quizzes/1969?module_item_id=27515

import java.util.ArrayList;
import java.util.Scanner;

public class _0_KnowledgeCheck {
    public static void main(String[] args) {
        q18();
    }

    public static void q1() {
        int[] x = {23, 4, 51, 3, 45};
        System.out.println("first:\t" + x[0]);
        System.out.println("last:\t" + x[x.length - 1]);
    }

    public static void q2() {
        int[] x = {4, 8, 5, 1, 6, 3, 2};
        System.out.println("x[1]:\t" + x[1]); // 8
        System.out.println("x[6]:\t" + x[6]); // 2
        try {
            System.out.println("x[7]:\t" + x[7]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("x[7]:\t" + e);
        }
        System.out.println("x.length:\t" + x.length); // 7
    }

    public static void q3() {
        // int final = 10;  // ILLEGAL: no name, final should be before int
        // int w = 10;      // LEGAL
        // char a = 'a';    // LEGAL
        // double w = 10.0; // LEGAL
    }

    public static void q4() {
        // Which of the following symbols is used to terminate a Java program statement?
        // ;        // ANSWER
        // <CR/LF>
        // .
        // }
    }

    public static void q5() {
        System.out.print("The sum is ");
        System.out.println("7 + 3");
        // The sum is 7 + 3
    }

    public static void q6() {
        // A Java class with the name Printer has to be saved using what source file name?
        // Printer.java
    }

    public static void q7() {
        System.out.print("The sum of 8 and 12 is ");
        System.out.println(8 * 12);
        // The sum of 8 and 12 is 96

        // LOGIC ERROR
    }

    public static void q8() {
        /*
          Which statements are true?

          1- The word public denotes that the class is usable by the "public"

          2- In Java, a file (.java) can contain at most one public class

          3- Every Java application must have a main method

          4- Every Java class must have a main method
          */

        // 4
    }

    public static void q9() {
        /*
          Which of the following loops executes the statements inside the loop before checking the condition?

          1- do while
          2- for
          3- while
          4- enhanced for
          */

        // do{}while();
    }

    public static void q10() {
        // how many times this loop will run?
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        // 10
    }

    public static void q11() {
        // what is the output of this code
        int i = 0;
        while (i != 9) {
            i = i + 2;
            i = i / 2;
        }
        System.out.printf("i = %d\n", i);

        // infinite loop
    }

    public static void q12() {
        // What is the output of this code?
        int i = 0;
        int j = 0;
        while (i < 27) { // i = 28
            i = i + 2; // i = 28
            j++; // j = 14
        }
        System.out.println("j=" + j);

        // j=14
    }

    public static void q13() {
        /*
          A loop inside another loop is called:

          1- it's not possible to put one loop inside another loop
          2- a parallel loop
          3- a sentinel loop
          4- a nested loop
          5- a do/while loop
          */

        // a nested loop
    }

    public static void q14() {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> data = new ArrayList<>();

        boolean done = false;
        while (!done) { // !false = true
            String input = in.next();
            if (input.equalsIgnoreCase("Q")) {
                // < insert code here >
                done = true;
            } else {
                double x = Double.parseDouble(input);
                data.add(x);
            }
        }
    }

    public static void q15() {
        /*
          Which of the following for loops is illegal?

          1- for (int i = 0; ; ) { }
          2- for (int i = 0, k = 1; ; i++) { }
          3- for ( ; ; ) { }
          4- for (int i = 0) { }
          */

        // 4
    }

    public static void q16() {
        // What is the output of this code?

        int a = 10;
        int b = 12;
        int c = 2;
        int x = a + b / c + a;

        System.out.println(x); // 26
    }

    public static void q17() {
        /*
          How do you compute the length of the string str?

          1- str.size
          2- str.length()
          3- String.length(str)
          4- str.size()
          5- str.length
          */

        // str.length()
    }

    public static void q18() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num1 = in.next(); // 23

        System.out.print("Enter another number: ");
        String num2 = in.next(); // 45

        System.out.println(num1 + num2);

        // 2345
    }

    public static void q19() {
        /*
          Which of the following statements about constants in Java are true?

          1- Only integer values can appear as constants
          2- A named constant makes computations that use it clearer
          3- Although not required, constants are commonly named using uppercase letters
          4- The reserved word const prevents it from being changed
          5- The reserved word final prevents it from being changed
          */

        // 2, 3, 5
    }

    public static void q20() {
        /*
          Consider the following Java variable names.  Which ones are valid?

          1- empName_
          2- 1stInstance
          3- addressLine1
          4- basicInt%
          5- DISCOUNT
          */

        // 1, 3, 5
    }
}
