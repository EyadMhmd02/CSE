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
};

class Employee : public Person {
private:
    double salary;

public:
    Employee(string name, int age, double salary) : Person(name, age) {
        this->salary = salary;
    }

    double get_salary() const {
        return salary;
    }
};

int main() {
    Employee e1("Eyad", 22, 2);
    Employee e2("Omar", 29, 5000);

    cout << e1.get_name() << endl;
    cout << e1.get_age() << endl;
    printf("%.2f\n", e1.get_salary());

    cout << "---" << endl;

    cout << e2.get_name() << endl;
    cout << e2.get_age() << endl;
    printf("%.2f\n", e2.get_salary());

    return 0;
}