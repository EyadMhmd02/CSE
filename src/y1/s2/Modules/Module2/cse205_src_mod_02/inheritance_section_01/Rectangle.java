package y1.s2.Modules.Module2.cse205_src_mod_02.inheritance_section_01;//**************************************************************************************************
// CLASS: Rectangle (Rectangle.java)
//
// DESCRIPTION
// This is the Rectangle class from "Inheritance : Section 1".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
// http://www.devlang.com
//**************************************************************************************************

/**
 * Represents a Rectangle that can be drawn on a graphical window.
 */
public class Rectangle {
    private int mX;
    private int mY;
    private int mHeight;
    private int mWidth;

    /**
     * Default ctor. Initializes all instance variables to 0 by calling the second ctor.
     */
    public Rectangle() {
        this(0, 0, 0, 0);
    }

    /**
     * Second ctor.
     */
    public Rectangle(int pX, int pY, int pWidth, int pHeight) {
        setX(pX);
        setY(pY);
        setWidth(pWidth);
        setHeight(pHeight);
    }

    public Rectangle(int pX, int pY) {
        setX(pX);
        setY(pY);
    }

    /**
     * Accessor method for the mHeight data member.
     */
    public int getHeight() {
        return mHeight;
    }

    /**
     * Accessor method for the mWidth data member.
     */
    public int getWidth() {
        return mWidth;
    }

    /**
     * Change the size of this Rectangle.
     */
    public void resize(int pNewWidth, int pNewHeight) {
        setWidth(pNewWidth);
        setHeight(pNewHeight);
    }

    /**
     * Mutator method for the mHeight data member.
     */
    public void setHeight(int pNewHeight) {
        mHeight = pNewHeight;
    }

    /**
     * Mutator method for the mWidth data member.
     */
    public void setWidth(int pNewWidth) {
        mWidth = pNewWidth;
    }

    public void setX(int pX) {
        mX = pX;
    }

    public void setY(int pY) {
        mY = pY;
    }
}
