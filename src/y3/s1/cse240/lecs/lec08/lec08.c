//
// Created by omare on 04/11/2024.
//

#include <math.h>
#include <stdio.h>

/**
typedef typename newname;
introduces a new name that becomes a synonym for the type given by the typename portion of the declaration.
 */
typedef int booOoolean;
typedef char FlagType;

void typedef1()
{
    booOoolean x = 0;
    int counter;
    FlagType y = 'A';
    // etc...
}

typedef int cat;
typedef int dog;
typedef char letter;

void typedef2()
{
    letter x = 'A';
    cat one = 1;
    cat two = 2;
    dog little = 3;
    dog big = 4;
}

/**
enum allows us to define the allowed values for a new type.
- the elements in an enumeration are integer constants. i.e., they are labels that represent an integer value
 */

typedef enum { false, true } boolean;

typedef enum { Sat, Sun, Mon, Tue, Wed, Thu, Fri } days;

void enums1()
{
    boolean a = false;
    int counter;
    days x = Mon, y = Fri;
    days today = x + y;
    printf("%d", today);
}

typedef enum { red, amber, green } traffic_lights;

typedef enum { No, Yes } logic;

void enums2()
{
    traffic_lights x = Yes;
    logic var = Yes;

    // printf("x = %d\n", x);
    // printf("var = %d\n", var);

    while (var == Yes)
    {
        switch (x)
        {
        case amber:
            x = red;
            printf("Red Light");
            break;
        case red:
            x = green;
            printf("Green Light");
            break;
        case green:
            x = amber;
            printf("Amber Light");
            break;
        }
        var = No;
    }
}

/**
struct
- a structure is a composite data type declaration that defines a physically grouped list of variables to be placed under one name in a block of memory
- it is created by the keyword struct
- similar to Java class, but DOES NOT allow methods.
*/

struct person
{
    char name[30];
    int id;
};

void struct1()
{
    struct person x, y;
    scanf("%s", x.name);
    scanf("%d", &x.id);
    printf("%s", x.name);
    printf("\n");
    printf("%d", x.id);
}

struct contact
{
    char name[30];
    int phone;
    char email[30];
};

struct emp
{
    int id;
    char* name;
};

struct emp john;


struct contact contact_book[100]; // an array of structure

void struct2()
{
    int index = 0;
    scanf("%d", &contact_book[index].phone);
    scanf("%s", contact_book[index].name);
    scanf("%s", contact_book[index].email);

    printf("\n %d", contact_book[index].phone);
    printf("\n %s", contact_book[index].name);
    printf("\n %s", contact_book[index].email);
}

int main()
{
    // enums1();
    // enums2();
    // struct1();
    // struct2();

    int a = 1;
    char b[] = "John Doe";
    john.id = a;
    john.name = b;
    printf("%d, %s", john.id, john.name);

    return 0;
}
