package y1.s2.Modules.Module1.cse205_src_week_01;

public class WrapperClasses {
    public static void main(String[] args) {        // I encapsulates int 10.
        Integer I = Integer.valueOf(10);

        // J encapsulates int -4567
        Integer J = Integer.valueOf("-4567");

        Integer K = Integer.valueOf(200);
        Integer L = Integer.valueOf(10);

        // int compareTo(Integer anotherInteger)
        // returns 0 if equal, -1 if less, 1 if greater
        int b1 = I.compareTo(J); // I > J   =>  1
        int b2 = I.compareTo(K); // I < K   => -1
        int b3 = J.compareTo(K); // J < K   => -1
        int b4 = L.compareTo(I); // L == I  =>  0

        // y is assigned 10.
        int y = I.intValue();

        // static int parseInt(String strValue)
        // x is assigned -4567.
        String s = "-4567";
        int x = Integer.parseInt(s);

        // String toString()
        // Prints "10".
        System.out.println(I.toString());

        // Unnecessary boxing
//        int a = 3;
//        int b = 4;
//        x = a + b;
//        Integer intX = Integer.valueOf(x);
//        y = intX.intValue() + b;
//        Integer intY = Integer.valueOf(y);

        // Using Java autoboxing
        int a = 3;
        int b = 4;
        x = a + b;
        int intX = x;
        y = intX + b;
        Integer intY = y;
    }
}
