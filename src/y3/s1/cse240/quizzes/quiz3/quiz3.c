//
// Created by eyado on 30/12/2024.
//

#include <stdio.h>


int foo(int* n)
{
    *n = 30;
}

void q1()
{
    int i = 15;
    foo(&i);
    printf("i=%d\n", i); // 30
    i = 10;
    foo(&i);
    printf("i=%d\n", i); // 30
}

/*
i=30
i=30

 */

/*
Which code in C is equivalent to this code in Java
    int x = 5;
    float y = 10.3f;
    System.out.println("hello " + x + " bye " + y);
1-
    int x = 5;
    float y = 10.3;
    printf("hello %d bye %f", &x, &y);

2-
    int *x = 5;
    float *y = 10.3;
    printf("hello %p bye %p", x, y);

3-
    int x = 5;
    float y = 10.3f;
    printf("hello %i bye %f", x, y);

4-
    int x = 5;
    float y = 10.3;
    printf("hello %d bye %f", x, y);
 */
void q2()
{
    int x = 5;
    float y = 10.3;
    printf("hello %d bye %f", x, y);
}

/*Answer: 4*/

/*
What does the below program print on the screen?
 */
void q3()
{
    int i = 3, *j, k;
    j = &i;
    printf("%d\n", i * *j * i - *j);
    //                   3 * 3  * 3 - 3
    //                 = 24
}

/*
The following code is correct and print "Hello"
 */
void q4()
{
    if (2 + 2 + 2 + 2)
        if (1)
            printf("Hello");
}

/*Answer: True*/

/*
Which of the following are NOT primitive data types in C?
1- int
2- long
3- bool ✘
4- char
5- double
6- short
7- float
8- string ✘
 */
void q5()
{
}

/*
What is the output of the following program?
*/

typedef enum week { Mon, Tue, Wed, Thur, Fri, Sat, Sun } WEEK;

void q6()
{
    WEEK day;
    day = Wed;
    printf("%d", day);
}

/*
Which of the following lines print a "-15" on the screen

1-
int x = -15;
int *point = &x;
printf("%d", *point);

2-
int x = -15;
int *point = &x;
printf("%d", &x);

3-
int x = -15;
int *point = &x;
printf("%p", point);

4-
int x = -15;
printf("%p", &x);
 */
void q7()
{
    int x = -15;
    int* point = &x;
    printf("%d", *point);
}

/*
What is the output of the below code?
*/

// n = 3
int fun(int n)
{
    if (n == 4)
        return n;
    else
        return 2 * fun(n + 1);
}

void q8()
{
    printf("%d", fun(3)); // 2 * 4 = 8
}

/*
Given the following struct:
*/

struct contact
{
    char name[32];
    int phone;
    char email[32];
};

/*Which code can be used to create a contact and store data?

1-
struct contact x;
scanf("%s", &x.name);
scanf("%d", &x.phone);
scanf("%s", &x.email);

2-
struct contact x;
scanf("%s", &x.name);
scanf("%d", x.phone);
scanf("%s", &x.email);

3-
struct contact x;
scanf("%s", x.name);
scanf("%d", x.phone);
scanf("%s", x.email);

4-
struct contact x;
scanf("%s", x.name);
scanf("%d", &x.phone);
scanf("%s", x.email);
*/

void q9()
{
    struct contact x;
    scanf("%s", &x.name);
    scanf("%d", &x.phone);
    scanf("%s", &x.email);
}

/*
What is the output of the below code?
*/
void q10()
{
    int a[5] = {3, 1, 5, 20, 25};
    int i, j, m;
    i = *(a + 1) - 1;
    j = a[1] + 1;
    m = a[j] + a[i];
    printf("%d,%d,%d", i, j, m);
}

/*
1-
0, 1, 6

2-
0, 2, 8

3-
0, 2, 5

4-
1, 2, 6
 */

/*Answer: 0,2,8*/

/*

 */

/*What is printed by the following code?*/

int i = 10;

int bar(int m, int* n)
{
    printf("i=%d k=%d l=%d\n", i, m, *n);
}

int foo2(int k, int* l)
{
    printf("i=%d k=%d l=%d\n", i, k, *l);
    k = 3;
    *l = 4;
    bar(k, l);
}

void q11()
{
    int j = 15;
    foo2(j, &i);
    printf("i=%d j=%d\n", i, j);
}

/*

i = 10 k = 15 l = 10
i = 10 k = 3 l = 4
i = 10 j = 15


i = 10 k = 15 l = 10
i = 10 k = 3 l = 10
i = 10 j = 15

i = 4 k = 3 l = 4
i = 4 j = 15

i = 10 k = 15 l = 10
i = 4 k = 3 l = 4
i = 4 j = 15
 */

/*
Answer:
 */

int main()
{
    q11();
}
