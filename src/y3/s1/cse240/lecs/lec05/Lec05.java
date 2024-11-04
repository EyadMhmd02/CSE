package y3.s1.cse240.lecs.lec05;

import java.util.Scanner;

class Lec05 {
    static int foo = 0;

    private static int myFunction() {
        return 5;
    }

    private static void testOutput() {
        System.out.println("Hello World");
        int x = myFunction();
        foo = x + 1;
        System.out.printf("Result  : %f\n", Math.sqrt(2));
        x = 5;
        float y = 10.3f;
        System.out.printf("hello %d bye %" +
                ".1f\n", x, y);
    }

    private static void testInput() {
        int i, n = 5;
        System.out.print("Hi, please enter an integer: ");

        // input: Scanner object
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt(); // input function

        if (i > n)
            n = n + i;
        else
            n = n - i;
        System.out.printf("i = %d, n = %d\n", i, n); // output function
    }

    private static void testBooleans() {
        // Java contains booleans
        if (true)
            System.out.println("Hello");
        else
            System.out.println("Bye");
    }

    public static void main(String[] args) {
//        testOutput();
//        testInput();
        testBooleans();
    }
}

// testOutput()
/*
Hello World
Result  : 1.414214
hello 5 bye 10.3

 */

// testInput()
/*
Hi, please enter an integer: 4
i = 4, n = 1

 */

// testBooleans()
/*
Hello

*/