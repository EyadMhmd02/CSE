//
// Created by eyado on 22/11/2024.
//

// is number even or odd?

#include <stdio.h>

int main() {
    printf("Enter a number:");
    int n;
    scanf("%d", &n);

    if (n % 2 == 0) {
        printf("Even");
    } else {
        printf("Odd");
    }
}
