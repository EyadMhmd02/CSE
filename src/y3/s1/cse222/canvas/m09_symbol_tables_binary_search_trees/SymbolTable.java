package y3.s1.cse222.canvas.m09_symbol_tables_binary_search_trees;

import java.util.HashMap;
import java.util.NoSuchElementException;

/**
 * A generic SymbolTable class that supports key-value pairs.
 * The keys must be Comparable and the values can be of any type.
 *
 * @param <Key>   the type of keys in the symbol table
 * @param <Value> the type of values in the symbol table
 */
public class SymbolTable<Key extends Comparable<Key>, Value> {
    private HashMap<Key, Value> table;

    /**
     * Constructor to initialize the symbol table.
     */
    public SymbolTable() {
        table = new HashMap<>();
    }

    /**
     * Add or update a key-value pair in the symbol table.
     *
     * @param key   the key to add or update
     * @param value the value to associate with the key
     */
    public void put(Key key, Value value) {
        table.put(key, value);
    }

    /**
     * Retrieve the value associated with a given key from the symbol table.
     *
     * @param key the key to retrieve the value for
     * @return the value associated with the key, or null if the key is not found
     */
    public Value get(Key key) {
        return table.get(key);
    }

    /**
     * Remove a key-value pair from the symbol table.
     *
     * @param key the key to remove
     */
    public void delete(Key key) {
        table.remove(key);
    }

    /**
     * Check if a given key exists in the symbol table.
     *
     * @param key the key to check for
     * @return true if the key exists in the symbol table, false otherwise
     */
    public boolean contains(Key key) {
        return table.containsKey(key);
    }

    /**
     * Check if the symbol table is empty.
     *
     * @return true if the symbol table is empty, false otherwise
     */
    public boolean isEmpty() {
        return table.isEmpty();
    }

    /**
     * Get the number of key-value pairs in the symbol table.
     *
     * @return the size of the symbol table
     */
    public int size() {
        return table.size();
    }

    /**
     * Print all key-value pairs in the symbol table.
     */
    public void display() {
        for (Key key : table.keySet()) {
            System.out.println("Key: " + key + ", Value: " + table.get(key));
        }
    }

    /**
     * Delete the key-value pair with the minimum key from the symbol table.
     *
     * @throws NoSuchElementException if the symbol table is empty
     */
    public void deleteMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }

        Key minKey = table.keySet().iterator().next();
        for (Key key : table.keySet()) {
            if (key.compareTo(minKey) < 0) {
                minKey = key;
            }
        }
        table.remove(minKey);
    }

    /**
     * Delete the key-value pair with the maximum key from the symbol table.
     *
     * @throws NoSuchElementException if the symbol table is empty
     */
    public void deleteMax() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }

        Key maxKey = table.keySet().iterator().next();
        for (Key key : table.keySet()) {
            if (key.compareTo(maxKey) > 0) {
                maxKey = key;
            }
        }
        table.remove(maxKey);
    }

    /**
     * Retrieve the key-value pair with the minimum key from the symbol table.
     *
     * @return the key with the minimum value, or null if the symbol table is empty
     * @throws NoSuchElementException if the symbol table is empty
     */
    public Key min() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }

        Key minKey = table.keySet().iterator().next();
        for (Key key : table.keySet()) {
            if (key.compareTo(minKey) < 0) {
                minKey = key;
            }
        }
        return minKey;
    }

    /**
     * Retrieve the largest key that is less than or equal to a given key from the symbol table.
     *
     * @param key the key to find the floor of
     * @return the largest key that is less than or equal to the given key, or null if no such key exists
     * @throws NoSuchElementException if the symbol table is empty
     */
    public Key floor(Key key) {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }

        Key floorKey = null;
        for (Key tableKey : table.keySet()) {
            if (tableKey.compareTo(key) <= 0 && (floorKey == null || tableKey.compareTo(floorKey) > 0)) {
                floorKey = tableKey;
            }
        }
        return floorKey;
    }

    /**
     * Retrieve the largest key from the symbol table.
     *
     * @return the largest key, or null if the symbol table is empty
     * @throws NoSuchElementException if the symbol table is empty
     */
    public Key max() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }

        Key maxKey = table.keySet().iterator().next();
        for (Key key : table.keySet()) {
            if (key.compareTo(maxKey) > 0) {
                maxKey = key;
            }
        }
        return maxKey;
    }

    /**
     * Display all key-value pairs in the symbol table in a formatted manner.
     * Overrides Object's toString() method.
     *
     * @return a string representation of the symbol table
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Symbol Table:\n");
        sb.append("--------------------\n");
        for (Key key : table.keySet()) {
            sb.append("Key: ").append(key).append(" | Value: ").append(table.get(key)).append("\n");
        }
        sb.append("--------------------\n");
        return sb.toString();
    }

    public static void main(String[] args) {
        SymbolTable<String, Integer> ST = new SymbolTable<>();
        ST.put("B", 22);
        ST.put("G", 12);
        ST.deleteMin();
        ST.put("C", 35);
        ST.put("B", 12);
        ST.put("A", 50);
        ST.put(ST.max(), 20);
        ST.put("D", 3);
        ST.put("E", 84);
        ST.deleteMax();
        int currSize = ST.size();
        ST.put("F", 12);
        ST.put(ST.min(), ST.size());
        ST.put("B", 20);
        ST.delete(ST.floor("Z"));
        ST.put("G", currSize);
        printST(ST);
        printCurrentSize(ST);
    }

    private static void printST(SymbolTable<String, Integer> ST) {
        System.out.println(ST);
    }

    private static void printCurrentSize(SymbolTable<String, Integer> ST) {
        System.out.println(ST.size());
    }
}
