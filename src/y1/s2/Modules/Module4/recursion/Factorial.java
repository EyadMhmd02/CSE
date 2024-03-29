package y1.s2.Modules.Module4.recursion;

import java.math.BigInteger;

/**
 * In mathematics and computing, we say a definition (or a function) is recursive if it is defined in
 * terms of itself.
 * <p>
 * Recursion involves repetition. During a recursive procedure we repeatedly reduce the problem
 * parameters to smaller and smaller values (which effectively reduces the "size" of the problem), while
 * performing the same operations in each new problem.
 * <p>
 * Not all problems are amenable to solution by recursion. To apply recursion the problem must possess
 * specific characteristics (which, uncoincidentally, are related to the key concepts):
 * <p>
 * 1. The size of the problem must be reducible to a smaller, basically-equivalent subproblem.
 * <p>
 * 2. The smaller, basically-equivalent sub-problem must be simpler to solve than the larger problem.
 * <p>
 * 3. The solution to the original problem requires repetition.
 * <p>
 * 4. There must be a base case at which point the size of the problem cannot be further reduced.
 * <p>
 * 5. The solution to the base case is generally easily-obtainable.
 * <p>
 * 6. The solution to the smaller sub-problem must be returned and used in solving the larger problem.
 * <p>
 * 7. The solution to the original problem results from solving all the sub-problems.
 */

public class Factorial {
    public static void main(String[] args) {
        System.out.println(loopFactorial(20));
        System.out.println(factorial(20));
        System.out.println(bigFactorial(52));
    }

    public static long loopFactorial(int n) {
        long result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) { // base case
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static BigInteger bigFactorial(long n) {
        BigInteger num = BigInteger.valueOf(n);
        if (num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return num.multiply(bigFactorial(n - 1));
    }
}