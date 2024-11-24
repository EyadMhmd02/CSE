//
// Created by eyado on 23/11/2024.
//

#include <stdio.h>

#define tax 0.15

int main() {
    int numbers[5] = {5, 6, 7, 8, 9};
    char names[3][10] = {
        "cat",
        "dog",
        "bird",
    };

    float price;
    scanf("%f", &price);

    float final_price = price + tax;

    printf("final price = %f", final_price);
}
