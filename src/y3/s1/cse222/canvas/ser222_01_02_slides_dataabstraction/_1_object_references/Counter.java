package y3.s1.cse222.canvas.ser222_01_02_slides_dataabstraction._1_object_references;

class Counter implements IncrementCounter {
    private final String name; // counter name
    private int count = 0; // current value

    public Counter(String id) {
        name = id;
    }

    public void increment() {
        count++;
    }

    public int tally() {
        return count;
    }

    @Override
    public String toString() {
        return count + " " + name;
    }
}
