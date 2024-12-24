package y3.s1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < 7; i++) {
            list.add((char) ('a' + i));
        }

        System.out.println(list); // [a, b, c, d, e, f, g]

        System.out.println(myReverse(list));
    }

    public static void method1() {
        int x = 3;
        System.out.println(x); // 3
        method2();
        // null
        // hello
        // null
        System.out.println(x); // 3
        System.out.println("end"); // end
    }

    public static void method2() {
        Integer x = null;
        System.out.println(x); // null
        method3(); // hello
        System.out.println(x); // null
    }

    public static void method3() {
        String x = "hello";
        System.out.println(x); // hello
    }

    public static void printHelloWorld() {
        System.out.println("Hello, World!");
    }

    public static int addFour(int x) {
        return x + 4;
    }

    public static double hypotenuse(double length, double width) {
        return Math.sqrt((length * length) + (width * width));
    }

    public static String firstNChars(String s, int n, boolean reverseIt) {
        if (reverseIt) {
            return new StringBuilder(s).reverse().substring(0, n);
        } else {
            return s.substring(0, n);
        }
    }

    public static <T> List<T> myReverse(List<T> list) {
        List<T> newList = new ArrayList<>();

        for (T x : list) {
            newList.add(0, x);
        }

        return newList;
    }
}