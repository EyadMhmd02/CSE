package y1.s2.Modules.Module6.cse205_h03.src._3;

public class _3_5 {
    public static void main(String[] args) {
        testReverse();
    }

    static String reverse(String s) {
        if (s.length() == 0) return "";
        char ch = s.charAt(0);
        return reverse(s.substring(1)) + ch;
    }

    static void testReverse() {
        System.out.println(reverse("Eyad and Umar"));
    }
}
