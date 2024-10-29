package y1.s2.Modules.ModuleFinalExam.h2;

public class _3_6 {
    // Overloading:
    // 2 methods
    //      => same name
    //      => different signature (different parameters)

    public static void main(String[] args) {
        System.out.println(sum(3, 4));
        System.out.println(sum(3, 4, 5));
    }

    private static int sum(int n1, int n2) {
        return n1 + n2;
    }

    private static int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

}
