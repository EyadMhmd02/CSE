package y1.s2.Modules.ModuleFinalExam.oop;

public class _3_1_Exception {
    public static void main(String[] args) {
        // Exception

        // 1- Unchecked => bugs, RuntimeException
        //      - ArithmeticException => math error (divide/0)
        //      - IndexOutOfBoundsException => index out of range
        //      - NullPointerException => app uses null where an object is required

        // 2- Checked => no bugs, throw OR handle
        //      - FileNotFoundException => file doesn't exist

        try {
            System.out.println("Eyad");
        } catch (Exception e) {
            System.out.println("Malika");
        } finally {
            System.out.println(0);
        }
    }
}
