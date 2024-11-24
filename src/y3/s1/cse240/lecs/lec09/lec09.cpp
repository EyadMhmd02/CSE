//
// Created by eyado on 10/11/2024.
//

#include <iostream>
using namespace std;

/*
class FooBar {
private:
    char a;
    int variable;

protected:
    int anotherVariable;

public:
    void method1() {
    }

    void method2() {
    }
};

int x;
*/

/*class Queue {
private:
    int queue_size;

protected:
    int *buffer;
    int front;
    int rear;

public:
    Queue(int v) {
        cout << "constructor\n";
    }

    void enqueue(int v) {
        cout << "enqueue\n";
    }

    int dequeue() {
        cout << "dequeue\n";
        return 5;
    }
};*/

class Time {
public:
    Time(); // constructor
    void setTime(int, int); // set hour, minute
    void print24(); // print military time format
    void print12(); // print standard time format

private:
    int hour; // 0 - 23
    int minute; // 0 - 59
};

Time::Time() {
    // constructor
    hour = minute = 0;
}

void Time::setTime(int h, int m) {
    // set a new mil Time
    hour = (h >= 0 && h < 24) ? h : 0;
    minute = (m >= 0 && m < 60) ? m : 0;
}

void Time::print24() {
    // print time in military format
    cout << (hour < 10 ? "0" : "") << hour << ":"
            << (minute < 10 ? "0" : "") << minute; // add 0
}

void Time::print12() {
    cout << ((hour == 0 || hour == 12) ? 12 : hour % 12)
            << ":" << (minute < 10 ? "0" : "") << minute
            << (hour < 12 ? " AM" : " PM") << endl; //endl is equal to “\n”
}

int main() {
    /*FooBar anObject;
    anObject.method1();
    anObject.method2();*/

    /*Queue q1(5);
    Queue *q2 = new Queue(5);

    // access object
    q1.enqueue(2);
    q1.enqueue(8);

    // access object pointer
    q2->enqueue(25);
    int x = q2->dequeue();*/

    Time t; // new is not mandatory
    cout << "The initial military time is ";
    t.print24();
    cout << "\nThe initial standard time is ";
    t.print12();
    t.setTime(15,27);
    cout << "The military time after setTime is ";
    t.print24();
    cout << "\nThe standard time after setTime is ";
    t.print12();
}
