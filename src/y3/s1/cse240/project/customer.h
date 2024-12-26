//
// Created by Eyad Mohamed AbdelMohsen Ghanem on 26/12/2024.
//
#include <iostream>
#include "bank_account.h"
using namespace std;

/**
 * A bank customer with a checking and a savings accounts.
 */
class customer
{
private:
    int customer_number;
    int pin;
    bank_account* checking_account;
    bank_account* savings_account;

public:
    /**
     * Constructs a customer with a given number and PIN.
     * @param customer_number the customer number
     * @param pin the personal identification number
     * @param checking_balance
     * @param savings_balance
     */
    customer(const int customer_number, const int pin, const double checking_balance, const double savings_balance)
    {
        this->customer_number = customer_number;
        this->pin = pin;
        checking_account = new bank_account();
        savings_account = new bank_account();
        checking_account->set_balance(checking_balance);
        savings_account->set_balance(savings_balance);
    }

    /**
     * Tests if this customer matches a customer number
     * and PIN.
     * @param customer_number a customer number
     * @param pin a personal identification number
     * @return true if the customer number and PIN match
     */
    bool match(const int customer_number, const int pin) const
    {
        return this->customer_number == customer_number && this->pin == pin;
    }

    /**
     * Gets the checking account of this customer.
     * @return the checking account
     */
    bank_account get_checking_account() const
    {
        return *checking_account;
    }

    /**
     * Gets the savings account of this customer.
     * @return the savings account
     */
    bank_account get_savings_account() const
    {
        return *savings_account;
    }

    /**
     * Gets the customer number of this customer.
     * @return the customer number
     */
    int get_customer_number() const
    {
        return customer_number;
    }

    /**
     * Gets the account pin of this customer.
     * @return the account pin
     */
    int get_pin() const
    {
        return pin;
    }

    void print_data() const
    {
        cout
            << "customer:\t\t" << customer_number
            << "\nPIN:\t\t\t" << pin
            << "\nchecking balance:\t" << checking_account->get_balance()
            << "\nsaving balance:\t\t" << savings_account->get_balance()
            << endl << endl;
    }
};
