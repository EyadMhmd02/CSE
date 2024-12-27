package y3.s1.cse222.canvas.m09_symbol_tables_binary_search_trees;

import java.util.HashMap;

public class SymbolTable<Key, Value> {
    private HashMap<Key, Value> table;

    // Constructor to initialize the symbol table
    public SymbolTable() {
        table = new HashMap<>();
    }

    // Add or update a key-value pair
    public void put(Key key, Value value) {
        table.put(key, value);
    }

    // Retrieve the value for a given key
    public Value get(Key key) {
        return table.get(key);
    }

    // Remove a key-value pair
    public void delete(Key key) {
        table.remove(key);
    }

    // Check if the key exists in the table
    public boolean contains(Key key) {
        return table.containsKey(key);
    }

    // Check if the table is empty
    public boolean isEmpty() {
        return table.isEmpty();
    }

    // Get the size of the table
    public int size() {
        return table.size();
    }

    // Print all key-value pairs
    public void display() {
        for (Key key : table.keySet()) {
            System.out.println("Key: " + key + ", Value: " + table.get(key));
        }
    }

    // Main method to test the Symbol Table
    public static void main(String[] args) {
        SymbolTable<String, Integer> symbolTable = new SymbolTable<>();

        // Adding key-value pairs
        symbolTable.put("Alice", 85);
        symbolTable.put("Bob", 90);
        symbolTable.put("Charlie", 75);

        // Display all key-value pairs
        System.out.println("Symbol Table Contents:");
        symbolTable.display();

        // Retrieve a value
        System.out.println("\nValue for 'Bob': " + symbolTable.get("Bob"));

        // Check if a key exists
        System.out.println("\nContains 'Alice'? " + symbolTable.contains("Alice"));

        // Delete a key-value pair
        System.out.println("\nDeleting 'Charlie'...");
        symbolTable.delete("Charlie");

        // Display the updated table
        System.out.println("\nUpdated Symbol Table Contents:");
        symbolTable.display();

        // Check if the table is empty
        System.out.println("\nIs the table empty? " + symbolTable.isEmpty());

        // Get the size of the table
        System.out.println("\nSize of the table: " + symbolTable.size());
    }
}
