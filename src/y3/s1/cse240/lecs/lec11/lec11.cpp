//
// Created by eyado on 02/12/2024.
//

#include <iostream>
using namespace std;

// inheritance:

class Base {
public:
    Base(int n) {
        cout << "Base constructor" << endl;
    }

    void function() {
        cout << "function" << endl;
    }

    ~Base() {
        cout << "Base destructor" << endl;
    }
};

class Derived : public Base {
public:
    Derived(int n) : Base(n) {
        cout << "Derived constructor" << endl;
    }

    ~Derived() {
        cout << "Derived destructor" << endl;
    }
};

void code1() {
    Derived myPQ1(50);
    myPQ1.function(); // inherited
    myPQ1.function(); // inherited

    Derived *myPQ2;
    myPQ2 = new Derived(50);
    myPQ2->function(); // inherited
    myPQ2->function(); // inherited
    delete myPQ2;
}

/*
Base constructor
Derived constructor
function
function
Base constructor
Derived constructor
function
function
Derived destructor
Base destructor
Derived destructor
Base destructor

 */

class A {
public:
    A() {
        cout << "A" << endl;
    }
};

class B {
public:
    B() {
        cout << "B" << endl;
    }
};

class C : public B, public A {
public:
    C() {
        cout << "C" << endl;
    }
};

void code2() {
    C c;
}

/*
B
A
C

 */

// A pointer to a derived class is type-compatible with a pointer to its base class
// A virtual member is a member function for which dynamic dispatch is facilitated.

class Figure {
protected:
    int width, height;

public:
    void set_values(int a, int b) {
        width = a;
        height = b;
    }

    virtual int area() {
        return 0;
    }
};

class Rectangle : public Figure {
public:
    int area() {
        return width * height;
    }
};

class Triangle : public Figure {
public:
    int area() {
        return (width * height) / 2;
    }
};

void code3() {
    Rectangle r;
    Triangle t;
    Figure *f1 = &r;
    Figure *f2 = &t;

    f1->set_values(10, 20); // Rectangle
    f2->set_values(30, 40); // Triangle

    cout << r.area() << endl;
    cout << t.area() << endl;
    //
    cout << f1->area() << endl;
    cout << f2->area() << endl;
}

/*
not virtual
200
600
0
0
 */

/*
virtual
200
600
200
600
 */

int main() {
    // code1();
    // code2();
    code3();
}

/*
### MCQ Questions on Concepts (C++ Object-Oriented Programming)

#### **Question 1:**
What is the purpose of a **constructor** in a class?
1. To delete objects from memory.
2. To initialize objects when they are created.
3. To call functions inside the class.
4. To provide default values for private variables.

**Answer**: 2 - To initialize objects when they are created.
**Explanation**: Constructors are special functions in C++ used to initialize an object’s properties upon creation.

---

#### **Question 2:**
In C++ inheritance, what is the correct order of calling constructors when a derived class object is created?
1. Derived class constructor first, then base class constructor.
2. Constructors are called randomly.
3. Base class constructor first, then derived class constructor.
4. Only the derived class constructor is called.

**Answer**: 3 - Base class constructor first, then derived class constructor.
**Explanation**: When a derived class object is created, the base class constructor is called first to initialize the base part of the object.

---

#### **Question 3:**
What is the purpose of declaring a method as **virtual** in C++?
1. To allow the method to be overridden in derived classes.
2. To prevent the method from being inherited.
3. To make the method private.
4. To allow multiple inheritance.

**Answer**: 1 - To allow the method to be overridden in derived classes.
**Explanation**: Declaring a method as `virtual` enables polymorphism, allowing the derived class’s version of the method to be called through a base class pointer.

---

#### **Question 4:**
Which of the following statements about destructors in C++ is **true**?
1. Destructors are called before constructors.
2. Destructors release resources when an object is destroyed.
3. Destructors can take parameters.
4. Destructors are not required for dynamic memory.

**Answer**: 2 - Destructors release resources when an object is destroyed.
**Explanation**: Destructors are used to free resources like memory or file handles when an object goes out of scope.

---

#### **Question 5:**
What happens if you do not use the `virtual` keyword for a base class method and call it using a base class pointer to a derived class object?
1. The base class method is called.
2. The derived class method is called.
3. It causes a compilation error.
4. It causes undefined behavior.

**Answer**: 1 - The base class method is called.
**Explanation**: Without the `virtual` keyword, the method resolution is done at compile time, and the base class version is used.

---

#### **Question 6:**
What is **dynamic dispatch** in C++?
1. The process of allocating memory dynamically.
2. The ability to call the correct overridden method at runtime.
3. The ability to create dynamic objects.
4. The process of calling destructors in reverse order.

**Answer**: 2 - The ability to call the correct overridden method at runtime.
**Explanation**: Dynamic dispatch happens when a virtual function call is resolved at runtime, allowing polymorphism.

---

#### **Question 7:**
What does multiple inheritance mean in C++?
1. A class can only inherit from one base class.
2. A class can inherit from multiple base classes.
3. A class can inherit methods but not member variables.
4. A class cannot inherit if it already has a constructor.

**Answer**: 2 - A class can inherit from multiple base classes.
**Explanation**: Multiple inheritance allows a derived class to inherit from more than one base class in C++, but it must handle potential ambiguities.

---

#### **Question 8:**
Which keyword is used to make a base class’s method inaccessible to derived classes?
1. `virtual`
2. `protected`
3. `private`
4. `public`

**Answer**: 3 - `private`
**Explanation**: Making a method `private` in a base class prevents it from being accessed or overridden in derived classes.

---

#### **Question 9:**
What is the result of calling a **non-virtual destructor** on a derived class object through a base class pointer?
1. Only the base class destructor is called.
2. Only the derived class destructor is called.
3. Both base and derived destructors are called.
4. It causes a runtime error.

**Answer**: 1 - Only the base class destructor is called.
**Explanation**: Without a `virtual` destructor, only the base class destructor is called, which can lead to resource leaks if the derived class has allocated resources.

---

#### **Question 10:**
What is the primary benefit of polymorphism in C++?
1. It improves performance.
2. It allows the same interface to be used for different types.
3. It prevents inheritance-related bugs.
4. It eliminates the need for destructors.

**Answer**: 2 - It allows the same interface to be used for different types.
**Explanation**: Polymorphism enables the same function or method to behave differently based on the type of object that calls it.
 */
