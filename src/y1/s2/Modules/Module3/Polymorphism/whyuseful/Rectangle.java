package y1.s2.Modules.Module3.Polymorphism.whyuseful;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int x, int y, int length, int width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }

    public Rectangle(int x, int y) {
        setX(x);
        setY(y);
    }

    @Override
    public void printName() {
        System.out.println("Rectangle");
    }

    public Rectangle() {

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}