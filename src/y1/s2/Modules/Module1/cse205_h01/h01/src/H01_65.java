package y1.s2.Modules.Module1.cse205_h01.h01.src;

// CLASS: H01_65
// AUTHOR: Eyad Mohamed AbdelMohsen Ghanem,
// your ASURITEID username,
// your email address

public class H01_65 {
    private static final int A = 100;

    private int mX;
    private static int mY = 0;

    public H01_65() {
        this(-1);
    }

    public H01_65(int pX) {
        setX(pX);
    }

    public int getX() {
        return mX;
    }

    public static int getY() {
        return mY;
    }

    public void setX(int pX) {
        mX = pX;
    }

    public static void setY(int pY) {
        mY = pY;
    }
}
