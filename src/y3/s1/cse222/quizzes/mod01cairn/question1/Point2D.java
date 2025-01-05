package y3.s1.cse222.quizzes.mod01cairn.question1;

class Point2D {
    private final double x;
    private final double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public double r() {
        return Math.sqrt(x * x + y * y);
    }

    public double theta() {
        return Math.atan2(y, x);
    }

    public double distanceTo(Point2D that) {
        double dx = this.x - that.x();
        double dy = this.y - that.y();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null) return false;
        if (other.getClass() != this.getClass())
            return false;
        Point2D p = (Point2D) other;
        return this.x() == p.x() && this.y() == p.y();
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
