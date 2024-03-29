package y1.s2.Modules.Module6.cse205_h03.src._3;

public class _3_3 {
    public static void main(String[] args) {
        testPowerFaster();
    }

    static double powerFaster(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            double z = powerFaster(x, n / 2);
            return z * z;
        } else {
            return x * powerFaster(x, n - 1);
        }
    }

    static void testPowerFaster() {
        for (int p = 0; p <= 10; p++) {
            System.out.println("2 ^ " + p + " = " + powerFaster(2, p));
        }
    }
}
