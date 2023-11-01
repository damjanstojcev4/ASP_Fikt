package hash_table;

import java.util.HashMap;

public class HashTableExample {

    public static void main(String[] args) {
        // Creating a hash table (HashMap)
        HashMap<String, Integer> scores = new HashMap<>();

        // Inserting key-value pairs
        scores.put("Alice", 95);
        scores.put("Bob", 88);
        scores.put("Charlie", 72);

        // Retrieving values by key
        int aliceScore = scores.get("Alice"); // 95

        // Checking if a key exists
        boolean hasKey = scores.containsKey("David"); // false

        // Removing a key-value pair
        scores.remove("Bob");

        // Iterating through key-value pairs
        System.out.println("Key-Value Pairs:");
        for (String name : scores.keySet()) {
            int score = scores.get(name);
            System.out.println(name + ": " + score);
        }
    }
}

