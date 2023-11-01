package queues_and_stacks;

import java.util.LinkedList;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop and process elements
        while (!stack.isEmpty()) {
            int top = stack.pop();
            System.out.println("Popped: " + top);
        }
    }
}

