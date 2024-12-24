#include <iostream>
using namespace std;

class Person {
protected:
    string name;
    int age;

public:
    Person(string name, int age) {
        cout << "Person ctor" << endl;
        this->name = name;
        this->age = age;
    }

    string get_name() {
        return name;
    }

    int get_age() {
        return age;
    }

    virtual void print_data(int count) {
        cout << endl;
        cout << "p" << endl;
        cout << "name:\t" << name << endl;
        cout << "age:\t" << age << endl;
    }

    ~Person() {
        cout << "Person dtor" << endl;
    }
};

class Student : public Person {
private:
    int id;
    int year;

public:
    Student(string name, int age, int id, int year) : Person(name, age) {
        cout << "Student ctor" << endl;
        this->id = id;
        this->year = year;
    }

    int get_id() {
        return id;
    }

    int get_year() {
        return year;
    }

    void print_data(int count) {
        cout << endl;
        cout << "s" << count << endl;
        cout << "name:\t" << name << endl;
        cout << "age:\t" << age << endl;
        cout << "id:\t" << id << endl;
        cout << "year:\t" << year << endl;
        cout << endl;
    }

    ~Student() {
        cout << "Student dtor" << endl;
    }
};


class Employee : public Person {
private:
    double salary;

public:
    Employee(string name, int age, double salary) : Person(name, age) {
        cout << "Employee ctor" << endl;
        this->salary = salary;
    }

    double get_salary() {
        return salary;
    }

    void print_data(int count) {
        cout << endl;
        cout << "e" << count << endl;
        cout << "name:\t" << name << endl;
        cout << "age:\t" << age << endl;
        cout << "salary:\t" << salary << endl;
        cout << endl;
    }

    ~Employee() {
        cout << "Employee dtor" << endl;
    }
};

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

class C {
public:
    C() {
        cout << "C" << endl;
    }
};

class D : public B, public C, public A {
public:
    D() {
        cout << "D" << endl;
    }
};

class Base {
public:
    virtual void method() {
        cout << "base" << endl;
    }
};

class Derived1 : public Base {
public:
    void method() {
        cout << "derived 1" << endl;
    }
};

class Derived2 : public Base {
public:
    void method() {
        cout << "derived 2" << endl;
    }
};

int main() {
    // Employee e1("Rana", 40, 6000);
    // Employee e2("Mohamed", 45, 7000);
    // Employee e3("Omar", 29, 5000);
    // e1.print_data(1);
    // e2.print_data(2);
    // e3.print_data(3);

    // Student s1("Eyad", 22, 1, 3);
    // Student s2("Ahd", 24, 2, 3);
    // Student s3("Habiba", 24, 3, 3);
    // Student s4("Sarah", 24, 4, 3);
    //
    // s1.print_data(1);
    // s2.print_data(2);
    // s3.print_data(3);
    // s4.print_data(4);

    // D d;

    Base *b1 = new Base();
    b1->method();

    Base *b2 = new Derived1();
    b2->method();

    Base *b3 = new Derived2();
    b3->method();

    return 0;
}
