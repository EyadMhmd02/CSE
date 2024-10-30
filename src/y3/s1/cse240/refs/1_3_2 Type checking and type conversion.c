#include <stdio.h>

typedef int salary;
typedef int age;

int main() {
  /*

  - Strongly-typed languages:  require that variables be declared with a specific type.
    - Weakly-typed languages:    allow variables to be declared without a type.
    - Implicit conversions:      performed by the language, without programmer's intervention.
    - Explicit conversions:      performed by the programmer. (cast operator)
    - Type equivalence:          two types are equivalent if they have the same representation and semantics.
    - Type compatibility:        two types are compatible if they can be converted to each other.
    - Type conversion:           the process of changing the type of a value.
    - Type checking:             the process of verifying that a program's types are correct.

    */

  salary s = 60000;
  age a = 25;

  int i = 3;     // 00000000 00000000 00000000 00000011

                 // sign        fraction
                 // ↓           ↓
  float j = 3.0; // 01000000 00011000 00000000 00000000
                 //  ↑
                 //  exponent

  i = (int)s + (int)a; // explicit conversion (typecasting)
}