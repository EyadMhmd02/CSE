package y1.s2.Modules.Module3.NestedClasses;

/**
 * An anonymous class is another special type of inner class and is similar to a local class except:
 * <p>
 * 1. An anonymous class does not have a name.
 * <p>
 * 2. The anonymous class and an object of that class are created at the same time.
 * <p>
 * 3. An anonymous class is not actually a class declaration, but rather, is an expression which means
 * that it appears inside another expression or where an expression is expected.
 */

public class AnonymousDemo {
}

// Super will be the superclass of the anonymous class object created in
// AnonExample.someMethod().
class Super {
    public Super() {
        // ...
    }

    public Super(int pInt) {
        // ...
    }

    public void overriddenMethod() {
        // ...
    }
}

class SomeClass {
    // SomeClass instance variable declarations ...
    // SomeClass instance method declarations ...
    // The parameter pObj can be a Super object or an object of any subclass of
    // Super.
    public void doSomething(Super pObj) {
        // Will call Super.overriddenMethod() when pObj is a Super. Will call
        // <anonymous-class>.overriddenMethod() when pObj is an <anonymous-class>.
        pObj.overriddenMethod();
    }
}

class AnonExample {
    // AnonExample instance variable declarations ...
    // AnonExample instance method declarations ...
    public void someMethod() {
        SomeClass someObject = new SomeClass();
        // We are creating an object of an anonymous inner class which inherits from
        // Super. We call the Super ctor that takes an int argument passing 10.
        someObject.doSomething(new Super() {
            // Anonymous class instance variable declarations ...
            @Override
            public void overriddenMethod() {
                // ...
            }
        });
        // More statements of someMethod() ...
    }
}