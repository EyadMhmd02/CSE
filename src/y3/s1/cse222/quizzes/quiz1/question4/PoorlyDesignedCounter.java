package y3.s1.cse222.quizzes.quiz1.question4;

/**
 * Sedgewick and Wayne discuss 7 basic ways an API may be poorly designed (p97; online). For example, an API may be:
 *
 * "Too hard to implement, making it difficult or impossible to develop."
 * "Too hard to use, leading to complicated client code."
 * "Too narrow, omitting methods that clients need."
 * "Too wide, including a large number of methods not needed by any client."
 * "Too general, providing no useful abstractions."
 * "Too specific, providing an abstraction so diffuse as to be useless."
 * "Too dependent on a particular representation, therefore not freeing client code from the details of the representation."
 * Review PoorlyDesignedCounter for any of these issues. Identify at least two issues in PoorlyDesignedCounter, and describe how this class demonstrates each of them. (There are multiple correct analyses - any with a correct explanation will receive credit).
 * */

interface PoorlyDesignedCounter {
    /**
     * Sets the value of the counter to the parameter.
     */
    void setCounter(int counter);

    /**
     * Increments the counter by one.
     */
    void increment();

    /**
     * Increments the counter by 42.
     */
    void increment42(); // Too specific, providing an abstraction so diffuse as to be useless.

    /**
     * Returns the number of increments since creation.
     */
    int tally();

    /**
     * Returns an array of all values returned by tally.
     */
    int[] tallyHistory(); // Too hard to implement, making it difficult or impossible to develop.

    /**
     * Returns a string representation that counts number of increments and the ID of the counter.
     */
    String toString();
}
