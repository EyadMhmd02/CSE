//
// Created by eyado on 23/11/2024.
//

#include <iostream>
using namespace std;

class Date {
    // day, month, year
public:
    int day;
    int month;
    int year;

    Date() {
        day = 0;
        month = 0;
        year = 0;
    }

    // setDate
    void setDate() {
        cin >> day;
        cin >> month;
        cin >> year;
    }

    // printDate
    void printDate() {
        // dd-mm-yyyy
        printf("%02d-%02d-%04d", day, month, year);
    }
};

int main() {
    Date a;
    a.printDate(); // 00-00-0000
    a.setDate();
    a.printDate(); // 23-06-2002
}
