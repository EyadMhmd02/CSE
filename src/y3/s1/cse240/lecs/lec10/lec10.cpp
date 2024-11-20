//
// Created by eyado on 10/11/2024.
//

#include <iostream>
using namespace std;

/*class Student {
public:
    static string university;
    string name;
    int id;
    int age;
};

string Student::university = "Galala";*/

class Counter {
public:
    static int a;
    int b = 0;

    Counter() {
        cout << "eyad++" << endl;
    }

    ~Counter() {
        cout << "eyad--" << endl;
    }
};

int Counter::a = 0;


int main() {
    /*Student s1;
    s1.name = "Eyad";
    s1.id = 0;
    s1.age = 22;

    Student s2;
    s2.name = "Ahd";
    s2.id = 1;
    s2.age = 23;

    Student s3;
    s2.name = "Sarah";
    s2.id = 2;
    s2.age = 24;

    cout << "s1.university = " << Student::university << endl;*/

    Counter *c1 = new Counter();
    Counter *c2 = c1;

    string *name1 = new string("Eyad");
    string *name2 = new string("Eyad");

    cout << "name1 = " << name1 << endl;
    cout << "name2 = " << name2 << endl;
}
