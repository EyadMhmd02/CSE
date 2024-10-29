package y1.s2.Modules.Module3.Polymorphism.whyuseful;

import java.util.ArrayList;

class WindowManager {
    private ArrayList<Shape> shapes;

    public void redrawWindow() {
        for (Shape shape : shapes) {
            shape.printName(); // This is a polymorphic method call
        }
    }
}
