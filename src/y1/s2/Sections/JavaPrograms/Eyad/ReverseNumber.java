package y1.s2.Sections.JavaPrograms.Eyad;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 456;

        for (; n != 0; n /= 10) {
            int digit = n % 10;
            System.out.print(digit);
        }
    }
}
