package y3.s1.cse222.canvas.m01_java_review_data_abstraction._2_data_abstraction._3_implementing_adts;

class ImmutableExample {
    private final int x;

    public ImmutableExample(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
