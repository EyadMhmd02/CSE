package y3.s1.cse222.canvas.m03_analysis_of_algorithms.supplement;

public class BigOh {
    /*
    1    < log n    < n    < n log n    < n^c    < c^n    < c^c^n
    O(1) < O(log n) < O(n) < O(n log n) < O(n^c) < O(c^n) < O(c^c^n)

    */

    // O(1)
    public static void foobar1(int n) {
        System.out.println(n); // O(1)
    }

    // O(n)
    public static void foobar2(int n) {
        int m = 0; // O(1)
        for (int i = 0; i < n; i++) { // O(1)
            System.out.println(i);
        } // O(n)
    }

    // O(log n)
    public static void foobar3(int n) {
        int m = 0; // O(1)
        for (int i = 1; i < n; i *= 4) { // O(1)
            System.out.println(i);
        } // O(log n)
    }

    // O(n^2)
    public static void foobar4(int n) {
        int m = 15;
        while (n > m) {
            for (int i = 1; i < n; i *= m) {
                System.out.println(i);
            } // O(n)
            m++;
        } // O(n)
    }

    // O(n)
    public static void foobar5(int n) {
        for (int i = 1500; i < n; i++) {
            System.out.println(i);
        } // O(n)
    }
}
