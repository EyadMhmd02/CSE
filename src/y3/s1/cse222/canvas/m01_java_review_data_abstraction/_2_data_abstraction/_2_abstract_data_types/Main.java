package y3.s1.cse222.canvas.m01_java_review_data_abstraction._2_data_abstraction._2_abstract_data_types;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(3, 5);
        Point2D p2 = new Point2D(3, 5);

        if (p1.equals(p2)) {
            System.out.println("Dist is 0.");
        } else {
            System.out.println("Dist is " + p1.distanceTo(p2) + ".");
        }

        System.out.println(p1.x());
        System.out.println(p2.theta());

        // as you can see we don't care about how the class is implemented.

//        ArrayList<String> n = new ArrayList<>();
//
//        n.add("ali");
//        n.add("veli");
//        n.add("hasan");
//        n.add("muhammad");
//        n.add("ahmed");
//
//        System.out.println(n.get(2));

    }
}
