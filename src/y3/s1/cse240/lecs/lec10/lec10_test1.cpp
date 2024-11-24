//
// Created by eyado on 23/11/2024.
//

#include <iostream>
using namespace std;

class arrayObject {
public:
    int x;
    double y;

    arrayObject() {
        cout << "++" << endl;
    }

    ~arrayObject() {
        cout << "--" << endl;
    }
};

#define size 4

int main() {
    // p, q
    arrayObject *p, *q;
    p = new arrayObject[size];

    for (q = p; q < p + size; q++) {
        q->x = 10;
        q->y = 1.5;
    }

    for (q = p; q < p + size; q++) {
        cout << "address = " << q << "value x = " << q->x << endl;
        cout << "address = " << q << "value y = " << q->y << endl;
    }

    delete[] p;
}
