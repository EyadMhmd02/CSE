package y1.s2.Modules.ModuleFinalExam.h1;

public class _5_1 {
    public static void main(String[] args) {
        divide();
    }

    private static int divide() throws ArithmeticException {
        int result = 0;
        try {
            result = 5 / 5;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
}
