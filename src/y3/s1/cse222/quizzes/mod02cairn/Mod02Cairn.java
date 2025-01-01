package y3.s1.cse222.quizzes.mod02cairn;

class Mod02Cairn {
    /*
    Consider the following implementation of a 1D vector class:

    class IntVector {
        private final int[] data;

        public IntVector(int[] vector) {
            if (vector == null)
                throw new IllegalArgumentException();
            data[y] = vector[y];
        }
        // ...

    }

    /*
    Is this class immutable? Answer yes/no, and justify.

    1- Yes - the constructor validates that there is no outside refeference to the data and throws an exception if there is.
    2- Yes - the member variable is set to final and the constructor makes a deep copy.
    3- No - although the member variable is set to final, the constructor does not make a deep copy.
    4- No - the constructor always throws an exception before it is able to copy the data.
    5- No - this would not even compile since there is an assignment to a final variable in the constructor.
    6- Yes - the member variable is set to final and that is sufficient.
        */
    public static void q1() {
        /*Answer: 5*/
    }

    /*
    Select the functions from the following list that could belong to an ADT. (Hint: ask yourself if these methods belong in an idealistic ADT, i.e. one truly meeting the ADT design rule.)

    1-
    Stack ADT

    // add an item
    push(Item item)

    2-
    Stack ADT

    // Sets the stack's internal ArrayList to the given ArrayList
    setContents(ArrayList contents)

    3-
    Stack ADT

    // Sets resize factor for the internal array
    setResizeFactor(float rsf)

    4-
    Stack ADT

    // remove the most recently added item
    pop() throws EmptyStackException

    5-
    Stack ADT

    // remove the most recently added item
    pop() throws ArrayOutOfBoundsException
    */
    public static void q2() {
        /*Answer: 1,4*/
    }

    /*
    It is correct to say that the nodes in a linked list are... (select all that apply)
    1- statically allocated.
    2- recursive data.
    3- dynamically allocated.
    4- contiguously allocated next to each other in main memory.
    */
    public static void q3() {
        /*Answer: 2,3*/
    }

    public static void q4() {
        // q4.jpeg
    }

    /*
    Consider the code below. Assume head points to the beginning of a list and is a class variable:
    */
/*    public void methodA(Node newNode) {
        if(head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }


    public void methodB(Node newNode) {
        Node iter = head;

        if(head == null)
            head = newNode;
        else {
            while(iter.next != null)
                iter = iter.next;
            Iter.next = newNode;
        }
    }*/

    /*
    Suppose the list already has five elements. What code would be faster in terms of adding an element to the list?
    1-    Both are the same because they both add a node to a linked list.
    2-    Method A because you don’t have to traverse through the list.
    3-    Method B because it checks null before spending time to do anything else.
    4-    Method A because it has fewer lines of code.
    5-    Method B because it safely adds a new node to the list using an iterator node.
    */
    public static void q5() {
        /*Answer: 2*/
    }

    /*
    Assume we have an array with contents 1, 5, 3, 7, 8. Those contents could also be stored with a singly linked list (with 1 at the head, no tail variable). When considering performance:
    */
    public static void q6() {
        /*
    It is faster to access 8 in a
    [array]

    It is faster to access 1 in a
    [array]

    Resizing a linked list would typically be
    [faster]
    as compared to an array because a linked list is
    [dynamically allocated]
    */
    }

    /*
    Compare the amount of memory needed to store an array of 100 integers and a linked list containing 100 integers. Which requires less? Or are they the same? Justify.

    1- List - it will be exactly the number of elements until the array.
    2- Array - since that will allow the use of bracket notation.
    3- Array - it will only store the integers, no other references.
    4- List - they are always smaller than arrays.
    5- Same - they store the same number of elements.
     */
    public static void q7() {
        /*Answer: 3*/
    }

    /*
    Which of the following statements are true about generics? Select all that apply.
    1- They allow for different data types in the code without specifying one at the beginning
    2- They are limited to object types, but can still use primitives through wrapper classes
    3- They make compiled files smaller
    4- They makes code reusable
    */

    public static void main(String[] args) {

    }
}
