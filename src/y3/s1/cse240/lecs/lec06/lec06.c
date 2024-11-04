//
// Created by omare on 04/11/2024.
//

#include <stdbool.h>
#include <stdio.h>

void primitive_data_types()
{
    short s = 1; // a whole number smaller than int
    int n = 5; // integer, a whole number
    long l = 55; // a whole number larger than int
    float f = 6.3; // floating point value. i.e., a number with a fractional part
    double d = 10.3; // a double-precision floating point value.
    char c = 'a'; // a single character
    // void:         valueless special purpose type.

    // C++ will add
    bool b = true; // boolean values

    /*
    primitive types can be modified using one or more of these modifiers:
    - signed
    - unsigned
    - short
    - long
     */

    unsigned int x = 65000;
    int y = 32767;

    char age = 90;
    if (age)
        printf("%d \n", age);
    else
        printf("zero is false");

    age = 0;
    if (age)
        printf("%d \n", age);
    else
        printf("zero is false");
}

void arrays()
{
    int a[3], i, j, k; // a is not initialized
    int ma[2][3] = {
        {4, 2, 3},
        {7, 8, 9},
    };
    int b[4] = {2, 3, 9, 4}; // b is initialized
    a[0] = 2;
    a[1] = 3;
    a[2] = 9;
    i = sizeof a; // # of bytes used by a is 12
    j = sizeof b; // # of bytes used by b is 16
    k = sizeof ma; // # of bytes used by ma is 24
}

void strings1()
{
    char s1[] = {'a', 'l', 'p', 'h', 'a'}; // as an array of char
    // in memory:
    // a, l, p, h, a
    char s2[] = "alpha"; // as a string
    // in memory:
    // a, l, p, h, a, \0

    // \0 is called a null terminator (null character) which marks the end of a string. It is automatically added to the end of the string.

    char s3[5] = "alpha"; // a l p h a
    char s4[4] = "alpha"; // a l p h

    printf("%s\n", s2);

    for (int i = 0; i < sizeof(s2); i++)
        printf("%c", s2[i]);
    printf("\n");
}

void strings2()
{
    int i;
    char s1[] = "hello", s2[] = "world";
    for (i = 0; i < 5; i++)
        printf("%c", s1[i]);
    printf("\n");
    printf("s1 = %s, size = %d\n", s1, sizeof s1);
    for (i = 0; i < 5; i++)
        printf("%c", s2[i]);
    printf("\n");
}

void constants()
{
    // const is equivalent to final in Java. this way is slower since it has to read memory.
    const int i = 5;
    // i = i + 2; // this line will cause a compilation error
}

#define PI 3.14

void define()
{
    // #define substitutes values for constant definitions in compilation time. Provide a faster execution.
    int radius = 5;
    int circumference = 2 * PI * radius;
    printf("radius = %d, circumference = %.2f\n", radius, circumference);
}

int main()
{
    // primitive_data_types();
    // arrays();
    // strings1();
    // strings2();
    // constants();
    define();
    return 0;
}

// primitive_data_types
/*
90
zero is false
 */

// strings1
/*
alpha
alpha
 */

// strings2
/*
hello
s1 = hello, size = 6
world
 */

// define
/*
radius = 5, circumference = 31.40
*/
