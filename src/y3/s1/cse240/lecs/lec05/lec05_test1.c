//
// Created by eyado on 22/11/2024.
//

#include <stdio.h>
#include <math.h>

// program to calculate circle circumference and area

#define PI 3.14

int main() {
    double r = 1.1;
    printf("r = %.2f", r);
    printf("\n");

    // 2 * PI * r
    double circ = 2 * PI * r;
    printf("circ = %.2f", circ);
    printf("\n");

    // 2 * PI * r * r
    double area = 2 * PI * r * r;
    printf("area = %.2f", area);
}
