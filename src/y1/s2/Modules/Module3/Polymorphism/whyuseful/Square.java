package y1.s2.Modules.Module3.Polymorphism.whyuseful;

public class Square extends Rectangle {
    private int side;

    public Square() {
        super(0, 0);
    }

    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void printName() {
        System.out.println("Square");
    }
}