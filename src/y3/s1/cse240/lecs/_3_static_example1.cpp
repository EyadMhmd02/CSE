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
};

class Student : public Person {
private:
    static string university;
    int id;
    double grade;

public:
    Student(string name, int age, int id, double grade) : Person(name, age) {
        this->id = id;
        this->grade = grade;
    }

    static string get_university() {
        return university;
    }

    int get_id() {
        return id;
    }

    double get_grade() {
        return grade;
    }
};

string Student::university = "Galala";

int main() {
    Student s1("Eyad", 22, 1, 3.5);
    Student s2("Ahd", 24, 2, 3.3);
    Student s3("Habiba", 24, 3, 3.6);

    cout << Student::get_university() << endl;
}
