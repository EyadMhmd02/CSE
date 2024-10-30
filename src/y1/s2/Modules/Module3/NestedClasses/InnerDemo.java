package y1.s2.Modules.Module3.NestedClasses;

/**
 * An inner class is declared within an outer class and is associated with an instance (object) of the
 * outer class, i.e., an inner class object exists as an instance variable encapsulated within an outer class
 * object
 * */
public class InnerDemo {
    public static void main(String[] args) {
//        Outer.PublicInnerClass innerObj = new Outer.PublicInnerClass(); // Syntax error!
        // Create an Outer object
        Outer outerObj = new Outer();
        // Create a PublicInnerClass object inside outerObj
        Outer.PublicInnerClass innerObj = outerObj.new PublicInnerClass();
    }
}

class Outer {
    private int mX;
    private Inner mInner; // An instance of the inner class Inner

    public Outer() {
    }

    public Outer(int pX, int pY) {
        mX = pX;
        mInner = new Inner(pY); // Instantiate an Inner object
    }

    private class Inner {
        int mY; // An inner class may declare instance variables and instance methods

        public Inner(int pY) {
            mY = pY;
        }
    }

    public class PublicInnerClass {
        // Instance variable and method declarations ...
    }

    public void someMethod() {
        Outer outer = new Outer(10, 20);
        // ...
    }
}