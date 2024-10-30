package y1.s2.Modules.ModuleFinalExam.h2;

public class _3_2 {
    public static void main(String[] args) {
        Sandwich x = new Sandwich();
        Sub y = new Sub();

        // x = y;               // LEGAL
        // y = x;               // ILLEGAL
        // y = new Sandwich();  // ILLEGAL
        // x = new Sub();       // LEGAL
    }
}

class Sub extends Sandwich {

}

class Sandwich {

}
