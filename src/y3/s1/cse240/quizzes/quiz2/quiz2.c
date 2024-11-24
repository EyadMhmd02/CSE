//
// Created by eyado on 22/11/2024.
//

#include <stdio.h>

void question1() {
    /*
    What is a data type?
    1- a specialized format of organizing and storing data.
    2- a storage location paired with associated symbolic name.
    3- a piece of information.
    4- a set of primary values and the operations defined on these values.

    Answer: 4
    */
}

void question2() {
    /*
    Interpretation of a program is the direct execution of one statement at a time sequentially. True or false?

    Answer: True
    */
}

void question3() {
    /*
     The syntactic structure of imperative programming languages normally include which of the following units?
     1- operators. (+-/*%)
     2- keywords. (int, double, public, void, class, const, final)
     3- identifiers. (name, n, num, sum, arr)
     4- conditional statements. (if-else)
     5- loop statements. (for, while, do-while)
     6- variable declarations. (int n = 6;)

     Answer: 4, 5, 6 (جرامر)
     1, 2, 3 => lexical structure (كلمات)
 */
    double public = 6; // works in C, but not in Java, C++
    int class = 5; // works in C, but not in Java, C++
    char name[] = "Eyad";
}

void question4() {
    /*
    What kind of error is in the following line?

            int a = ((2 * 45) * (6 / 2) hello (4 + 90));

    1- Semantic error.
    2- Syntactic error.
    3- Lexical error

    Answer: 2
    */

    // lexical error example:
    // doubble n = 6.9;

    // syntactic error example:
    // double 6.9 = n;

    // semantic error example:
    double n = 6.9;
    printf("n = %d", n);
}

void question5() {
    /*
    The compiler executes the program. True or false?

    Answer:
    False
    */
}

void question6() {
    /*
    Compilation of program is to execute all the statements of the program completely. True or false?

    Answer:
    False.
*/
}

void question7() {
    /*
    The lexical structure of all programming languages normally include which of the following units?
    1- operators. (+-/*%)
    2- keywords. (int, double, public, void, class, const, final)
    3- identifiers. (name, n, num, sum, arr)
    4- conditional statements. (if-else)
    5- loop statements. (for, while, do-while)
    6- variable declarations. (int n = 6;)

    Answer: 1, 2, 3 (كلمات)
    but 4, 5, 6 => (جرامر)
 */
}

void question8() {
    /*
    During compilation, all the statements of a program in a high-level language are converted (translated) to a low-level language (such as assembly language). True or false?

    Answer: True
*/
}

void question9() {
    /*
    Functional programming language are low-level languages.

    Answer: False
*/
}

void myFunction(int n);

int sum(int x, int y);

void question10() {
    /*
    The semantic structure of imperative programming languages normally includes which of the following validations:
    1- type matching.
    2- division by zero.
    3- a variable name should start with a letter, '$' or '_'.
    4- parameters type in a function declaration should match these in function call.
    5- statement should end with a ';'
    6- unicity.

    Answer: 1, 4, 6
    */

    // type matching error
    int n = 6.9;
    printf("n = %d\n", n);

    // parameters type error
    myFunction("Eyad");

    // unicity error
    int result = sum(2, 3);
    printf("result = %d\n", result);
}

void myFunction(int n) {
}

int sum(int x, int y) {
    return x - y;
}

int main() {
    question10();
}
