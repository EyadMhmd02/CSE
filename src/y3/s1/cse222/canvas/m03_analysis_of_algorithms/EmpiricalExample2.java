package y3.s1.cse222.canvas.m03_analysis_of_algorithms;

public class EmpiricalExample2 {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();

        System.out.println(fibonacci(50) + "\n");

        System.out.println(stopwatch);
    }

    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
