package y3.s1.cse222.canvas.m03_analysis_of_algorithms;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.stopwatch.Stopwatch;

import static y1.s2.Modules.Module4.recursion.Factorial.factorial;

public class Main {
    public static void main(String[] args) {
//        // problem size n
//        // size of array
//        int[] arr = {14, 41, 50, 1, 9, 10};
//        // problem size = arr.length
//        System.out.println("problem size for array\t\t=>\tarr.length\t\t=\t" + arr.length);
//
//        // value of int
//        int n = 5;
//        long factorial = factorial(n);
//        System.out.println("problem size for factorial\t=>\tvalue of n\t\t=\t" + n);
//
//        // length of a string
//        String name = "Omar Hasan";
//        System.out.println("problem size for a string\t=>\tstring.length()\t=\t" + name.length());

        Stopwatch stopwatch = new Stopwatch();
        int n = 1000;
        // 1 loop   O(n)   00:00:00:016
        // 2 loops  O(n^2) 00:00:03:913
        // 3 loops  O(n^3)
        for (int i = 0; i < n; i++) { // O(n)
            for (int j = 0; j < n; j++) { // O(n)
                for (int k = 0; k < n; k++) { // O(n)
                    System.out.println("Eyad");
                }
            }
        }
        System.out.println(stopwatch);
    }
}
