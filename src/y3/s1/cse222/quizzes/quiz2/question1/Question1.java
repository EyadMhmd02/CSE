package y3.s1.cse222.quizzes.quiz2.question1;

import java.util.Arrays;

/**
 * Suppose that you had program written in Java that maintain a list of courses that a student was taking, and that program was exhibiting issues from reference types. Which of the follow would most likely indicate that issue?
 *<p>
 * The program crashes immediately with a null pointer exception.
 *<p>
 * The program prompts the user for input, but instead of waiting, instantly reads a null string and continues.
 *<p>
 * The program crashes immediately with an error message about allocating memory for a new Student object.
 * <p>
 * Even after adding ten unique classes, when displaying everything, it shows the same ten classes.
 * */

class Question1 {
    public static void main(String[] args) {
        // create an array of same student
        Student[] students = new Student[10];

        // create a student object
        Student student = new Student(1, "John", "Computer Science", 2);

        // populate the array with the same student object
        Arrays.fill(students, student);

        // display the array
        for (Student std : students) {
            System.out.println(std);
        }
    }
}
