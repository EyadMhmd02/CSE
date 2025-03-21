package y3.s1.cse222.canvas.m01_java_review_data_abstraction._1_java_review._2_shape_library;

class Cone extends RoundShape {
    private double height;

    public Cone(double r, double h) {
        super(r);
        height = h;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * (getRadius() + Math.sqrt(Math.pow(this.height, 2) + Math.pow(getRadius(), 2)));
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * (this.height / 3);
    }
}
