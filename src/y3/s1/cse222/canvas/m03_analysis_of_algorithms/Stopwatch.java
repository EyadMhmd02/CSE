package y3.s1.cse222.canvas.m03_analysis_of_algorithms;

public class Stopwatch {
    private final long start;

    public Stopwatch() {
        this.start = System.currentTimeMillis();
    }

    public double elapsedTimeMillis() {
        long now = System.currentTimeMillis();
        return (double) now - start;
    }

    public double elapsedTimeSeconds() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

    @Override
    public String toString() {
        return "Elapsed time: " + elapsedTimeMillis() + " ms (" + elapsedTimeSeconds() + " s)\n";
    }
}
