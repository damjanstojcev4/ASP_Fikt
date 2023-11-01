package search.linear_search;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target element found at index i
            }
        }
        return -1; // Target element not found in the array
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int target = 11;

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}

