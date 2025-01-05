package y3.s1.cse222.quizzes.quiz_midterm;

import java.util.Arrays;

public class QuizMidterm {
    /*
### **Answer The Following Questions**

#### **Question 1:**

1. **In a stack, if a user tries to remove an element from an empty stack it is called...**
   a. Underflow
   b. Empty collection
   c. Overflow
   d. Garbage collection

   **Answer:** a. Underflow

   Explanation: Underflow occurs when trying to remove an element from an empty stack, as there are no elements to remove.

---

2. **Pushing an element into stack already having five elements and stack size of 5, then stack becomes...**
   a. Overflow
   b. Crash
   c. Underflow
   d. User flow

   **Answer:** a. Overflow

   Explanation: Overflow happens when trying to push an element into a stack that has already reached its maximum capacity.

---

3. **A linear collection of data elements where the linear node is given by means of pointer is called?**
   a. Node list
   b. Linked list
   c. Primitive list
   d. Unordered list

   **Answer:** b. Linked list

   Explanation: A linked list is a data structure where each element (node) contains a pointer to the next node in the sequence.

---

4. **In a generic stack implementation, what does the term "generic" mean?**
   a. The stack can only store integers.
   b. The stack can only store strings.
   c. The stack can store elements of any data type.
   d. The stack can store elements of a specific data type chosen at runtime.

   **Answer:** c. The stack can store elements of any data type.

   Explanation: Generic means the stack is implemented to work with any data type, increasing flexibility and reusability.

---

5. **Linked list is considered as an example of a type of memory allocation...**
   a. Dynamic
   b. Static
   c. Compile
   d. Heap

   **Answer:** a. Dynamic

   Explanation: In a linked list, memory is allocated dynamically for each node as needed, unlike static memory allocation.

---

6. **In the context of supporting iteration on a stack, what does the term "iterator" refer to?**
   a. An algorithm for sorting elements.
   b. A method to remove elements from the stack.
   c. An object used to traverse the elements of the stack.
   d. A data structure to store elements temporarily.

   **Answer:** c. An object used to traverse the elements of the stack.

   Explanation: Iterators are used to go through elements of a collection (like a stack) without exposing its internal structure.

---

7. **If the input to selection sort is
A = [7, 23, 25, 13, 2, 12, 3, 16, 43] then after two swaps A =...**
   a. [2, 13, 25, 3, 7, 12, 16, 43]
   b. [2, 3, 25, 13, 7, 12, 23, 16, 43]
   c. [2, 23, 25, 13, 7, 12, 16, 43]
   d. [7, 23, 25, 13, 2, 12, 3, 16, 43]

   **Answer:** b. [2, 3, 25, 13, 7, 12, 23, 16, 43]

   Explanation: In the first swap, the smallest element (2) is placed at the first position. In the second swap, the second smallest element (3) is placed in the second position.

---

8. **Which of the following best describes the time complexity of the selection sort algorithm for sorting an array of size n?**
   a. O(n)
   b. O(n log n)
   c. O(n²)
   d. O(log n)

   **Answer:** c. O(n²)

   Explanation: Selection sort involves two nested loops: one to find the minimum and another to place it, leading to O(n²) time complexity.

---

9. **If the given array is already sorted in ascending order, how many swaps will the selection sort algorithm perform?**
   a. 0
   b. 1
   c. n-1
   d. n

   **Answer:** c. n-1

---

10. **The number of comparisons in the selection sort algorithm is...**
    a. O(n)
    b. O(log n)
    c. O(n²)
    d. O(n log n)

    **Answer:** c. O(n²)

    Explanation: In selection sort, for each element, comparisons are made with the remaining elements in the array, leading to O(n²) comparisons.

---

11. **What is the worst-case time complexity of the insertion sort algorithm?**
    a. O(n)
    b. O(n log n)
    c. O(n²)
    d. O(1)

    **Answer:** c. O(n²)

    Explanation: In the worst case (when the array is sorted in reverse order), each element must be compared with all previous elements, resulting in O(n²).

---

12. **In insertion sort, the sorted subarray...**
    a. Starts with the smallest element.
    b. Starts with the largest element.
    c. Starts with the median element.
    d. Starts with a single element.

    **Answer:** a. Starts with the smallest element.

    Explanation: In insertion sort, the sorted part grows incrementally by picking the next smallest element and inserting it into the correct position.

---

13. **In the insertion sort algorithm, how many comparisons are made to sort an already sorted array of size n?**
    a. n-1
    b. n
    c. n/2
    d. (n²-n)/2

    **Answer:** a. n-1

    Explanation: If the array is already sorted, each element is compared once with its preceding element, leading to n-1 comparisons.

---

14. **Shell sort is an extension of which sorting algorithm?**
    a. Merge sort
    b. Insertion sort
    c. Quick sort
    d. Selection sort

    **Answer:** b. Insertion sort

    Explanation: Shell sort improves upon insertion sort by comparing elements separated by a gap, reducing the number of swaps in larger datasets.

---

15. **Which of the following functions grows the fastest as n increases to infinity?**
    a. n²
    b. 2ⁿ
    c. log n
    d. n!

    **Answer:** d. n!

    Explanation: Factorial functions (like n!) grow significantly faster than polynomial (n²), logarithmic, or exponential functions.

---

16. **If an algorithm has a time complexity of O(n²), what does this imply?**
    a. The algorithm always takes exactly n² operations to complete.
    b. The algorithm takes at most n² operations to complete.
    c. The algorithm takes at least n² operations to complete.
    d. The algorithm takes exactly n² operations to complete.

    **Answer:** b. The algorithm takes at most n² operations to complete.

    Explanation: O(n²) represents the upper bound, indicating that the algorithm will not perform more than n² operations for any input size n.

---

#### **Question 2:**

**1. Consider the following array:
[7, 23, 25, 13, 2, 12, 3].
Show a trace of execution for insertion sort.**
   The trace should include the initial state of the array, followed by the array's state after each pass is made.

**Answer:**
**Initial Array:** [7, 23, 25, 13, 2, 12, 3]
**Pass 1:** [7, 23, 25, 13, 2, 12, 3] (No change)
**Pass 2:** [7, 23, 25, 13, 2, 12, 3] (No change)
**Pass 3:** [7, 13, 23, 25, 2, 12, 3] (Insert 13 into position)
**Pass 4:** [2, 7, 13, 23, 25, 12, 3] (Insert 2 into position)
**Pass 5:** [2, 7, 12, 13, 23, 25, 3] (Insert 12 into position)
**Pass 6:** [2, 3, 7, 12, 13, 23, 25] (Insert 3 into position)

**Final Sorted Array:** [2, 3, 7, 12, 13, 23, 25]
    */

    public static void main(String[] args) {
        int[] array = {3, 8, 23, 18, 15, 16};
        System.out.println("**Initial Array:** " + Arrays.toString(array));

        insertionSortWithTrace(array);

        // Print the final sorted array
        System.out.println("\n**Final Sorted Array:** " + Arrays.toString(array));
    }

    private static void insertionSortWithTrace(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Check if any changes will be made
            boolean isChanged = false;

            // Move elements of the sorted part that are greater than key
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
                isChanged = true;
            }

            // Place the key in the correct position
            array[j + 1] = key;

            // Print the array after each pass
            System.out.print("**Pass " + i + ":** " + Arrays.toString(array));

            // Add explanation
            if (isChanged) {
                System.out.println(" (Insert " + key + " into position)");
            } else {
                System.out.println(" (No change)");
            }
        }
    }
}

