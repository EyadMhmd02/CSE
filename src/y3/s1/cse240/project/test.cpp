//
// Created by Eyad Mohamed AbdelMohsen Ghanem on 26/12/2024.
//
#include <iostream>
#include "customer.h"

#define CUSTOMER_DATA_FILE "customer_data.txt"

using namespace std;

int main()
{
    customer c1(1, 2002, 5000, 22500);

    customer c2(2, 1995, 6000, 23500);

    // Test customer data
    cout << "Testing customer data..." << endl;
    c1.print_data();
    c2.print_data();

    // Test match function
    cout << "Testing match function..." << endl;
    if (c1.match(1, 2002))
    {
        cout << "Customer 1 matched successfully!" << endl;
    }
    else
    {
        cout << "Customer 1 matching failed!" << endl;
    }

    if (c2.match(1001, 1234))
    {
        cout << "Customer 2 matched successfully!" << endl;
    }
    else
    {
        cout << "Customer 2 matching failed!" << endl;
    }
    cout << endl;

    return 0;
}
