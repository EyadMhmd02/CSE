//
// Created by eyado on 03/12/2024.
//

#include <iostream>
using namespace std;

class Person {
private:
    string name;
    int age;

public:
    Person(string name, int age);

    string get_name();

    int get_age();
};

Person::Person(string name, int age) {
    this->name = name;
    this->age = age;
}

string Person::get_name() {
    return name;
}

int Person::get_age() {
    return age;
}

int main() {
}
