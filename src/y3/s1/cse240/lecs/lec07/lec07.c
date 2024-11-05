//
// Created by omare on 04/11/2024.
//

#include <stdio.h>

/**
• A variable stores a value.
• A pointer is a variable that store an address.
• Direct manipulation of addresses is powerful in programming.
• Pointer type is common in all imperative languages.
• C has 2 pointer operators: & (ampersand) and * (asterisk)
*/

void example1()
{
    // note: %p for pointers
    int x = 5;
    int* y = &x;
    printf("int x = 5;\n");
    printf("int* y = &x;\n");
    printf("x\tvalue of x:\t\t%d\n", x);
    printf("&x\taddress of x:\t\t%p\n", &x);
    printf("y\tvalue of y:\t\t%p\n", y);
    printf("&y\taddress of y:\t\t%p\n", &y);
    printf("*y\tvalue pointed by y:\t%d\n", *y);
}

void example2()
{
    int x = 5;
    int* y = &x;
    int** z = &y;
    printf("int x = 5;\n");
    printf("int* y = &x;\n");
    printf("int** z = &y;\n");
    printf("x\tvalue of x:\t\t\t\t\t%d\n", x);
    printf("&x\taddress of x:\t\t\t\t\t%p\n", &x);
    printf("y\tvalue of y:\t\t\t\t\t%p\n", y);
    printf("&y\taddress of y:\t\t\t\t\t%p\n", &y);
    printf("*y\tvalue pointed by y:\t\t\t\t%d\n", *y);
    printf("z\tvalue of z:\t\t\t\t\t%p\n", z);
    printf("&z\taddress of z:\t\t\t\t\t%p\n", &z);
    printf("*z\tvalue pointed by z:\t\t\t\t%p\n", *z);
    printf("**z\tvalue pointed by the address pointed by z:\t%d\n", **z);
}

void example3()
{
    int a = 12, *b = 0, **c = 0;
    printf("a = %d, b = %p, c = %p\n", a, b, c);
    b = &a;
    *b = 24;
    c = &b;
    **c = 48;
    printf("a = %d, b = %p, c = %p\n", a, *b, **c);
}

// &, *
void ampersand_and_asterisk()
{
    /* & is a referencing function that returns the address value of the variable it precedes, for instance:
     if integer x is allocated at memory address = 2000, then:
     y = &x; // y = 2000
     */

    /* * represents the variable name for a given address
     y = &x; // y = 100
     // *y is an alias of x
     // *y = 0; // x = 0
     &(*p) is the same as p
     */
}

void arrays1()
{
    int a[4];
    a[0] = 0; // same as *(a + 0)
    a[1] = 1; // same as *(a + 1)
    a[2] = 2; // same as *(a + 2)
    a[3] = 3; // same as *(a + 3)
}

void arrays2()
{
    int i = 0;
    char a[] = "Hello CSE 240";
    printf("\n message: %s\n ", a);

    // iterate the whole string
    while (a[i] != '\0')
    {
        // printf("*(a + %d) = %c\n", i, *(a + i));
        // printf("*(a + %d) + 1 = %c\n", i, *(a + i) + 1);
        a[i] = *(a + i) + 1;
        i++;
    }
    printf("\n message after encryption: %s\n ", a);
    char* q;
    q = a;
    while (*q != '\0')
    {
        // printf("*q = %c\n", *q);
        // printf("*q - 1 = %c\n", *q - 1);
        *q = *q - 1;
        q++;
    }
    printf("\n message after decryption: %s\n ", a);
}

int main()
{
    // example1();
    example2();
    // example3();
    // ampersand_and_asterisk();
    // arrays1();
    // arrays2();
    return 0;
}

// example1()
/*
x       value of x:             5
&x      address of x:           00000007055ffd4c
y       value of y:             00000007055ffd4c
&y      address of y:           00000007055ffd40
*y      value pointed by y:     5
 */

// example2()
/*
x       value of x:                                     5
&x      address of x:                                   0000006475bff97c
y       value of y:                                     0000006475bff97c
&y      address of y:                                   0000006475bff970
*y      value pointed by y:                             5
y       value of z:                                     0000006475bff970
&z      address of z:                                   0000006475bff968
*z      value pointed by z:                             0000006475bff97c
**z     value pointed by the address pointed by z:      5

*/

// example3()
/*
a = 12, b = 0000000000000000, c = 0000000000000000
a = 48, b = 0000000000000030, c = 0000000000000030
 */


// arrays2()
/*

 message: Hello CSE 240

 message after encryption: Ifmmp!DTF!351

 message after decryption: Hello CSE 240

 */
