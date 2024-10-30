package y3.s1.cse222.quizzes.quiz1.question2;


/**
 * In the slides and textbook, one of the examples features a class for counting up. An interface which defines this functionality is given below:
 * */
interface IncrementCounter {

    /**
     * Increments the counter by one.
     */
    void increment();

    /**
     * Returns the number of increments since creation.
     */
    int tally();

    /**
     * Returns a string representation that counts number of increments and the ID of the counter.
     */
    String toString();
}

/// Write a class that implements this interface while not using any number type member variables (e.g., int, float, Integer, etc.). Also do not use a variable that stores the number as a plain string (i.e., "123"). The class should be named AnotherCounter and have a constructor that takes a String parameter to store as an ID.
/// Your answer should include only the class you have written.
