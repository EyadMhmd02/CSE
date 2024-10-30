package y1.s2.Modules.ModuleFinalExam.h2;

public class _3_16 {
    public static void main(String[] args) {
        Ab ab = new Ab(); // Ab

        System.out.println();

        Ibn ibn = new Ibn(); // Ab Ibn

    }
}

class Ab {
    public Ab() {
        System.out.println("Ab");
    }

    public Ab(int n) {
        System.out.println("Ab" + n);
    }
}

class Ibn extends Ab {
    public Ibn() {
        super(10);
        System.out.println("Ibn");
    }
}
