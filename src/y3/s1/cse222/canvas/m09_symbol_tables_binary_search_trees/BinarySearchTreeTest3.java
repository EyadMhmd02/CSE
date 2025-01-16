package y3.s1.cse222.canvas.m09_symbol_tables_binary_search_trees;

public class BinarySearchTreeTest3 {
    public static void main(String[] args) {
        BinarySearchTree<Integer, Integer> bst = new BinarySearchTree<>();

        Node<Integer, Integer> n1 = new Node<>(0, 67);
        Node<Integer, Integer> n2 = new Node<>(1, 54);
        Node<Integer, Integer> n3 = new Node<>(2, 87);
        Node<Integer, Integer> n4 = new Node<>(3, 12);
        Node<Integer, Integer> n5 = new Node<>(4, 62);
        Node<Integer, Integer> n6 = new Node<>(5, 79);
        Node<Integer, Integer> n7 = new Node<>(6, 100);
        Node<Integer, Integer> n8 = new Node<>(7, 45);
        Node<Integer, Integer> n9 = new Node<>(8, 93);

        bst.root = n1; // 67

        // 67
        n1.left = n2; // 54
        n1.right = n3; // 87

        // 54
        n2.left = n4; // 12
        n2.right = n5; // 62

        // 87
        n3.left = n6; // 79
        n3.right = n7; // 100

        // 12
        n4.right = n8; // 45

        // 100
        n7.left = n9; // 93


        BinarySearchTreePrinter printer = new BinarySearchTreePrinter();
        printer.print(bst.root, true);

        code2(bst, printer);
    }

    private static void code1(BinarySearchTree<Integer, Integer> bst, BinarySearchTreePrinter printer) {
        bst.deleteMax(); // 100
        printer.print(bst.root, true);
        bst.put(87, 98);
        printer.print(bst.root, true);
        bst.put(bst.get(87) + 2, 101); // 87:98 => 98 + 2 = 100:? => 100:101
        printer.print(bst.root, true);
        bst.put(bst.get(bst.max()), 30); //100:101 => 101:? => 101:30
        printer.print(bst.root, true);
        System.out.println(bst.max()); // max key => 101
        System.out.println(bst.get(bst.max())); // val at max key => 30
        System.out.println(bst.contains(100)); // contains key 100 => true
    }
    /*
    101
    30
    true
     */

    private static void code2(BinarySearchTree<Integer, Integer> bst, BinarySearchTreePrinter printer) {
        bst.put(13, 200);
        int currMin = bst.min();
        bst.put(87, 25);
        bst.put(bst.floor(50), 23);
        bst.deleteMin();
        bst.put(bst.max() - bst.min(), 16);

        System.out.println(bst.get(87));
        System.out.println(bst.get(12));
        System.out.println(bst.floor(50) - currMin);
    }
    /*
    25
    null
    10
     */
    /*
    16
    null
    33
    */

    private static void code3(BinarySearchTree<Integer, Integer> bst, BinarySearchTreePrinter printer) {
        bst.put(bst.size() * 5, 6);
        bst.delete(bst.floor(bst.size() * 2));
        bst.delete(bst.ceiling(bst.max()));
        bst.put(112, 40);
        bst.delete(bst.floor(bst.max() - bst.get(45)));
        System.out.println(bst.get(45));
        System.out.println(bst.floor(bst.max() - bst.get(45)));
        System.out.println(bst.contains(12));
    }
    /*
    101
    30
    true
     */

    private static void code4(BinarySearchTree<Integer, Integer> bst, BinarySearchTreePrinter printer) {

    }
    /*

     */
}
