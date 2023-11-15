package linked_list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements to the LinkedList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Print the LinkedList
        System.out.println("LinkedList: " + numbers);

        // Access elements by index
        int firstElement = numbers.get(0);
        int secondElement = numbers.get(1);

        System.out.println("First element: " + firstElement);
        System.out.println("Second element: " + secondElement);

        // Remove an element by value
        numbers.remove(Integer.valueOf(30));

        System.out.println("LinkedList after removing 30: " + numbers);
    }
}

