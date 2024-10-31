package y3.s1.cse222.canvas.ser222_01_01_slides_recursion._3_recursion.recursive_data_structure;

/**
 * This class is self-referential, another form of recursion.
 * <p>
 * This makes a list a recursive data structure.
 * <p>
 * Made possible by references.
 * <p>
 * This is the fundamental idea behind the linked-list data structure.
 */
class Thing {
    public Thing thing2;
    private int alongForTheRide;

    public Thing(Thing t2, int i) {
        thing2 = t2;
        alongForTheRide = i;
    }
}
