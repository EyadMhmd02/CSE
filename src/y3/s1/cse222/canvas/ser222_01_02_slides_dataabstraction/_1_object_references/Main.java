package y3.s1.cse222.canvas.ser222_01_02_slides_dataabstraction._1_object_references;

class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter("First");
        Counter c2 = c1;

        c1.increment();
        c2.increment(); // c1 and c2 are pointing to the same object
        // if they were pointing to different objects, the output would be: (1 First) for each of them.

        System.out.println(c1); // 2 First
        System.out.println(c2); // 2 First

        // Objects are passed by reference, primitives are passed by value.
        Counter c3 = new Counter("Third");
        c3.increment();
        foobar(c3);
        System.out.println(c3); // 2 Third, because c3 is passed by reference, if passed by value, last print statement would be 1 Third.
    }

    protected static void foobar(Counter c) {
        c.increment();
        System.out.println(c);
    }
}
