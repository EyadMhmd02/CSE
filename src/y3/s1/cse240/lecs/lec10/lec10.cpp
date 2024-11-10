//
// Created by eyado on 10/11/2024.
//

#include <iostream>
using namespace std;

/*class Foo {
public:
    void counting();

    int getCounterB();

    static int counterA;

private:
    int counterB;
};

// initial value to static member variable
int Foo::counterA = 0;

int counter = 0;

void Foo::counting() {
    counterA++;
    counterB++;
}

int Foo::getCounterB() {
    return counterB;
}*/

/*class Queue {
private:
    int queue_size;

protected:
    int *buffer;
    int front;
    int rear;

public:
    Queue();

    Queue(int n);

    ~Queue();
};

Queue::Queue() {
    cout << "constructor(void)" << endl;
    // code...
}

Queue::Queue(int n) {
    cout << "constructor(int)" << endl;
    // code...
}

Queue::~Queue() {
    cout << "destructor" << endl;
    // code...
}*/

/*class Queue {
private:
    int queue_size;

protected:
    int *buffer;
    int front;
    int rear;

public:
    Queue();

    Queue(int n);

    ~Queue();
};

Queue::Queue() {
    cout << "constructor(void)" << endl;
    // code...
    buffer = NULL;
}

Queue::Queue(int n) {
    cout << "constructor(int)" << endl;
    // code...
    buffer = new int[queue_size];
}

Queue::~Queue() {
    cout << "destructor" << endl;
    // code...
    delete [] buffer;
}*/

#define size 4

class arrayObject {
public:
    int x;
    double y;

    arrayObject() {
        cout << "arrayObject's constructor called" << endl;
    }

    ~arrayObject() {
        cout << "arrayObject's destructor called" << endl;
    }
};

int main() {
    /*Foo f1, f2, f3, f4;
    f1.counting(); // A = 1 and B = 1
    f2.counting(); // A = 2 and B = 1
    f2.counting(); // A = 3 and B = 2
    f2.counting(); // A = 4 and B = 3
    f3.counting(); // A = 5 and B = 1
    f4.counting(); // A = 6 and B = 1
    f4.counting(); // A = 7 and B = 2

    cout << Foo::counterA << endl; // 7
    cout << f1.getCounterB() << endl; // 1
    cout << Foo::counterA << endl; // 7
    cout << f2.getCounterB() << endl; // 3*/

    /*Queue myQueue1(500);
    Queue myQueue2;
    // more code...*/

    /*Queue myQueue1(500);
    Queue myQueue2;
    Queue *myQueue3 = new Queue(100);
    // more code...
    delete myQueue3;*/

    arrayObject *p, *q; // declare two pointers
    p = new arrayObject[size]; // create an array of objects
    for (q = p; q < p + size; q++) {
        // initialize the objects
        q->x = 10;
        q->y = 1.5;
    }
    for (q = p; q < p + size; q++) {
        cout << "Element address = " << q << " Element x value: " << q->x << endl;
        cout << "Element address = " << q << " Element y value: " << q->y << endl;
    }

    delete [] p;

    return 0;
}
