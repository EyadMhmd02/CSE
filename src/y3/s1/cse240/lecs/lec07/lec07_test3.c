//
// Created by eyado on 23/11/2024.
//

#include <stdio.h>

int main() {
    char n[20];
    scanf("%s", &n);

    int i = 0;
    while (n[i] != '\0') {
        *(n + i) += 1;
        i++;
    }

    printf("%s", n);
}
