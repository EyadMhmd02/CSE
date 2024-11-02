package y1.s2.Modules.Module3.Polymorphism.whyuseful;

class Main {
    public static void main(String[] args) {
        Direct direct = new Direct();
        Indirect indirect = new Indirect();
        C c = new C();

        method(direct);
        method(indirect);
        method(c);
    }

    public static void method(Left left) {
        left.m();
    }
}

abstract class Left {
    public abstract void m();
}

class Direct extends Left {
    @Override
    public void m() {
        System.out.println("Direct");
    }
}

class Indirect extends Direct {
    @Override
    public void m() {
        System.out.println("Indirect");
    }
}

class C extends Indirect {
    @Override
    public void m() {
        System.out.println("C");
    }
}
