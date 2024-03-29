package y1.s2.Modules.Module3.Polymorphism.whyuseful;

import java.util.ArrayList;

class BadWindowManager {
    private ArrayList<Shape> shapes;

    public void redrawWindow() {
        for (Shape shape : shapes) {
//            if (shape instanceof Square) drawSquare((Square) shape);
//            else if (shape instanceof Rectangle) drawRectangle((Rectangle) shape);
            /*else if (shape instanceof Oval) drawOval((Oval) shape);
            else if (shape instanceof Line) drawLine((Line) shape);
            else if (shape instanceof Point) drawPoint((Point) shape);
            else if (shape instanceof Triangle) drawTriangle((Triangle) shape);
            else if (shape instanceof A) draw((A) shape);
            else if (shape instanceof B) draw((B) shape);
            else if (shape instanceof C) draw((C) shape);
            else if (shape instanceof D) draw((D) shape);
            else if (shape instanceof E) draw((E) shape);*/
        }
    }

    private void drawSquare(Square pSquare) {
        // ...
    }

    private void drawRectangle(Rectangle pRect) {
        // ...
    }

/*    private void drawOval(Oval pOval) {
        // ...
    }

    private void drawLine(Line pLine) {
        // ...
    }

    private void drawPoint(Point pPoint) {
        // ...
    }

    private void drawTriangle(Triangle pTriangle) {
        // ...
    }

    private void drawA(A pA) {
        // ...
    }

    private void drawB(B pB) {
        // ...
    }

    private void drawC(C pC) {
        // ...
    }

    private void drawD(D pD) {
        // ...
    }

    private void drawE(E pE) {
        // ...
    }*/
}

