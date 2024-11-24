//
// Created by eyado on 23/11/2024.
//

#include <stdio.h>

// rgb
typedef enum { RED, GREEN, BLUE } rgb;

int main() {
    // ask use to enter a color
    rgb color; // 0-2
    scanf("%d", &color);

    switch (color) {
        case RED:
            printf("Red");
            break;
        case GREEN:
            printf("Green");
            break;
        case BLUE:
            printf("Blue");
            break;
    }
}
