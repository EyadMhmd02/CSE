package y3.s1.cse222.canvas.m09_symbol_tables_binary_search_trees;

public class TestBST {
    public static void main(String[] args) {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();

        // Insert key-value pairs
        bst.put(10, "Ten");
        bst.put(20, "Twenty");
        bst.put(5, "Five");
        bst.put(15, "Fifteen");

        // Test get method
        System.out.println("Value for key 10: " + bst.get(10)); // Ten

        // Test min method
        System.out.println("Minimum key: " + bst.min()); // 5

        // Test delete method
        bst.delete(10);
        System.out.println("Value for key 10 after deletion: " + bst.get(10)); // null

        // Test size method
        System.out.println("Size of BST: " + bst.size()); // 3
    }
}

/*
Value for key 10: Ten
Minimum key: 5
Value for key 10 after deletion: null
Size of BST: 3
*/