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
    Counter c1, c2, c3;
}
