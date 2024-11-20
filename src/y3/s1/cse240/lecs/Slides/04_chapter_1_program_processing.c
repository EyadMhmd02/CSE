//
// Created by eyado on 14/11/2024.
//

#include <stdio.h>
#include <math.h>

/*#define MAXVAL 100
#define QUADFN(a,b) a * sqrt(b) + b * b - 2 * a * a * t++*/

/*
int abs(int a) {
    return ((a < 0) ? -(a) : (a));
}

#define abs(a) ((a < 0) ? -(a) : (a))
*/

#define max(x, y) ((x > y) ? x : y)

int main() {
    /*int t;
    int x = MAXVAL + QUADFN(5, 16);
    printf("%d\n", x);*/

    /*int i = 3;
    int j = abs(++i); // 5
    printf("j = %d", j);*/

    int a = 3;
    // int b = max(3, a++); // a = 5, b = 4
    // printf("a = %d, b = %d", a, b);
    int b = max(a++, 3); // a = 4, b = 3
    printf("a = %d, b = %d", a, b);
}
