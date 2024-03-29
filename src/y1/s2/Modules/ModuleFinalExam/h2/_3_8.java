package y1.s2.Modules.ModuleFinalExam.h2;

/**
 * Accidental Overloading:
 *
 * we want to override a method
 *      => incorrectly specify the signature
 *
 * solution:
 *      => @Override
 * */

public class _3_8 {
    public static void main(String[] args) {

    }
}

class Super {
    public void method() {
        System.out.println("super");
    }
}

class Subb extends Super {
    @Override
    public void method() {
        super.method(); // super
        System.out.println("subb");
    }
}
