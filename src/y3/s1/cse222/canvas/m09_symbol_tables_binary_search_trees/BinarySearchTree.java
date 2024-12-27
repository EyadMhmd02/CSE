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


    // Get size of the tree
    public int size() {
        return size(root);
    }

    private int size(Node<Key, Value> x) {
        if (x == null) return 0;
        return x.size;
    }

}
