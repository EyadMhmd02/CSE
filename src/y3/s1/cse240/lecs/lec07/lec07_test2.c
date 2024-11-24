//
// Created by eyado on 23/11/2024.
//

#include <stdio.h>

void print_array_normally(int *a) {
    for (int i = 0; i < 5; i++) {
        printf("%d\n", a[i]);
    }
}

void print_array_using_pointers(int *a) {
    for (int i = 0; i < 5; i++) {
        printf("%d\n", *(a + i));
    }
}

int main() {
    int a[5] = {1, 2, 3, 4, 5};
    print_array_using_pointers(a);
}
