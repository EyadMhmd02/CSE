package y3.s1.cse222.canvas.m01_java_review_data_abstraction._1_java_review._3_recursion;

class FactorialExample {
    /**
     * factorial(n) = n * factorial(n - 1)
     * <p>
     * factorial(0) = 1
     * <p>
     * factorial(1) = 1
     * <p>
     * 5! = 5 * 4!
     * <p>
     * 4! = 4 * 3!
     * <p>
     * 3! = 3 * 2!
     * <p>
     * 2! = 2 * 1!
     * <p>
     * factorial(2) = 2 * factorial(1) = 2 * 1 = 2
     */
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
