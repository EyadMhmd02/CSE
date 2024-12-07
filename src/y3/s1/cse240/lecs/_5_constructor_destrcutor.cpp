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
    Person(string name, int age) {
        this->name = name;
        this->age = age;
    }

    string get_name() {
        return name;
    }

    int get_age() {
        return age;
    }

    ~Person() {
        cout << "Person object deleted" << endl;
    }
};

int main() {
    Person p1("Eyad", 22);

    cout << "name1 = " << p1.get_name() << endl;
    cout << "age1 = " << p1.get_age() << endl;
}
