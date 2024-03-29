package y1.s2.Modules.Module5;

/**
 * generic interface named java.lang.Comparable<T>
 * <p>
 * where T is any class of objects that can be compared to determine if:
 * <p>
 * 1. One object obj1 is less than another object obj2, or if
 * <p>
 * 2. obj1 is greater than obj2, or if
 * <p>
 * 3. obj1 is equal to obj2.
 * <p>
 * <p>
 * The interface declares one abstract method that must be implemented by classes that implement the
 * interface:
 * <p>
 * int compareTo(T obj2)
 * <p>
 * <p>
 * The method is to return:
 * <p>
 * -1 If this object (the one on which the method is invoked) is less than obj2.
 * <p>
 * 0 If this object is equal to obj2.
 * <p>
 * 1 If this object is greater than obj2.
 */
public class ComparableInterface {
    public static void main(String[] args) {
        Integer n1 = 5;
        Integer n2 = 6;
//        System.out.println(n1.compareTo(n2));

        String name1 = "Fred";
        String name2 = "Betty";
        String name3 = "fred";
        String name4 = "Fred";

        int x = name1.compareTo(name2); // "Fred" > "Betty"
        int y = name2.compareTo(name3); // "Betty" < "fred"
        int z = name1.compareTo(name3); // "Fred" < "fred"
        int w = name1.compareTo(name4); // "Fred" == "Fred"

        System.out.println(x); // > 0
        System.out.println(y); // < 0
        System.out.println(z); // < 0
        System.out.println(w); //   0
    }
}

class Coordinate implements Comparable<Coordinate> {
    private double mX;
    private double mY;

    private double calcDistanceToOrigin() {
        return Math.sqrt(mX * mX + mY * mY);
    }

    public int compareTo(Coordinate pCoord) {
        double thisDist = calcDistanceToOrigin();
        double coordDist = pCoord.calcDistanceToOrigin();
        if (thisDist < coordDist) {
            return -1;
        } else if (thisDist > coordDist) {
            return 1;
        } else {
            return 0;
        }
    }
}