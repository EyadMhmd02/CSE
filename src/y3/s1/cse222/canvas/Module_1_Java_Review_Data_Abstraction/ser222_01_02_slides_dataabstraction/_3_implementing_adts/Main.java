package y3.s1.cse222.canvas.ser222_01_02_slides_dataabstraction._3_implementing_adts;

class Main {
    public static void main(String[] args) {
        ImmutableExample i1 = new ImmutableExample(7);
        System.out.println(i1.getX());
    }
}
