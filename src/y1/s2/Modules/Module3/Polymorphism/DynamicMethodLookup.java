package y1.s2.Modules.Module3.Polymorphism;

// Dynamic method lookup implements an object-oriented programming feature known as polymorphism
// which occurs when:

// 1. A superclass Superr declares a public or protected method M(). It does not matter if Superr or M()
// are abstract or not:

//class Superr {
//    public void M() {
//        // ...
//    }
//}

abstract class Superr {
    public abstract void M();
}

// 2. Direct and non-direct subclasses of Superr override M(), i.e., each subclass provides its own specific
// implementation of M() which does something that is specific to each subclass.
class DirectSub extends Superr {
    @Override
    public void M() {
        // ...
    }
}

class NonDirectSub extends DirectSub {
    @Override
    public void M() {
        // ...
    }
}

class Anon1 {
    // 3. A subclass object obj is passed as an argument to a method N() in which the method parameter
    // pObj is declared as a Superr object.
    public void N(Superr pObj) { // pObj can refer to a Superr object or to an object
        // ...                // of any subclass of Super, i.e., DirectSub or
    }                         // NondirectSub

    public void someMethod() {
        NonDirectSub sub = new NonDirectSub(); // Since a NonDirectSub is a Superr it is
        N(sub);                                // legal to substitute a NonDirectSub
    }                                          // object for a Super object
}

class Anon2 {
    // 4. Within N() a call to pObj.M() is made.
    public void N(Superr pObj) { // The class of the object variable pObj is Superr
        pObj.M();                // but the class of the object to which pObj refers
    }                            // is NonDirectSub
}

class Anon3 {
    // 5. Since the pObj object variable is declared as an object of Super but the class of the object to which
    // pObj actually refers is NonDirectSub, then NonDirectSub.M() is polymorphically called.
    public void N(Superr pObj) {
        pObj.M(); // This is a polymorphic method call to NonDirectSub.M()
    }
}

// Polymorphism literally means "many forms" or "many shapes" and is used to refer to this behavior
// since the object variable parameter pObj declared in N() appears to take on many forms or behaviors.