package y1.s2.Modules.ModuleFinalExam.h2;

public class _3_5 {
    public static void main(String[] args) {
        C1 obj1 = new C1(); // 3 variables
        C2 obj2 = new C2(); // 6 variables
        C3 obj3 = new C3(); // 9 variables
    }
}

class C1 {
    public int x1;
    protected int x2;
    private int x3;

    public void c1Method1() {
        x1 = 1;
        x2 = 2;
        x3 = 3;
//        y1 = 1;
//        y2 = 2;
//        y3 = 3;
//        c2Method1();
//        c2Method2();
//        c2Method3();
    }

    protected void c1Method2() {
        x1 = 1;
        x2 = 2;
        x3 = 3;
//        y1 = 1;
//        y2 = 2;
//        y3 = 3;
//        c2Method1();
//        c2Method2();
//        c2Method3();
    }

    private void c1Method3() {
        x1 = 1;
        x2 = 2;
        x3 = 3;
//        y1 = 1;
//        y2 = 2;
//        y3 = 3;
//        c2Method1();
//        c2Method2();
//        c2Method3();
    }
}

class C2 extends C1 {
    public int y1;
    protected int y2;
    private int y3;

    public void c2Method1() {
        x1 = 1;
        x2 = 2;
//        x3 = 3;
        y1 = 1;
        y2 = 2;
        y3 = 3;
        c1Method1();
        c1Method2();
//        c1Method3();
    }

    protected void c2Method2() {
        x1 = 1;
        x2 = 2;
//        x3 = 3;
        y1 = 1;
        y2 = 2;
        y3 = 3;
        c1Method1();
        c1Method2();
//        c1Method3();
    }

    private void c2Method3() {
        x1 = 1;
        x2 = 2;
//        x3 = 3;
        y1 = 1;
        y2 = 2;
        y3 = 3;
        c1Method1();
        c1Method2();
//        c1Method3();
    }
}

class C3 extends C2 {
    public int z1;
    protected int z2;
    private int z3;

    public void c3Method1() {
        x1 = 1;
        x2 = 2;
//        x3 = 3;
        y1 = 1;
        y2 = 2;
//        y3 = 3;
        c1Method1();
        c1Method2();
//        c1Method3();
    }

    protected void c3Method2() {
        x1 = 1;
        x2 = 2;
//        x3 = 3;
        y1 = 1;
        y2 = 2;
//        y3 = 3;
        c1Method1();
        c1Method2();
//        c1Method3();
    }

    private void c3Method3() {
        x1 = 1;
        x2 = 2;
//        x3 = 3;
        y1 = 1;
        y2 = 2;
//        y3 = 3;
        c1Method1();
        c1Method2();
//        c1Method3();
    }
}
