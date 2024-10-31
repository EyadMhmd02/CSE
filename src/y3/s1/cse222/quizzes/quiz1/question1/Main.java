package y3.s1.cse222.quizzes.quiz1.question1;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

/**Module 1: Short Answer*/

class Main {
    /**
     * Write a method that takes in an array of Point2D objects, and then analyzes the dataset to find points that are close together. Be sure to review the Point2D API. In your method, if the distance between any pair of points is less than 10, display the distance and the (x,y)s of each point. For example, "The distance between (3,5) and (8,9) is 6.40312." The complete API for the Point2D ADT may be viewed at <a href="http://www.ime.usp.br/~pf/sedgewick-wayne/algs4/documentation/Point2D.htmlLinks">...</a> to an external site.. Do not compare a point to itself! Try to write your program directly from the API - do not review the ADT's source code. (Don't worry too much about your answer compiling - focus on using an API from its documentation.)
     *
     * Your answer should include only the method you wrote, do not write a complete program.
     * */

    public static void main(String[] args) {
        Point2D[] points = initArray();
        populateArray(points);
        findClosePoints(points);
    }

    /**
     * create an array of Point2D objects
     * */
    private static Point2D @NotNull [] initArray() {
        return new Point2D[10];
    }

    /**
     * initialize the array with random points
     * */
    private static void populateArray(Point2D[] points) {
        for (int i = 0; i < points.length; i++) {
            Random rand = new Random();
            double x = Math.round(rand.nextDouble(10));
            double y = Math.round(rand.nextDouble(10));
            points[i] = new Point2D(x, y);
        }
    }

    /**
     * analyze the dataset to find points that are close together
     * if the distance between any pair of points is less than 10, display the distance and the (x,y)s of each point
     * */
    private static void findClosePoints(Point2D[] points) {
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].distanceTo(points[j]) < 10) {
                    System.out.println("The distance between " + points[i] + " and " + points[j] + " is " + points[i].distanceTo(points[j]));
                }
            }
        }
    }
}
