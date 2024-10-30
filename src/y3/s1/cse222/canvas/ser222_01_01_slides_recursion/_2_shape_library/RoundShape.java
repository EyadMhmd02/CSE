package y3.s1.cse222.canvas.ser222_01_01_slides_recursion._2_shape_library;

abstract class RoundShape {
    private double radius;

    public RoundShape(double r) {
        radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public abstract double getArea();

    public abstract double getVolume();

}
