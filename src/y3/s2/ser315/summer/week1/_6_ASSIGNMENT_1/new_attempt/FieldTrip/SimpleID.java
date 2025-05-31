package y3.s2.ser315.summer.week1._6_ASSIGNMENT_1.new_attempt.FieldTrip;

public class SimpleID {
    private static int counter = 1234;

    public static String generate() {
        return Integer.toString(counter++);
    }
}
