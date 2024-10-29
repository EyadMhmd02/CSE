package y1.s2.Modules.Module6.cse205_h03.src._3;

public class _3_1 {
    public static void main(String[] args) {
        testSum1toN();
    }

    static int sum1toN(int n) {
        if (n == 1) return 1;
        else return n + sum1toN(n - 1);
    }

    static void testSum1toN() {
        System.out.println(sum1toN(100));
    }
}
