package y3.s1.cse222.canvas.m01_java_review_data_abstraction._1_java_review._2_shape_library;

class Sphere extends RoundShape {
    public Sphere(double r) {
        super(r);
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double getVolume() {
        return ((double) 4 / 3) * Math.PI * Math.pow(getRadius(), 3);
    }
}
