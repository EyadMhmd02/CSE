package y3.s1;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.stopwatch.Stopwatch;

public class Main {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        long n = 1000000L;
        long counter = 0;

        System.out.println("n...");
        stopwatch.reset();
        for (int i = 0; i < n; i++) {
            counter++;
        }
        System.out.println(counter);
        System.out.println(stopwatch);

        counter = 0;
        System.out.println("n^2...");
        stopwatch.reset();
        for (long i = 0; i < n; i++) {
            for (long j = 0; j < n; j++) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println(stopwatch);
    }
}
