package y3.s1.cse222.quizzes.quiz1.question2;

class AnotherCounter implements IncrementCounter {
    private final String name;
    private char count = '0';

    public AnotherCounter(String id) {
        this.name = id;
    }

    @Override
    public void increment() {
        count++;
    }

    @Override
    public int tally() {
        return count;
    }

    @Override
    public String toString() {
        return count + " " + name;
    }
}
