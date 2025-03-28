//
// Created by eyado on 14/11/2024.
//

#include <stdio.h>

void question1() {
    /*
     What is a programming paradigm?
     1- A programming language is a paradigm.
     2- A set of principles, concepts, and methods that is commonly accepted by members of a group or community.
     3- A common set of hardware instructions for a specific kind of hardware.
     4- A mathematical model.

     Answer: 2
     */
}

void question2() {
    /*
    What is a data type?
    1- A piece of information.
    2- A set of primary values and the operations defined on these values.
    3- A specialized format for organizing and sorting data.
    4- A storage location paired with an association.

    Answer: 2
     */
    short s = 0;
    int n = 4;
    float f = 3.14;
    double d = 2.718;
    char c = 'a';
}

void question3() {
    /*
    The programming language uses two-step translation with intermediate codes for execution.
    1- C#
    2- Java
    3- C++
    4- LISP
    5- C

    Answer: 2
     */
}

void question4() {
    /*
    What kind of error is in the following line?
    int a = ((2 * 45) * (6 / 2) hello (4 + 90));
    1- Syntactic error.
    2- Semantic error.
    3- Lexical error.
    4- None of the above.

    Answer: 1
     */
}

void question5() {
    /*
    Which code in C is equivalent to this code in Java?
    int x = 5;
    float y = 10.3f;
    System.out.println("hello " + x + " bye " + y);

    1-
    int x = 5;
    float y = 10.3;
    printf("hello %d bye %f", &x, &y);

    2-
    int x = 5;
    float y = 10.3f;
    printf("hello %i bye %f", x, y);

    3-
    int x = 5;
    float y = 10.3;
    printf("hello %d bye %f", x, y);

    4-
    int *x = 5;
    float *y = 10.3;
    printf("hello %p bye %p", x, y);

    Answer: 3
     */
    int x = 5;
    float y = 10.3;
    printf("hello %d bye %f", x, y);
}

/*
Considering the following code:
 */

struct emp {
    int id;
    char *name;
};

struct emp john;

void question6() {
    /*
    Which of the following lines are correct?

    1-
    int a = 1;
    char b[] = "John Doe";
    john.id = b;
    john.name = a;
    printf ("%d, %s", john.id, john.name);

    2-
    int a = 1;
    char b[] = "John Doe";
    john[0].id = a;
    john[0].name = b;
    printf ("%d, %s", john[0].id, john[0].name);

    3-
    int a = 1;
    char b[] = "John Doe";
    emp.id = a;
    emp.name = b;
    printf ("%d, %s", emp.id, emp.name);

    4-
    int a = 1;
    char b[] = "John Doe";
    john.id = a;
    john.name = b;
    printf ("%d, %s", john.id, john.name);

    Answer: 4
     */
    int a = 1;
    char b[] = "John Doe";
    john.id = a;
    john.name = b;
    printf("%d, %s", john.id, john.name);
}

/*
Which of the following programs are correct in C?
(select all that apply)
*/

typedef int booOoolean;
typedef char FlagType;

void question7program1() {
    booOoolean x = 0;
    int counter;
    FlagType xx = 'A'; // comment
}

typedef enum { false, true } booOooolean;

typedef enum { Sun, Mon, Tue, Wed, Thu, Fri, Sat } days;

void question7program2() {
    booOooolean a = false;
    int counter;
    days x = Mon, y = Fri;
    while (x != y) x++;
}

typedef enum { red, amber, green } traffic_light;

void question7program3() {
    traffic_light x = red;
    while (1)
        switch (x) {
            case amber:
                x = red;
                printf("R");
                break;
            case red:
                x = green;
                printf("G");
                break;
            case green:
                x = amber;
                printf("A");
                break;
        }
}

/*
Answer: 1, 2, 3
 */

void question8() {
    /*
     Which of the followings are correct declarations of the main() method (i.e., the entry point of a program)?

     1-
     int main() {
        return 0;
     }

     2-
     public static void main (string[] argv) {
     }

     3-
     void main() {
     }

     4-
     void main (int argc, char *argv[]) {
     }

     5-
     int main (int argc, char *argv[]) {
        return 0;
     }

     6-
     main() {
        return 0;
     }

     Answer: 1, 3, 4, 5, 6
     */
}

void question9() {
    /*
    Which of the following lines print a "-15" on the screen?

    1-
    int x = -15;
    printf("%p", &x);

    2-
    int x = -15;
    int *point = &x;
    printf("%d", &x);

    3-
    int x = -15;
    int *point = &x;
    printf("%p", point);

    4-
    int x = -15;
    int *point = &x;
    printf("%d", *point);

    Answer: 4
     */
    int x = -15;
    int *point = &x;
    printf("%d", *point);
}

void pass_array(int *arr);

void question10() {
    /*
    In C, when you pass an array as a parameter to a function, what is actually passed?

    1- All the values in array.
    2- The value of the first element in the array.
    3- The address of the first element in the array.
    4- An array cannot be passed as a parameter to a function.

    Answer: 3
     */
    int arr[] = {4, 5, 6};
    pass_array(arr);
}

void pass_array(int *arr) {
    printf("arr\t=> %p", arr);
    printf("\n");
    printf("&arr[0] => %p", &arr[0]);
}

int main() {
    question10();
}
