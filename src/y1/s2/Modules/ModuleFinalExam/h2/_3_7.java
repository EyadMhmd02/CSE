package y1.s2.Modules.ModuleFinalExam.h2;

public class _3_7 {
    // Overriding:
    // 1 method
    //      => in superclass الأب
    //      => overridden in subclass الابن

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.method(); // super

        System.out.println();

        SubClass subClass = new SubClass();
        subClass.method(); // sub
    }
}

class SuperClass {
    public void method() {
        System.out.println("super");
    }
}

class SubClass extends SuperClass {
    @Override
    public void method() {
        super.method(); // super
        System.out.println("sub");
    }
}