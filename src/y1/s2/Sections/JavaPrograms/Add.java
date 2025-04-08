package y1.s2.Sections.JavaPrograms;

/**
 * Java Methods for add
 */

public class Add {
    // create a method
    public int addNumbers(int a, int b) {
        int sum = a + b;
        // return value
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;

        // create an object of y3.s2.ser315.week3.implementation_eghanem.Main
        Add obj = new Add();
        // calling method
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: " + result);
    }
}
