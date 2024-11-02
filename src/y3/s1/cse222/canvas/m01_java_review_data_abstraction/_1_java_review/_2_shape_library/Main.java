package y3.s1.cse222.canvas.m01_java_review_data_abstraction._1_java_review._2_shape_library;

/**
 * Problem: Need a way to define geometric shapes in a program.
 * <p>
 * ▪ In particular, shapes with a radius (state).
 * <p>
 * ▪ Shapes should also be able to compute area and volume (exhibit behavior).
 * <p>
 * ▪ One way to accomplish this aim is to implement shapes as classes.
 * <p>
 * ▪ Organization of the classes should follow their concept(s) in terms of OOP principles.
 */
class Main {
    public static void main(String[] args) {
        Sphere s = new Sphere(5.3);
        System.out.println(s.getArea());
        System.out.println(s.getVolume());
    }
}
