package y1.s2.Modules.Module6.cse205_h03.src._3;

public class _3_2 {
    public static void main(String[] args) {
        testPower();
    }

    static double power(double x, int n) {
        if (n == 0) return 1;
        else return x * power(x, n - 1);

    }
    static void testPower() {
        for (int p = 0; p <= 10; p++) {
            System.out.println("2 ^ " + p + " = " + power(2, p));
        }
    }
}
