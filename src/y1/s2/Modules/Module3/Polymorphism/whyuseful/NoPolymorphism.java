package y1.s2.Modules.Module3.Polymorphism.whyuseful;

import java.util.ArrayList;

public class NoPolymorphism {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle());
        shapes.add(new Square());
        shapes.add(new Rectangle());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Rectangle());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Rectangle());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Rectangle());
        shapes.add(new Square());

        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).printName();
        }
    }
}