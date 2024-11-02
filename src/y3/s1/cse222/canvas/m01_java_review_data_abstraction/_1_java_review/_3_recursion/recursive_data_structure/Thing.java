package y3.s1.cse222.canvas.m01_java_review_data_abstraction._1_java_review._3_recursion.recursive_data_structure;

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
