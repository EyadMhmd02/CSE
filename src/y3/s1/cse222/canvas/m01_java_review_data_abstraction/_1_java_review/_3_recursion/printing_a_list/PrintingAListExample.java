package y3.s1.cse222.canvas.m01_java_review_data_abstraction._1_java_review._3_recursion.printing_a_list;

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