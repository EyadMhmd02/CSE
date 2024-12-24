//
// Created by eyado on 19/12/2024.
//

#include <iostream>
using namespace std;

void q1() {
    /* The scope resolution operator (::) is used to overload a function or an operator in object-oriented paradigm.

     Answer: false
     */
}

/*
Which of the following options is the code in C++ for

a) A class Student that inherits from a class Person.

b) A constructor in Student that calls (is able to call) a constructor in Person

When the body of the method is not relevant to answer the question, it has been replaced for a comment  // code

1-
class Person {
  public:
    Person() { //code
    }
    Person(char* lName, int year) { // code
    }
  private:
    char* lastName;
    int yearOfBirth;
};

class Student : public Person {
  public:
    Student() {
      //code
    }
    Student(char* lName, int year, char* univer) :Person(lName, year) {
      //code
    }
  private:
    char *university;
};

2-
class Person {
  public:
    Person() {
      //code
    }
    Person(char* lName, int year) {
      // code
    }
  private:
    char* lastName;
    int yearOfBirth;
};

class Student extends Person {
  public:
    Student() {
      //code
    }
    Student(char* lName, int year, char* univer) {
      Person(lName, year);
      //code
    }
  private:
    char *university;
};

3-
class Person {
  public:
    Person() {
      //code
    }
    Person(char* lName, int year) : Student (char* lName, int year, char* univer) {
      // code
    }
  private:
    char* lastName;
    int yearOfBirth;
};

class Student : public Person {
public:
  Student() { //code
  }
  Student(char* lName, int year, char* univer) { //code
  }
private:
  char *university;
};

4-
class Person {
  public:
    Person() {
      //code
    }
    Person(char* lName, int year) {
      // code
    }
  private:
    char* lastName;
    int yearOfBirth;
};

class Student : public Person {
  public:
    Student() {
      //code
    }
    Student(char* lName, int year, char* univer) {
      Person(lName, year);
      //code
    }
  private:
    char *university;
};
 */

class Person {
public:
    Person() {
        //code
    }

    Person(char *lName, int year) {
        // code
    }

private:
    char *lastName;
    int yearOfBirth;
};

class Student : public Person {
public:
    Student() {
        //code
    }

    Student(char *lName, int year, char *univer) : Person(lName, year) {
        //code
    }

private:
    char *university;
};

void q2() {
    // Answer: 1
}

/*
Given the following class definition:
*/

class Rectangle {
private:
    int width, height;

public:
    void set_values(int, int);

    int area();
};

void Rectangle::set_values(int width, int height) {
    this->width = width;
    this->height = height;
}


/*
Which of the following instruction(s) create an array of 2 Rectangles and initialize them (the 2 Rectangles) with values. Select ALL the possible options.

1-
Rectangle a[2];
a[0].set_values(1,1);
a[1].set_values(2,2);

2-
Rectangle *a[2];
a[0] = new Rectangle;
a[0]->set_values(1,1);
a[1] = new Rectangle;
a[1]->set_values(2,2);

3-
Rectangle *a = new Rectangle[2];
a[0]->set_values(1,1);
a[1]->set_values(2,2);

4-
Rectangle a = new Rectangle[2];
a[0].set_values(1,1);
a[1].set_values(2,2);
 */
void q3() {
    // Rectangle a[2];
    // a[0].set_values(1, 1);
    // a[1].set_values(2, 2);

    Rectangle *a[2];
    a[0] = new Rectangle;
    a[0]->set_values(1, 1);
    a[1] = new Rectangle;
    a[1]->set_values(2, 2);
}

/*
Answer: 1, 2
 */

/*
Which of the following classes creates and initializes correctly an static variable in C++?

1-
class Something {
public:
static int v;
};
Something::v = 1;

2-
class Something {
public:
static int v;
};
int Something::v = 1;

3-
class Something {
public:
static int v;
};
int v = 1;

4-
class Something {
public:
static int v;
};
v = 1;
 */

class Something {
public:
    static int v;
};

int Something::v = 1;

void q4() {
    /*
     Answer: 2
     */
}

/*
Running the following program.

How many times will the message "good bye!" be printed on the screen?
 */

class CSE {
public:
    CSE(int v) {
        cout << "constructor\n";
    }

    void add(int v) {
        cout << "adding\n";
    }

    int remove() {
        cout << "removing\n";
        return 0;
    }

    ~CSE() {
        cout << "good bye!\n";
    }
};

void q5() {
    CSE q1(5);
    CSE *q2 = new CSE(5);
    q1.add(2);
    q1.add(8);
    q1.remove();
    q2->remove();
    delete q2;
}

/* Answer: 2 times*/

/*
In the following code, how many times the destructor of the class "Base" is executed?
 */
class Base {
public:
    Base(int n) {
        cout << "Base Constructor\n";
    }

    void function() {
        cout << "function\n";
    }

    ~Base() {
        cout << "Base destructor\n";
    }
};

class Derived : public Base {
public:
    Derived(int n) : Base(n) {
        cout << "Derived Constructor\n";
    }

    ~Derived() {
        cout << "Derived destructor\n";
    }
};

void q6() {
    Derived myPQ1(50);
    myPQ1.function();
    Derived *myPQ2 = new Derived(50);
    myPQ2->function();
    delete myPQ2;
}

/*
The principle behind the object-oriented paradigm consists of a number of programming concepts, which does not include the following:

1- Classes
2- Polymorphism
3- Pointers
4- Arrays
5- Inheritance
 */
void q7() {
    /* Answer: 4 */
}

/*
In C++, implementations of member functions cannot be inside the class definition (for short functions) or outside of the class definition.
True
False
 */
void q8() {
    /* Answer: False */
}

/*
Which lines in C++ are equivalent to this code in Java

int x = 5;
char a = 'A';
System.out.print( "Hello " + x + ", " + a );

1-
int x = 5;
char a = 'A';
cout << "Hello %d , %c" << x << a;

2-
int x = 5;
char a = 'A';
cout >> "Hello " >> x >> ", " >> a;

3-
int x = 5;
char a = 'A';
cout << "Hello " << x << ", " << a;

4-
int x = 5;
char a = 'A';
cout ("Hello %d , %c", x , a );
 */
void q9() {
    int x = 5;
    char a = 'A';
    cout << "Hello " << x << ", " << a;
}
/*
Answer: 3
*/

/*
The following declarations in the standard C++ library to be accessed in an unqualified manner (without the std::prefix)

1-
#include <iostream.h>

2-
using namespace iostream;

3-
using namespace std;

4-
#include <iostream>
 */
void q10() {

}

int main() {
    q9();
}
