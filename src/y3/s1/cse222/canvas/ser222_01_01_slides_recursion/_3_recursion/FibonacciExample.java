package y3.s1.cse222.canvas.ser222_01_01_slides_recursion._3_recursion;

class FibonacciExample {
/**
 * fibonacci sequence:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21
 * */
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(45));
    }
}