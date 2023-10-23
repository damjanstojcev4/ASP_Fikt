package sorting.insertion_sort;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;  // Get the length of the array.

        // Start iterating through the array from the second element (index 1).
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // Store the current element to be inserted into the sorted subarray.
            int j = i - 1;  // Initialize a variable for comparing elements in the sorted subarray.

            // Move elements of the sorted subarray that are greater than the key
            // to one position ahead of their current position.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key into its proper position in the sorted subarray.
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};  // Create an array of integers to be sorted.
        insertionSort(arr);  // Call the insertionSort function to sort the array.
        System.out.println("Sorted array:");

        // Print the sorted array.
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

