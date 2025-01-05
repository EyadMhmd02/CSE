package y3.s1.cse222.quizzes.mod01cairn.question3;


/**
 * (Assume the integer-based Counter class in the book also implements the IncrementCounter interface.)
 * From the perspective of someone choosing to use AnotherCounter versus Counter in a larger program, is there a difference? Explain.  Be sure to consider both a functionality standpoint, and a performance standpoint, in your answer.
 * */
class Main {
    public static void main(String[] args) {
        Counter counter = new Counter("Counter");
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println(counter); // 3

        AnotherCounter anotherCounter = new AnotherCounter("AnotherCounter");
        anotherCounter.increment();
        anotherCounter.increment();
        anotherCounter.increment();
        System.out.println(anotherCounter); // 3

        // There is no difference in functionality and performance.

        // Because both classes implement the same interface, they have the same methods.

        // And both classes have the same implementation of the increment method.

        // So, the only difference is the name of the class.
    }
}
