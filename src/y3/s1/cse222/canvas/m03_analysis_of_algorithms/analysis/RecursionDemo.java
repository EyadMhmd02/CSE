package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.stopwatch.Stopwatch;

public class RecursionDemo {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        int n = 9000;
        System.out.printf("number = %,3d\n\n", n);

        System.out.println("Logarithmic\t\t=>\t\tO(log n)");
        stopwatch.reset();
        recursiveFun1(n);
        System.out.printf("Call times:\t\t%,3d\n\n", count1);
        System.out.println(stopwatch);

        System.out.println("Linear\t\t\t=>\t\tO(n)");
        stopwatch.reset();
        recursiveFun2(n);
        System.out.printf("Call times:\t\t%,3d\n\n", count2);

        System.out.println(stopwatch);

        System.out.println("Linear\t\t\t=>\t\tO(n)");
        stopwatch.reset();
        recursiveFun3(n);
        System.out.printf("Call times:\t\t%,3d\n\n", count3);

        System.out.println(stopwatch);

        Integer n1 = 0;
        System.out.println("Quadratic\t\t=>\t\tO(n²)");
        stopwatch.reset();
        recursiveFun4(n, n1);
        System.out.printf("Call times:\t\t%,3d\n\n", count4);

        System.out.println(stopwatch);

        System.out.println("Exponential\t\t=>\t\tO(2ⁿ)");

        System.out.printf("Note that the number %,3d is extremely large to be used in a code of this time complexity\nNumber will be reduced to", n);
        n = 55;
        System.out.printf("%,3d\n", n);
        stopwatch.reset();
        recursiveFun5(n);
        System.out.printf("Call times:\t\t%,3d\n\n", count5);

        System.out.println(stopwatch);


    }

    static int count1 = 0;
    static int count2 = 0;
    static int count3 = 0;
    static int count4 = 0;
    static int count5 = 0;

    // O(log n)
    private static int recursiveFun1(int n) {
        count1++;
        if (n <= 0)
            return 1;
        else
            return 1 + recursiveFun1(n / 5);
    }

    // O(n)
    private static int recursiveFun2(int n) {
        count2++;
        if (n <= 0)
            return 1;
        else
            return 1 + recursiveFun2(n - 5);
    }

    // O(n)
    private static int recursiveFun3(int n) {
        count3++;
        if (n <= 0)
            return 1;
        else
            return 1 + recursiveFun3(n - 1);
    }

    // O(n^2)
    private static int recursiveFun4(int n, Integer counter) {
        count4++;
        for (int i = 0; i < n; i += 2) {
            counter++;
        }
        if (n <= 0)
            return 1;
        else
            return 1 + recursiveFun4(n - 5, counter);
    }

    // O(2^n) // fibonacci sum
    private static int recursiveFun5(int n) {
        count5++;
        if (n < 0) throw new IllegalArgumentException("n must be a non-negative integer");
        if (n <= 1) return n;
        return recursiveFun5(n - 2) + recursiveFun5(n - 1);
    }
}

// SAMPLE OUTPUT:
/*
number = 9,000

Logarithmic		=>		O(log n)
Call times:		  7

Elapsed time:	000:00:00:00:000

Linear			=>		O(n)
Call times:		1,801

Elapsed time:	000:00:00:00:001

Linear			=>		O(n)
Call times:		9,001

Elapsed time:	000:00:00:00:000

Quadratic		=>		O(n²)
Call times:		1,801

Elapsed time:	000:00:00:00:044

Exponential		=>		O(2ⁿ)
Note that the number 9,000 is extremely large to be used in a code of this time complexity
Number will be reduced to 55
Call times:		731,301,353

Elapsed time:	000:00:22:59:364
*/