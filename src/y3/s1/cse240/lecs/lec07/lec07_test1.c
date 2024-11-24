//
// Created by eyado on 23/11/2024.
//

#include <stdio.h>

int main() {
    // variable x = 10
    int x = 10;
    // pointer to x
    int *p = &x;
    // change x value to 20 using pointer
    *p = 20;
    printf("x = %d", x);
}
