package y1.s2.Modules.ModuleFinalExam.h1;

public class _6_6 {
    public static void main(String[] args) {
        // cObj1 => default constructor
        _6_5 cObj1 = new _6_5();

        // cObj2 => second constructor, mX = 10
        _6_5 cObj2 = new _6_5(10);

        // LEGAL or ILLEGAL
//        int a1 = _6_5.mX;        // ILLEGAL
//        int a2 = _6_5.mY;        // ILLEGAL
//        int a3 = _6_5.A;         // ILLEGAL
        int a4 = _6_5.B;         // LEGAL
//        cObj1._6_5(20);          // ILLEGAL
        int a5 = cObj1.getX();   // LEGAL
        cObj1.setX(20);          // LEGAL
        cObj2.setX(cObj1.getX());// LEGAL
//        int a6 = _6_5.getX();    // ILLEGAL
//        _6_5.setX(20);           // ILLEGAL
        int a7 = cObj1.getY();   // LEGAL
        cObj1.setY(20);          // LEGAL
//        int a8 = _6_5.getY();    // ILLEGAL
//        _6_5.setY(20);           // ILLEGAL
    }
}
