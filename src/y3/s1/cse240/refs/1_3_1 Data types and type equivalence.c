#include <stdio.h>

typedef int salary;
typedef int age;

int main()
{
    /**
    - Data type:
        - set of primary values and the operations defined on these values.
        - used to declare variables ( e.g., integer, real, array of integer, string, etc.).

    - Type checking: ensuring that the data types of operands of an operator are legal or equivalent to the legal type.
    */

    /*
    What types are equivalent?
     */

    //    int i = 3;
    //    short j = 5;
    //    float n, k = 3.0;
    //    n = i + j + k;
    //    printf("n = %f", n);

    /*
    - The type of n is float
    - The type of i + j is int
    - The type of i + j + k is float

    Type equivalence policies:
    1- Structural equivalence: two types are equivalent if they have the same set of values (data range).
    2- Name equivalence: two types are equivalent if they have the same name.
    */

    int i = 0; salary s = 60000; age a = 40;
    i = s + a; // structural equivalence
    printf("i = %d", i);
}
