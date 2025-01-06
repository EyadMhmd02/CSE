package y3.s1.cse222.canvas.m09_symbol_tables_binary_search_trees;

import java.util.NoSuchElementException;

class BinarySearchTree<Key extends Comparable<Key>, Value> {
    private Node<Key, Value> root;

    // Insert key-value pair
    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node<Key, Value> put(Node<Key, Value> x, Key key, Value value) {
        if (x == null) return new Node<>(key, value, 1);
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = put(x.left, key, value);
        else if (cmp > 0) x.right = put(x.right, key, value);
        else x.value = value;
        x.size = 1 + size(x.left) + size(x.right);
        return x;
    }

    // Get value by key
    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node<Key, Value> x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else return x.value;
    }

    // Find minimum key with null check
    public Key min() {
        if (root == null) throw new NoSuchElementException("Tree is empty");
        return min(root).key;
    }

    private Node<Key, Value> min(Node<Key, Value> x) {
        if (x.left == null) return x;
        return min(x.left);
    }

    // Delete a key from the BST
    public void delete(Key key) {
        root = delete(root, key);
    }

    private Node<Key, Value> delete(Node<Key, Value> x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = delete(x.left, key);
        else if (cmp > 0) x.right = delete(x.right, key);
        else {
            // Node with only one child or no child
            if (x.right == null) return x.left;
            if (x.left == null) return x.right;

            // Node with two children: get in-order successor
            Node<Key, Value> temp = x;
            x = min(temp.right); // Replace with minimum in the right subtree
            x.right = deleteMin(temp.right);
            x.left = temp.left;
        }
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    // Helper function to delete the minimum node
    private Node<Key, Value> deleteMin(Node<Key, Value> x) {
        if (x.left == null) return x.right;
        x.left = deleteMin(x.left);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    // Find maximum key with null check
    public Key max() {
        if (root == null) throw new NoSuchElementException("Tree is empty");
        return max(root).key;
    }

    private Node<Key, Value> max(Node<Key, Value> x) {
        if (x.right == null) return x;
        return max(x.right);
    }

    // Delete a key from the BST
    public void delete(Key key) {
        root = delete(root, key);
    }

    private Node<Key, Value> delete(Node<Key, Value> x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = delete(x.left, key);
        else if (cmp > 0) x.right = delete(x.right, key);
        else {
            // Node with only one child or no child
            if (x.right == null) return x.left;
            if (x.left == null) return x.right;

            // Node with two children: get in-order successor
            Node<Key, Value> temp = x;
            x = min(temp.right); // Replace with minimum in the right subtree
            x.right = deleteMin(temp.right);
            x.left = temp.left;
        }
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    // Delete the maximum node from the BST
    public void deleteMax() {
        root = deleteMax(root);
    }

    private Node<Key, Value> deleteMax(Node<Key, Value> x) {
        if (x.right == null) return x.left;
        x.right = deleteMax(x.right);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    // Get size of the tree
    public int size() {
        return size(root);
    }

    private int size(Node<Key, Value> x) {
        if (x == null) return 0;
        return x.size;
    }

    // Helper class representing a single node in the BST
    private static class Node<Key, Value> {
        private final Key key;  // The key
        private Value value;    // The associated value
        private Node<Key, Value> left, right; // Left and right subtrees
        private int size;       // Number of nodes in subtree

        public Node(Key key, Value value, int size) {
            this.key = key;
            this.value = value;
            this.size = size;
        }
    }

    // Main method to test the BinarySearchTree
    public static void main(String[] args) {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();

        // Insert nodes based on the given tree structure
        bst.put(67, "Root");       // Root node
        bst.put(54, "Left Child"); // Left child of Root
        bst.put(87, "Right Child"); // Right child of Root
        bst.put(12, "Left Grandchild of 54"); // Left child of 54
        bst.put(62, "Right Grandchild of 54"); // Right child of 54
        bst.put(79, "Left Grandchild of 87"); // Left child of 87
        bst.put(100, "Right Grandchild of 87"); // Right child of 87
        bst.put(45, "Left Child of 12"); // Left child of 12
        bst.put(93, "Right Child of 79"); // Right child of 79

        // Print the BST visually
        System.out.println("Visual representation of the BST:");
        printTree(bst.root, "", false);

        bst.deleteMax();
    }


    // Helper method to perform in-order traversal of the tree
    private static <Key, Value> void inOrderTraversal(Node<Key, Value> x) {
        if (x == null) return;
        inOrderTraversal(x.left);
        System.out.println("Key: " + x.key + ", Value: " + x.value);
        inOrderTraversal(x.right);
    }

    // Helper function to print the tree visually
    // Helper function to print the tree visually
    public static void printTree(BinarySearchTree.Node<Integer, String> root, String prefix, boolean isLeft) {
        if (root != null) {
            // Print the current node
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.key);

            // Ensure both left and right children are considered, even if null
            if (root.left != null || root.right != null) {
                printTree(root.left, prefix + (isLeft ? "│   " : "    "), true);
                printTree(root.right, prefix + (isLeft ? "│   " : "    "), false);
            }
        }
    }


}
