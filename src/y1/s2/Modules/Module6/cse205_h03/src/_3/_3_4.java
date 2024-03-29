package y1.s2.Modules.Module6.cse205_h03.src._3;

public class _3_4 {
    public static void main(String[] args) {
        testPowerBoth();
    }

    static int calls;
    static int callsFaster;

    static double power(double x, int n) {
        ++calls;
        if (n == 0) return 1;
        else return x * power(x, n - 1);
    }

    static double powerFaster(double x, int n) {
        ++callsFaster;
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            double z = powerFaster(x, n / 2);
            return z * z;
        } else {
            return x * powerFaster(x, n - 1);
        }
    }

    static void testPowerBoth() {
        for (int p = 0; p <= 10; p++) {
            calls = 0;
            callsFaster = 0;
            double p1 = power(2, p);
            double p2 = powerFaster(2, p);
            System.out.printf("p = %2d power() = %8.2f [calls = %2d]  ", p, p1, calls);
            System.out.printf("powerFaster() = %8.2f [calls = %2d]%n", p2, callsFaster);
        }
    }
}
