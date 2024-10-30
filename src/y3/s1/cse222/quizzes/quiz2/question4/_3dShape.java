package y3.s1.cse222.quizzes.quiz2.question4;

/**
 * The function setPoints
 * needs to be removed
 *  to make the class immutable.
 *  <p>
 * The function getPoints
 * does not need special attention
 *  to make the class immutable.
 *  <p></p>
 * The function getVolume
 * does not need special attention
 *  to make the class immutable.
 *  <p>
 * The function stretch
 * needs to be carefully implemented
 *  to make the class immutable.
 * */

class _3dShape {
    private final _3dPoint[] points;

    public _3dShape(_3dPoint[] points) {
        // ...
        this.points = new _3dPoint[10];
    }

    /** REMOVE */
    // Sets the point array member to the given point array
    public void setPoints(_3dPoint[] points) {
        // ...
    }

    /** SAFE */
    // Returns the point array member
    public _3dPoint[] getPoints() {
        // ...
        return points;
    }

    // Returns the volume of the shape represented by the point
    public double getVolume() {
        // ...
        return 0; // TODO
    }

    // Stretches the shape by the percent specified in each direction
    public void stretch(double x, double y, double z) {

    }

}
