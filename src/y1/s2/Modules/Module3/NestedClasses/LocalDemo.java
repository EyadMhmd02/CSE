package y1.s2.Modules.Module3.NestedClasses;

/**
 * A local class is a special type of inner class and is a class that is declared within a block (a block
 * or compound statement is a group of zero or more statements enclosed in a pair of braces). Most
 * typically, a local class will be declared in the block comprising the body of a method
 */

public class LocalDemo {
}

class C {
    // Declaration of C instance variables ...
    // Declaration of C instance methods ...
    public void someMethod() {
        // Declaration of local variables in someMethod() ...
        // Declare a local class named LocalClass. Note that no accessibility modifier
        // is written since the scope of LocalClass is someMethod().
        final int N = 300;
        int n = 30;
        class LocalClass {
            // Declaration of LocalClass instance variables ...
            // Declaration of LocalClass instance methods ...
        }
        // Statements in someMethod() ...
        // Instantiate a LocalClass object.
        LocalClass aLocalClassObject = new LocalClass();
        // ...
    }
}