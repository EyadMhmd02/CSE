//
// Created by eyado on 23/11/2024.
//

#include <stdio.h>

// id (int)
// name (string)
// salary (float)

struct emp {
    int id;
    char *name;
    float salary;
};

struct emp eyad;

int main() {
    int id1;
    char name1[30];
    float salary1;

    scanf("%d", &id1);
    scanf("%s", &name1);
    scanf("%f", &salary1);

    eyad.id = id1;
    eyad.name = name1;
    eyad.salary = salary1;

    printf("employee 1 data:");
    printf("id = %d", eyad.id);
    printf("\n");
    printf("name = %s", eyad.name);
    printf("\n");
    printf("salary = %.2f", eyad.salary);
}
