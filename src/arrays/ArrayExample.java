package arrays;

public class ArrayExample {

    public static void main(String[] args) {
        // Creating an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing elements by index
        int firstElement = numbers[0]; // 1
        int thirdElement = numbers[2]; // 3

        // Modifying elements
        numbers[1] = 10; // Changing the second element to 10

        // Finding the length of the array
        int length = numbers.length; // 5

        // Iterating through the elements
        System.out.print("Array elements: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

//    In this code:
//
//        An array of integers, numbers, is created and initialized with values.
//        Elements are accessed using indices (e.g., numbers[0]).
//        An element is modified (e.g., changing numbers[1] to 10).
//        The length property is used to find the number of elements in the array.
//        A loop is used to iterate through the elements and print them.
/*        Arrays are versatile data structures and are widely used in programming for various purposes,
       including storing collections of data, implementing data structures, and solving algorithmic problems. */
