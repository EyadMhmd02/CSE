//
// Created by omare on 04/11/2024.
//

/**
 - C is imperative language.
 - components of C program are called functions.
 - built-in functions are called libraries.
 - user-defined functions are written by programmers.
 - you can declare global variables and local variables.
 - a C program must contain one main() function.
*/

/*
This is an Example comment
 */

#include <math.h>
#include <stdio.h>

int foo = 0;

// this is a one line comment
int myFunction()
{
    return 5;
}

void test_output()
{
    printf("Hello World\n");
    int x = myFunction();
    foo = x + 1;
    printf("Result  : %f\n", sqrt(2));
    /*
    %d => integer
    %f => floating point
    %c => character
    %s => string of characters
     */
    x = 5;
    float y = 10.3;
    printf("hello %d bye %.1f\n", x, y);
}


void test_input()
{
    int i, n = 5;
    printf("Hi, please enter an integer: ");

    // input: scanf (control sequence, &variable1, ... &variablen);
    // &variable: address of the variable.
    scanf("%d", &i); // input function

    if (i > n)
        n = n + i;
    else
        n = n - i;
    printf("i = %d, n = %d\n", i, n); // output function
}

void test_booleans()
{
    // no booleans, zero is false, any other number is true
    if (2 + 2)
        printf("Hello\n");
    else
        printf("Bye\n");
}

int main()
{
    // test_output();
    // test_input();
    test_booleans();
    return 0;
}

// test_output()
/*
Hello World
Result  : 1.414214
hello 5 bye 10.3

 */

// test_input()
/*
Hi, please enter an integer:4
 i = 4, n = 1

 */

// test_booleans()
/*
Hello

 */
