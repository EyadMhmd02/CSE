package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.stopwatch;

public class Stopwatch {
    private long start;

    public Stopwatch() {
        this.start = System.currentTimeMillis();
    }

    private long elapsedTimeMillis() {
        long now = System.currentTimeMillis();
        return now - start;
    }

    private long millis() {
        return elapsedTimeMillis() % 1000;
    }

    private long seconds() {
        return (elapsedTimeMillis() % (1000 * 60)) / 1000;
    }

    private long minutes() {
        return (elapsedTimeMillis() % (1000 * 60 * 60)) / (1000 * 60);
    }

    public long hours() {
        return elapsedTimeMillis() / (1000 * 60 * 60);
    }

    public void reset() {
        start = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        long hours = elapsedTimeMillis() / (1000 * 60 * 60);
        long minutes = (elapsedTimeMillis() % (1000 * 60 * 60)) / (1000 * 60);
        long seconds = (elapsedTimeMillis() % (1000 * 60)) / 1000;
        long milliseconds = elapsedTimeMillis() % 1000;

        return String.format("Elapsed time: %02d:%02d:%02d:%03d\n", hours, minutes, seconds, milliseconds);
    }
}
