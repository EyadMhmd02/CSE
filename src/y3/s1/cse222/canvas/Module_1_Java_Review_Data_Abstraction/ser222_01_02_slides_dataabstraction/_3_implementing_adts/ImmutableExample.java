package y3.s1.cse222.canvas.ser222_01_02_slides_dataabstraction._3_implementing_adts;

class ImmutableExample {
    private final int x;

    public ImmutableExample(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
