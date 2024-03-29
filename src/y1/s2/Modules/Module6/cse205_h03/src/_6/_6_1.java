package y1.s2.Modules.Module6.cse205_h03.src._6;

public class _6_1 {
    public static void main(String[] args) {

    }
}

class Point implements Comparable<Point> {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public int compareTo(Point pPoint2) {
        double thisDist = Math.sqrt(x * x + y * y);
        double p2Dist = Math.sqrt(Math.pow(pPoint2.getX(), 2) + Math.pow(pPoint2.getY(), 2));
        if (thisDist == p2Dist) return 0;
        else if (thisDist < p2Dist) return -1;
        else return 1;
    }
}
