package y1.s2.Modules.ModuleFinalExam.h1;

public class _6_5 {
    // private int instance variable, mX
    private int mX;

    // private int class variable, mY, 0
    private static int mY = 0;

    // private int class constant, A, 100
    private static final int A = 100;

    // public int class constant, B, 200
    public static final int B = 200;

    // public accessor, mutator => mX, getX(), setX()
    public int getX() {
        return mX;
    }

    public void setX(int mX) {
        this.mX = mX;
    }

    // public accessor, mutator => mY, getY(), setY()
    public int getY() {
        return mY;
    }

    public void setY(int mY) {
        this.mY = mY;
    }

    // public constructor, 1 parameter pX => setX() mX = pX
    public _6_5(int pX) {
        setX(pX);
    }

    // public default constructor, mX = -1
    public _6_5() {
        mX = -1;
    }
}
