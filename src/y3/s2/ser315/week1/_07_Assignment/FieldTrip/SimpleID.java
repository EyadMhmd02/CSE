package y3.s2.ser315.week1._07_Assignment.FieldTrip;

public class SimpleID {
    private static int counter = 1234;

    public static String generate() {
        return Integer.toString(counter++);
    }
}
