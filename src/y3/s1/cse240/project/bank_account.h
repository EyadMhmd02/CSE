//
// Created by Eyad Mohamed AbdelMohsen Ghanem on 26/12/2024.
//
#include <iostream>
using namespace std;

class bank_account
{
private:
    double balance;

public:
    bank_account()
    {
        balance = 0;
    }

    void set_balance(double balance)
    {
        this->balance = balance;
    }

    double get_balance() const
    {
        return balance;
    }
};
