package y3.s1.cse240.assignments.cse240_hw1;

/**
 * @author Eyad Mohamed AbdelMohsen Ghanem
 * <p>
 * This program tests the methods in the Homework class.
 * <p>
 * The methods are:
 * <p>
 * initializeArray
 * <p>
 * selectionSort
 * <p>
 * factorial
 * <p>
 * printArray
 * */

class Homework {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c', 'd', 'x', 'y', '1', '2', '3', '4'};
        char[] b = {'p', 'q', '9', '8', '7', '6'};
        int[] c = {6, 0, 1};

        // Testing initializeArray
        printArray(a);
        initializeArray(a);
        printArray(a);

        // Testing selectionSort
        printArray(b);
        selectionSort(b);
        printArray(b);

        // Testing factorial
        System.out.println(factorial(5));
        System.out.println(factorial(c[0]));
        System.out.println(factorial(c[2]));
    }

    /**
     * @param arr an array of characters
     * populates the array with alternating 'a' and 'b' characters.
     * */
    static void initializeArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) arr[i] = 'a';
            else arr[i] = 'b';
        }
    }

    /**
     * @param arr an array of characters
     * prints the array of characters.
     * */
    static void printArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * @param arr an array of characters
     * sorts the array of characters.
     * */
    static void selectionSort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            char temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    /**
     * @param n the number to calculate the factorial of
     * @return the factorial of the number n
     */
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
