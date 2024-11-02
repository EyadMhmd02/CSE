package y3.s1.cse222.canvas.m01_java_review_data_abstraction._2_data_abstraction._3_implementing_adts;

class Main {
    public static void main(String[] args) {
        ImmutableExample i1 = new ImmutableExample(7);
        System.out.println(i1.getX());
    }
}
