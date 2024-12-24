//
// Created by eyado on 12/12/2024.
//

#include <iostream>
using namespace std;

/**
What is the correct syntax to declare a pointer in C?
A. int ptr;
B. int* ptr;
C. int ptr*;
D. int ptr[];

Answer: B
Explanation: A pointer in C is declared using the * symbol. For example, int* ptr; declares a pointer to an integer. Option A declares a normal integer, C is syntactically incorrect, and D declares an array.
 */
void q1() {
    int *ptr;
}

/**
Which header file is required to use the printf function?
A. stdio.h
B. stdlib.h
C. string.h
D. math.h

Answer: A
Explanation: The printf function is part of the C Standard Input and Output Library, which is declared in the stdio.h header file.
 */
void q2() {
}

/**
What does the following C statement do?

int arr[5] = {0};

A. Declares an array of size 5 with all elements set to 0.
B. Declares an array of size 5 but does not initialize the elements.
C. Declares an array of size 5 with the first element set to 0.
D. None of the above.

Answer: A
Explanation: When you initialize an array with {0}, the first element is set to 0, and all other elements are also initialized to 0. This is a feature of C's default initialization.
 */
void q3() {
    int size = 10;

    int arr[size] = {4, 1, 2};

    arr[5] = 7;

    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

/**
What is the output of the following code?

#include <stdio.h>
int main() {
    int a = 5, b = 2;
    float c = a / b;
    printf("%f", c);
    return 0;
}
A. 2.000000
B. 2.5
C. 2
D. Compilation Error

Answer: A
Explanation: Since a and b are integers, performing a / b results in integer division, which truncates the decimal part and results in 2. The result is then converted to a float when assigned to c, so it prints 2.000000.
 */
void q4() {
    int a = 5, b = 2;
    float c = a / b;
    printf("%f", c);
}


/**
What does sizeof(int) return in C?
A. Size in bits.
B. Size in bytes.
C. Size depends on the compiler and architecture.
D. None of the above.

Answer: C
Explanation: The size of an int depends on the system's architecture (e.g., 4 bytes on a 32-bit or 64-bit system). The sizeof operator returns the size in bytes, not bits, but the exact size varies.
 */

void q5() {
    printf("sizeof(byte)\t\t=>\t%llu", sizeof(byte));
    printf("\nsizeof(short)\t\t=>\t%llu", sizeof(short));
    printf("\nsizeof(int)\t\t=>\t%llu", sizeof(int));
    printf("\nsizeof(long)\t\t=>\t%llu", sizeof(long));
    printf("\nsizeof(long long)\t=>\t%llu", sizeof(long long));
    printf("\nsizeof(float)\t\t=>\t%llu", sizeof(float));
    printf("\nsizeof(double)\t\t=>\t%llu", sizeof(double));
    printf("\nsizeof(long double)\t=>\t%llu", sizeof(long double));
    printf("\nsizeof(char)\t\t=>\t%llu", sizeof(char));
    printf("\nsizeof(bool)\t\t=>\t%llu", sizeof(bool));
}

/**
Which of the following is a valid class declaration in C++?
A. class MyClass { };
B. class MyClass();
C. class MyClass { };;
D. class MyClass { public: void func() };

Answer: A
Explanation: Option A is a valid and minimal class declaration in C++. Option B has incorrect syntax, Option C has an extra semicolon, and Option D misses the required semicolon after the closing brace.
 */

class MyClass { };

void q6() {

}

/**
What is the difference between struct in C and class in C++?
A. struct has private members by default.
B. class has private members by default.
C. class does not support inheritance.
D. struct cannot have functions.

Answer: D
 */
void q7() {

}

/**
What is the output of the following code?

#include <iostream>
using namespace std;
int main() {
    int x = 10;
    int *ref = &x;
    printf("%d\n", x);
    printf("%p\n", ref);
    printf("%d\n", *ref);
    return 0;
}

A)
10
(address of x in memory)
(address of x in memory)

B)
10
(address of x in memory)
10

C)
10
10
10

D)
Compilation Error

Answer: B
 */
void q8() {
    int x = 10;
    int *ref = &x;
    printf("%d\n", x); // 10
    printf("%p\n", ref); // address
    printf("%d\n", *ref); // 10
}

/**
What is a virtual function in C++?
A. A function that is not implemented.
B. A function that can be overridden in a derived class.
C. A function that cannot be inherited.
D. None of the above.

Answer: B
Explanation: A virtual function is declared using the virtual keyword and allows a derived class to override it for runtime polymorphism.
 */
void q9() {

}

int main() {
    q8();
}
