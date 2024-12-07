//
// Created by eyado on 03/12/2024.
//

#include <iostream>
using namespace std;

class Car {
private:
    string color;
    string model;
    int year;

public:
    Car() {
        cout << "Car object created" << endl;
        color = "";
        model = "";
        year = 0;
    }

    Car(string color, string model, int year) {
        this->color = color;
        this->model = model;
        this->year = year;
    }

    ~Car() {
        cout << "Car object destroyed" << endl;
    }
};

class Microbus : public Car {
    int number_of_seats;
};

int main() {
    Car *car1;
    car1 = new Car();
    delete car1;

    Car *cars;
    cars = new Car[3];
    delete[] cars;
}
