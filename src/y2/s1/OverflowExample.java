package y2.s1;

public class OverflowExample {
    public static void main(String[] args) {
        short shortNum = 3000;
        shortNum *= 3000;

        System.out.println(shortNum);
    }
}
