package y3.s1.cse222.canvas.m10_hash_tables;

public class Main {
    public static void main(String[] args) {
/*        // 1. Hash Function for Strings
        // A common way to hash strings:
        String s = "Eyad";
        int hash = 0;
        int M = 1000000; // Assuming M is a constant value of 1000000
        for (int i = 0; i < s.length(); i++)
            hash = (31 * hash + s.charAt(i)) % M;
        System.out.println(hash);
        // This combines each character's ASCII value, multiplied by a constant (31), and reduces it modulo M.*/


        // 2. Separate Chaining Hash Table
        // In this method, collisions are resolved using linked lists:
        SeparateChainingHashST<String, Integer> hashTable1 = new SeparateChainingHashST<>(1000);

        // Insert key-value pairs
        hashTable1.put("apple", 10);
        hashTable1.put("banana", 20);
        hashTable1.put("cherry", 30);

        // Retrieve values using keys
        System.out.println(hashTable1.get("apple")); // Output: 10
        System.out.println(hashTable1.get("banana")); // Output: 20
        System.out.println(hashTable1.get("cherry")); // Output: 30


        // 3. Linear Probing Hash Table
        // This method resolves collisions by searching for the next empty slot:

        LinearProbingHashST<String, Integer> hashTable2 = new LinearProbingHashST<>(1000);

        // Insert key-value pairs
        hashTable2.put("apple", 10);
        hashTable2.put("banana", 20);
        hashTable2.put("cherry", 30);

        // Retrieve values using keys
        System.out.println(hashTable2.get("apple")); // Output: 10
        System.out.println(hashTable2.get("banana")); // Output: 20
        System.out.println(hashTable2.get("cherry")); // Output: 30
    }
}

