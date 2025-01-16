package y3.s1.cse222.canvas.m09_symbol_tables_binary_search_trees.bst;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This class represents an ordered symbol table, implemented using a binary search tree.
 * It supports the basic operations of insert, search, and delete, as well as methods
 * for finding the minimum and maximum keys, floor and ceiling keys, rank and select,
 * and range queries.
 *
 * @param <Key> the type of keys in the symbol table
 * @param <Value> the type of values in the symbol table
 */
public class ST<Key extends Comparable<Key>, Value> {

    private Node root;

    private class Node {
        private final Key key;
        private Value val;
        private Node left, right;
        private int N;

        /**
         * Constructs a new node with the given key, value, and size.
         *
         * @param key the key
         * @param val the value
         * @param N the size of the subtree rooted at this node
         */
        public Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }

    /**
     * Constructs an empty ordered symbol table.
     */
    public ST() {
        root = null;
    }

    /**
     * Inserts the key-value pair into the symbol table. If the key already exists,
     * updates the value. If the value is null, deletes the key from the table.
     *
     * @param key the key
     * @param val the value
     */
    public void put(Key key, Value val) {
        if (val == null) delete(key);
        else root = put(root, key, val);
    }

    private Node put(Node x, Key key, Value val) {
        if (x == null) return new Node(key, val, 1);
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = put(x.left, key, val);
        else if (cmp > 0) x.right = put(x.right, key, val);
        else x.val = val;
        x.N = 1 + size(x.left) + size(x.right);
        return x;
    }

    /**
     * Returns the value associated with the given key. If the key is not found,
     * returns null.
     *
     * @param key the key
     * @return the value associated with the key, or null if not found
     */
    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else return x.val;
    }

    /**
     * Deletes the key and its associated value from the symbol table.
     *
     * @param key the key
     */
    public void delete(Key key) {
        root = delete(root, key);
    }

    private Node delete(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = delete(x.left, key);
        else if (cmp > 0) x.right = delete(x.right, key);
        else {
            if (x.right == null) return x.left;
            if (x.left == null) return x.right;
            Node t = x;
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        x.N = 1 + size(x.left) + size(x.right);
        return x;
    }

    /**
     * Returns true if the symbol table contains the given key.
     *
     * @param key the key
     * @return true if the symbol table contains the key, false otherwise
     */
    public boolean contains(Key key) {
        return get(root, key) != null;
    }

    /**
     * Returns true if the symbol table is empty.
     *
     * @return true if the symbol table is empty, false otherwise
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Returns the number of key-value pairs in the symbol table.
     *
     * @return the number of key-value pairs in the symbol table
     */
    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) return 0;
        else return x.N;
    }

    /**
     * Returns the smallest key in the symbol table.
     *
     * @return the smallest key in the symbol table
     * @throws NoSuchElementException if the symbol table is empty
     */
    public Key min() {
        if (isEmpty()) throw new NoSuchElementException("Symbol table is empty");
        return min(root).key;
    }

    private Node min(Node x) {
        if (x.left == null) return x;
        else return min(x.left);
    }

    /**
     * Returns the largest key in the symbol table.
     *
     * @return the largest key in the symbol table
     * @throws NoSuchElementException if the symbol table is empty
     */
    public Key max() {
        if (isEmpty()) throw new NoSuchElementException("Symbol table is empty");
        return max(root).key;
    }

    private Node max(Node x) {
        if (x.right == null) return x;
        else return max(x.right);
    }

    /**
     * Returns the largest key in the symbol table that is less than or equal to the given key.
     *
     * @param key the key
     * @return the largest key in the symbol table that is less than or equal to the given key,
     * or null if there is no such key
     */
    public Key floor(Key key) {
        Node x = floor(root, key);
        if (x == null) return null;
        else return x.key;
    }

    private Node floor(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x;
        if (cmp < 0) return floor(x.left, key);
        Node t = floor(x.right, key);
        if (t != null) return t;
        else return x;
    }

    /**
     * Returns the smallest key in the symbol table that is greater than or equal to the given key.
     *
     * @param key the key to find the ceiling of
     * @return the smallest key in the symbol table that is greater than or equal to the given key,
     * or null if there is no such key
     */
    public Key ceiling(Key key) {
        Node x = ceiling(root, key);
        if (x == null) return null;
        else return x.key;
    }

    private Node ceiling(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x;
        Node t = null;
        if (cmp < 0) t = ceiling(x.right, key);
        if (t != null) return t;
        else return x;
    }

    /**
     * Returns the number of keys in the symbol table that are less than the given key.
     *
     * @param key the key to find the rank of
     * @return the number of keys in the symbol table that are less than the given key
     */
    public int rank(Key key) {
        return rank(root, key);
    }

    private int rank(Node x, Key key) {
        if (x == null) return 0;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) return rank(x.left, key);
        else if (cmp > 0) return 1 + size(x.left) + rank(x.right, key);
        else return size(x.left);
    }

    /**
     * Returns the key of the specified rank in the symbol table.
     *
     * <p>The rank of a key is the number of keys in the symbol table that are less than the given key.
     * If there are multiple keys with the same rank, this method returns the smallest such key.
     *
     * @param k the rank of the key to find
     * @return the key of the specified rank, or null if there is no such key
     * @throws IllegalArgumentException if {@code k < 0 || k >= size()}
     */
    public Key select(int k) {
        if (k < 0 || k >= size()) {
            throw new IllegalArgumentException("Invalid rank: " + k);
        }
        return select(root, k);
    }

    private Key select(Node x, int k) {
        if (x == null) return null;
        int t = size(x.left);
        if (t > k) return select(x.left, k);
        else if (t < k) return select(x.right, k - t - 1);
        else return x.key;
    }

    /**
     * Deletes the smallest key from the symbol table.
     *
     * <p>This method removes the smallest key from the symbol table. If the symbol table is empty,
     * this method does nothing.
     *
     * @throws IllegalStateException if the symbol table is empty
     */
    public void deleteMin() {
        if (isEmpty()) throw new IllegalStateException("Symbol table is empty");
        root = deleteMin(root);
    }

    private Node deleteMin(Node x) {
        if (x.left == null) return x.right;
        x.left = deleteMin(x.left);
        x.N = 1 + size(x.left) + size(x.right);
        return x;
    }

    /**
     * Deletes the largest key from the symbol table.
     *
     * <p>This method removes the largest key from the symbol table. If the symbol table is empty,
     * this method does nothing.
     */
    public void deleteMax() {
        root = deleteMax(root);
    }

    private Node deleteMax(Node x) {
        if (x.right == null) return x.left;
        x.right = deleteMax(x.right);
        x.N = 1 + size(x.left) + size(x.right);
        return x;
    }

    /**
     * Returns the number of keys in the symbol table that are between the given range [lo..hi].
     *
     * <p>The number of keys in the symbol table that are less than or equal to {@code hi} and greater than or equal to {@code lo}
     * is returned. If {@code lo} is greater than {@code hi}, this method returns 0.
     *
     * @param lo the lower bound of the range
     * @param hi the upper bound of the range
     * @return the number of keys in the symbol table that are between the given range [lo..hi]
     */
    public int size(Key lo, Key hi) {
        if (lo.compareTo(hi) > 0) return 0;
        if (contains(hi)) return rank(hi) - rank(lo) + 1;
        else return rank(hi) - rank(lo);
    }

    /**
     * Returns all keys in the symbol table that are between the given range [lo..hi],
     * in sorted order.
     *
     * <p>The number of keys in the symbol table that are less than or equal to {@code hi}
     * and greater than or equal to {@code lo} are returned. If {@code lo} is greater than
     * {@code hi}, this method returns an empty iterable.
     *
     * @param lo the lower bound of the range
     * @param hi the upper bound of the range
     * @return an iterable of keys in the symbol table that are between the given range [lo..hi],
     * in sorted order
     */
    public Iterable<Key> keys(Key lo, Key hi) {
        List<Key> queue = new ArrayList<>();
        keys(root, queue, lo, hi);
        return queue;
    }

    /**
     * Recursively collects all keys in the symbol table that are between the given range [lo..hi],
     * and adds them to the provided queue in sorted order.
     *
     * <p>This method is a helper function for the {@link #keys(Key, Key)} method. It traverses
     * the binary search tree in an in-order manner, adding keys that fall within the specified
     * range to the queue.
     *
     * @param x the current node being processed
     * @param queue the list to store the keys within the specified range
     * @param lo the lower bound of the range
     * @param hi the upper bound of the range
     */
    private void keys(Node x, List<Key> queue, Key lo, Key hi) {
        if (x == null) return;
        int cmplo = lo.compareTo(x.key);
        int cmphi = hi.compareTo(x.key);
        if (cmplo < 0) keys(x.left, queue, lo, hi);
        if (cmplo <= 0 && cmphi >= 0) queue.add(x.key);
        if (cmphi > 0) keys(x.right, queue, lo, hi);
    }

    /**
     * Returns all keys in the symbol table in sorted order.
     *
     * <p>This method retrieves all keys from the symbol table and returns them in sorted order.
     * It uses the {@link #min()} and {@link #max()} methods to determine the range of keys to retrieve.
     * The returned keys are iterable, allowing for easy iteration over the keys.
     *
     * @return an iterable of keys in the symbol table, in sorted order
     */
    public Iterable<Key> keys() {
        return keys(min(), max());
    }
}