package y3.s1.cse222.canvas.ser222_01_01_slides_recursion._3_recursion.printing_a_list;

class PrintingAListExample {

    public static void iterativeDisplayList(LinearNode node) {
        LinearNode iter = node;
        while (iter != null) {
            System.out.println(iter.getElement());
            iter = iter.getNext();
        }
    }

    public static void recursiveDisplayList(LinearNode node) {
        if (node != null) {
            System.out.println(node.getElement());
            recursiveDisplayList(node.getNext());
        }
    }
}