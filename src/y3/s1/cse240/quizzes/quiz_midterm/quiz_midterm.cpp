//
// Created by omare on 29/11/2024.
//

#include <stdio.h>

/* What is the output of the following codes? */

int code1() // C
{
    char s1[] = "hello";
    printf("%s\n", s1);
    // hello
    for (int i = 0; i < 5; i++)
        printf("%c", s1[i]);
    // hello
    printf("\n");
    //
    return 0;
}

/*
hello
hello

 */

int code2() {
    int x = 5;
    int *y;
    y = &x;
    printf("value of x: %d \n", x);
    // value of x: 5
    printf("address of x: %p \n", &x);
    // address of x: 0x7ffee6845930
    printf("value of y: %p \n", y);
    // value of y: 0x7ffee6845930
    printf("value pointed by y: %d \n", *y);
    // value pointed by y: 5
    //
    return 0;
}

int code3(int x) {
    // x = 0
    if (x > 0) {
        printf("%d", x);
        // 43211234
        code3(x - 1);
        printf("%d", x);
    }
    return 0;
}

// code4

#include <iostream>
using namespace std;

class Queue {
public:
    Queue();

    Queue(int n);

    ~Queue();
};

Queue::Queue() {
    cout << "constructor (void)" << endl;
}

Queue::Queue(int n) {
    cout << "constructor (int)" << endl;
}

Queue::~Queue() {
    cout << "destructor" << endl;
}

int code4() {
    Queue myQueue1(500);
    // constructor (int)
    Queue myQueue2;
    // constructor (void)
    // destructor
    // destructor
    return 0;
}

/* Write a C++ class (named Student that makes the following code works (i.e., compiles correctly). Add variables and methods as needed.*/

class Student {
public:
    int id;
    string name;
    int grade;

    Student(int i, string n, int g);

    void display();
};

Student::Student(int i, string n, int g) {
    id = i;
    name = n;
    grade = g;
}

void Student::display() {
    /*
    id = 2
    name = John
    grade = 100

     */
    cout << "id = " << id << endl;
    cout << "name = " << name << endl;
    cout << "grade = " << grade << endl;
}

int code5() {
    //id  name  grade
    Student s(2, "John", 100); // Creating an object passing values for id, name, grade
    s.display(); // Displaying Student attributes (id, name, and grade)
    return 0;
}

int main() {
    // code1();
    // code2();
    // code3(4);
    // code4();
    code5();
}

// code1
/*
hello
hello

 */

// code2
/*
value of x: 5
address of x: 000000a5b0bff754
value of y: 000000a5b0bff754
value pointed by y: 5
 */


// code3
/*
2112
 */

// code4
/*
constructor (int)
constructor (void)
destructor
destructor

 */

// code5
/*
ID: 2
Name: John
Grade: 100
 */
