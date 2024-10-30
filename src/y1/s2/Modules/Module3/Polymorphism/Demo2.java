package y1.s2.Modules.Module3.Polymorphism;


public class Demo2 {
    public static void main(String[] args) {
        Super superr = new Super();
        Sub sub = new Sub();
        someMethod(superr); // Legal: super is an object of Super
        someMethod(sub); // Legal: a Sub is a Super
        someOtherMethod(sub); // Legal: sub is an object of Sub
//        someOtherMethod(superr); // Illegal: a Super is not a Sub
        superr.aMethod();
        sub.aMethod();
    }

    public static void someMethod(Super pObj) {
        pObj.setX(10); // This would be legal if pObj is actually a Sub
        pObj.aMethod(); // if super => Super.aMethod()
                        // if sub   => Sub.aMethod()
    }

    public static void someOtherMethod(Sub pObj) {
        pObj.setY(20); // This would be illegal if pObj is actually a Super
        pObj.aMethod(); // if super => Super.aMethod()
                        // if sub   => Sub.aMethod()
    }
}

class Super {
    private int mX;

    public int getX() {
        return mX;
    }

    public void setX(int pX) {
        mX = pX;
    }

    public void aMethod() {
        // ...
    }
}

class Sub extends Super {
    private int mY;

    public int getY() {
        return mY;
    }

    public void setY(int pY) {
        mY = pY;
    }

    @Override
    public void aMethod() {
        // ...
    }
}