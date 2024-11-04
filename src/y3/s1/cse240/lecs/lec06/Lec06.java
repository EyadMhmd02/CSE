package y3.s1.cse240.lecs.lec06;

public class Lec06 {

    public static void primitiveDataTypes() {
        short s = 1; // a whole number smaller than int
        int n = 5; // integer, a whole number
        long l = 55L; // a whole number larger than int
        float f = 6.3f; // floating point value. i.e., a number with a fractional part
        double d = 10.3; // a double-precision floating point value.
        char c = 'a'; // a single character
        boolean b = true; // boolean values

        // there is no signed or unsigned data types in Java

        int age = 90;
        if (true)
            System.out.println(age);
        else
            System.out.println("zero is false");

        age = 0;
        if (false)
            System.out.println(age);
        else
            System.out.println("zero is false");
    }

    public static void arrays() {
        int[] a = new int[3]; // a is not initialized
        int[][] ma = {
                {4, 2, 3},
                {7, 8, 9}
        };
        int[] b = {2, 3, 9, 4}; // b is initialized
        a[0] = 2;
        a[1] = 3;
        a[2] = 9;
        int i = a.length * Integer.BYTES; // # of bytes used by a
        int j = b.length * Integer.BYTES; // # of bytes used by b
        int k = ma.length * ma[0].length * Integer.BYTES; // # of bytes used by ma
    }

    public static void strings1() {
        char[] s1 = {'a', 'l', 'p', 'h', 'a'}; // as an array of char
        String s2 = "alpha"; // as a string

        System.out.println(s2);

        for (int i = 0; i < s2.length(); i++)
            System.out.print(s2.charAt(i));
        System.out.println();
    }

    public static void strings2() {
        String s1 = "hello";
        String s2 = "world";

        for (int i = 0; i < s1.length(); i++)
            System.out.print(s1.charAt(i));
        System.out.println();
        System.out.println("s1 = " + s1 + ", size = " + s1.length());
        for (int i = 0; i < s2.length(); i++)
            System.out.print(s2.charAt(i));
        System.out.println();
    }

    public static void constants() {
        final int i = 5;
        // i = i + 2; // this line will cause a compilation error
    }

    public static final double PI = 3.14;

    public static void define() {
        int radius = 5;
        double circumference = 2 * PI * radius;
        System.out.printf("radius = %d, circumference = %.2f", radius, circumference);
    }

    public static void main(String[] args) {
//        primitiveDataTypes();
//        arrays();
//        strings1();
//        strings2();
//        constants();
        define();
    }
}

// primitiveDataTypes()
/*
90
zero is false
 */


// arrays()

// strings1()
/*
alpha
alpha
 */

// strings2()
/*
hello
s1 = hello, size = 5
world
*/

// define()
/*
radius = 5, circumference = 31.40
 */