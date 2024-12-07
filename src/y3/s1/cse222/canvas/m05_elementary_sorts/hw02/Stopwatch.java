package y3.s1.cse222.canvas.m05_elementary_sorts.hw02;

/**
 * A utility class to measure the running time (wall clock) of a program.
 *
 * Improved over textbook implementation by switching to nanoTime.
 *
 * @author Acuna
 * @author Sedgewick
 * @author Wayne
 * @version 1.0
 */
public class Stopwatch {

    private final long start;

    /**
     * Initializes a new stopwatch.
     */
    public Stopwatch() {
        start = System.nanoTime();
    }

    /**
     * Returns the elapsed CPU time (in seconds) since the stopwatch was created.
     *
     * @return elapsed CPU time (in seconds) since the stopwatch was created
     */
    public double elapsedTime() {
        long now = System.nanoTime();
        return (now - start) / 1000000000.0;
    }
} 
