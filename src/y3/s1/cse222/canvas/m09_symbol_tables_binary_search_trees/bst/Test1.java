//package y3.s1.cse222.canvas.m09_symbol_tables_binary_search_trees.bst;
//
//
//public class Test1 {
//    public static void main(String[] args) {
//        BinarySearchTree<String, Integer> bst = new BinarySearchTree<>();
//
//        Node<String, Integer> n1 = new Node<>("Root", 67);
//        Node<String, Integer> n2 = new Node<>("Left Child", 54);
//        Node<String, Integer> n3 = new Node<>("Right Child", 87);
//        Node<String, Integer> n4 = new Node<>("Left Grandchild of 54", 12);
//        Node<String, Integer> n5 = new Node<>("Right Grandchild of 54", 62);
//        Node<String, Integer> n6 = new Node<>("Left Grandchild of 87", 79);
//        Node<String, Integer> n7 = new Node<>("Right Grandchild of 87", 100);
//        Node<String, Integer> n8 = new Node<>("Left Child of 12", 45);
//        Node<String, Integer> n9 = new Node<>("Right Child of 79", 93);
//
//        bst.root = n1;
//
//        n1.left = n2;
//        n1.right = n3;
//
//        n2.left = n4;
//        n2.right = n5;
//        n3.left = n6;
//        n3.right = n7;
//
//        n4.left = n8;
//        n4.right = n9;
//
//        // Print the BST visually
//        System.out.println("Visual representation of the BST:");
//
//        BinarySearchTreePrinter printer = new BinarySearchTreePrinter();
//        printer.print(bst.root, false);
//        bst.deleteMax();
//    }
//}
