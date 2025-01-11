package y3.s1.cse222.canvas.m09_symbol_tables_binary_search_trees;

import java.util.*;

/**
 * BinarySearchTree class represents a binary search tree.
 *
 * @param <Key> The type of keys in the tree.
 * @param <Value> The type of values in the tree.
 */
class BinarySearchTree<Key extends Comparable<Key>, Value> {
    private Node<Key, Value> root;

    /**
     * Node class represents a single node in the binary search tree.
     */
    private static class Node<Key, Value> {
        private Key key;
        private Value value;
        private Node<Key, Value> left;
        private Node<Key, Value> right;
        private int size;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }

        public Node(Key key, Value value, int size) {
            this.key = key;
            this.value = value;
            this.size = size;
        }
    }

    /**
     * Inserts a key-value pair into the tree.
     *
     * @param key The key to insert.
     * @param value The value to insert.
     */
    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node<Key, Value> put(Node<Key, Value> x, Key key, Value value) {
        if (x == null) return new Node<>(key, value, 1);
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = put(x.left, key, value);
        else if (cmp > 0) x.right = put(x.right, key, value);
        else x.value = value;
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    /**
     * Retrieves the value associated with a given key from the tree.
     *
     * @param key The key to search for.
     * @return The value associated with the key, or null if the key is not found.
     */
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

    /**
     * Finds the minimum key in the tree.
     *
     * @return The minimum key in the tree, or null if the tree is empty.
     * @throws NoSuchElementException If the tree is empty.
     */
    public Key min() {
        if (root == null) throw new NoSuchElementException("The tree is empty.");
        return min(root).key;
    }

    private Node<Key, Value> min(Node<Key, Value> x) {
        if (x.left == null) return x;
        return min(x.left);
    }

    /**
     * Deletes a key from the tree.
     *
     * @param key The key to delete.
     */
    public void delete(Key key) {
        root = delete(root, key);
    }

    private Node<Key, Value> delete(Node<Key, Value> x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = delete(x.left, key);
        else if (cmp > 0) x.right = delete(x.right, key);
        else {
            if (x.left == null) return x.right;
            if (x.right == null) return x.left;
            Node<Key, Value> temp = min(x.right);
            x.key = temp.key;
            x.value = temp.value;
            x.right = delete(x.right, temp.key);
        }
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    /**
     * Deletes the minimum key from the tree.
     */
    public void deleteMin() {
        if (root == null) throw new NoSuchElementException("The tree is empty.");
        root = deleteMin(root);
    }

    private Node<Key, Value> deleteMin(Node<Key, Value> x) {
        if (x.left == null) return x.right;
        x.left = deleteMin(x.left);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    /**
     * Finds the maximum key in the tree.
     *
     * @return The maximum key in the tree, or null if the tree is empty.
     * @throws NoSuchElementException If the tree is empty.
     */
    public Key max() {
        if (root == null) throw new NoSuchElementException("The tree is empty.");
        return max(root).key;
    }

    private Node<Key, Value> max(Node<Key, Value> x) {
        if (x.right == null) return x;
        return max(x.right);
    }

    /**
     * Deletes the maximum key from the tree.
     */
    public void deleteMax() {
        if (root == null) throw new NoSuchElementException("The tree is empty.");
        root = deleteMax(root);
    }

    private Node<Key, Value> deleteMax(Node<Key, Value> x) {
        if (x.right == null) return x.left;
        x.right = deleteMax(x.right);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    /**
     * Gets the number of key-value pairs in the tree.
     *
     * @return The number of key-value pairs in the tree.
     */
    public int size() {
        return size(root);
    }

    private int size(Node<Key, Value> x) {
        if (x == null) return 0;
        return x.size;
    }

    public static <Key, Value extends Comparable<?>> void printNode(Node<Key, Value> root) {
        int maxLevel = maxLevel(root);

        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static <Key, Value extends Comparable<?>> void printNodeInternal(List<Node<Key, Value>> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        printWhitespaces(firstSpaces);

        List<Node<Key, Value>> newNodes = new ArrayList<>();
        for (Node<Key, Value> node : nodes) {
            if (node != null) {
                System.out.print(node.value);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).left != null)
                    System.out.print("/");
                else
                    printWhitespaces(1);

                printWhitespaces(i + i - 1);

                if (nodes.get(j).right != null)
                    System.out.print("\\");
                else
                    printWhitespaces(1);

                printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private static <Key, Value extends Comparable<?>> int maxLevel(Node<Key, Value> node) {
        if (node == null)
            return 0;

        return Math.max(maxLevel(node.left), maxLevel(node.right)) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

    /**
     * Main method to test the BinarySearchTree class.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        BinarySearchTree<String, Integer> bst = new BinarySearchTree<>();

        Node<String, Integer> n1 = new Node<>("Root", 67);
        Node<String, Integer> n2 = new Node<>("Left Child", 54);
        Node<String, Integer> n3 = new Node<>("Right Child", 87);
        Node<String, Integer> n4 = new Node<>("Left Grandchild of 54", 12);
        Node<String, Integer> n5 = new Node<>("Right Grandchild of 54", 62);
        Node<String, Integer> n6 = new Node<>("Left Grandchild of 87", 79);
        Node<String, Integer> n7 = new Node<>("Right Grandchild of 87", 100);
        Node<String, Integer> n8 = new Node<>("Left Child of 12", 45);
        Node<String, Integer> n9 = new Node<>("Right Child of 79", 93);

        bst.root = n1;

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        n4.left = n8;
        n4.right = n9;

        // Print the BST visually
        System.out.println("Visual representation of the BST:");
        printNode(bst.root);
        bst.deleteMax();
    }

    /**
     * Performs an in-order traversal of the tree and prints the keys and values.
     *
     * @param x The root of the subtree to traverse.
     */
    private <Key, Value> void inOrderTraversal(Node<Key, Value> x) {
        if (x == null) return;
        inOrderTraversal(x.left);
        System.out.println("Key: " + x.key + ", Value: " + x.value);
        inOrderTraversal(x.right);
    }

}