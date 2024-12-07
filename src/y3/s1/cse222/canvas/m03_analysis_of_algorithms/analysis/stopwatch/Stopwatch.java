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

    private long hours() {
        return (elapsedTimeMillis() % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
    }

    private long days() {
        return (elapsedTimeMillis() % (1000L * 60 * 60 * 24 * 365)) / (1000 * 60 * 60 * 24);
    }

    public void reset() {
        start = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        String days = ("000" + days()).substring(Long.toString(days()).length());
        String hours = ("00" + hours()).substring(Long.toString(hours()).length());
        String minutes = ("00" + minutes()).substring(Long.toString(minutes()).length());
        String seconds = ("00" + seconds()).substring(Long.toString(seconds()).length());
        String millis = ("000" + millis()).substring(Long.toString(millis()).length());
        return String.format("Elapsed time:\t%s:%s:%s:%s:%s\n", days, hours, minutes, seconds, millis);
    }
}
