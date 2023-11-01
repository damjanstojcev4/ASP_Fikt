package queues_and_stacks;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Dequeue and process elements
        while (!queue.isEmpty()) {
            int front = queue.poll();
            System.out.println("Dequeued: " + front);
        }
    }
}

