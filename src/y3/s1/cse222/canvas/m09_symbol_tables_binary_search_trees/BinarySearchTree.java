package y3.s1.cse222.canvas.m09_symbol_tables_binary_search_trees;

import java.util.*;

/**
 * Node class represents a single node in the binary search tree.
 */
class Node<Key, Value> {
    Key key;
    Value value;
    Node<Key, Value> left;
    Node<Key, Value> right;
    int size;

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
 * BinarySearchTree class represents a binary search tree.
 *
 * @param <Key> The type of keys in the tree.
 * @param <Value> The type of values in the tree.
 */
class BinarySearchTree<Key extends Comparable<Key>, Value> {
    Node<Key, Value> root;

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
        if (root == null) {
            throw new NoSuchElementException("The tree is empty.");
        }
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
     * Checks if the binary search tree contains a specific key.
     *
     * @param key The key to search for.
     * @return {@code true} if the tree contains the key; {@code false} otherwise.
     */
    public boolean contains(Key key) {
        return contains(root, key);
    }

    private boolean contains(Node<Key, Value> node, Key key) {
        if (node == null) {
            return false;
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            return contains(node.left, key);
        } else if (cmp > 0) {
            return contains(node.right, key);
        } else {
            return true;
        }
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

    /**
     * Finds the largest key in the binary search tree that is less than or equal to the given key.
     *
     * @param x The key to find the floor for.
     * @return The largest key in the tree that is less than or equal to {@code x}, or {@code null} if no such key exists.
     */
    Key floor(Key x) {
        // Base case: return null if no floor found
        if (root == null) {
            return null;
        }

        // If the root's key is equal to x,
        // we've found the floor
        if (root.key.compareTo(x) == 0) {
            return root.key;
        }

        // If root's key is greater than x,
        // search in the left subtree
        if (root.key.compareTo(x) > 0) {
            return floor(x);
        }

        // Else, search in the right subtree
        // and compare with current root
        Key floorValue = floor(x);

        // If the right subtree returns a valid floor,
        // return that, otherwise return the current root's key
        return (floorValue != null && floorValue.compareTo(x) <= 0)
                ? floorValue : root.key;
    }

    /**
     * Finds the smallest key in the binary search tree that is greater than or equal to the given key.
     *
     * @param key The key to find the ceiling for.
     * @return The smallest key in the tree that is greater than or equal to {@code key}, or {@code null} if no such key exists.
     */
    Key ceiling(Key key) {
        // Base case
        if (root == null) {
            return null;
        }

        // We found equal key
        if (root.key.compareTo(key) == 0) {
            return root.key;
        }

        // If root's key is smaller,
        // ceil must be in the right subtree
        if (root.key.compareTo(key) < 0) {
            return ceiling(key);
        }

        // Else, either left subtree or root
        // has the ceil value
        Key ceil = ceiling(key);
        return (ceil != null && ceil.compareTo(key) >= 0) ? ceil : root.key;
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