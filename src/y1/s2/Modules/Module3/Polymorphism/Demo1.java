package y1.s2.Modules.Module3.Polymorphism;

import y1.s2.Modules.Module2.cse205_src_mod_02.inheritance_section_16.Square;
import y1.s2.Modules.Module2.cse205_src_mod_02.inheritance_section_01.Rectangle;

public class Demo1 {
    public void someMethod(Rectangle pRect) {
        // ...
    }

    public void someOtherMethod() {
        Rectangle rect = new Rectangle(10, 20, 30, 40);
        someMethod(rect);
        Square square = new Square(10, 20, 30);
//        someMethod(square); // Because Square "is a" Rectangle
    }

    // converse is not allowed
//    public void someMethod(Square pSquare) {
//        // ...
//    }
//
//    public void someOtherMethod() {
//        Rectangle rect = new Rectangle(10, 20, 30, 40);
//        someMethod(rect); // Syntax error. A Rectangle cannot substitute for a Square
//    }


}
