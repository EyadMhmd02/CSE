//
// Created by eyado on 23/11/2024.
//

#include <iostream>
using namespace std;

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
    hour = minute = 0;
}

void Time::setTime(int h, int m) {
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
    Time t; // 00:00
    t.setTime(19, 44);
    t.print24(); // prints 19:44
    printf("\n");
    t.print12(); // prints 7:44 PM
}
