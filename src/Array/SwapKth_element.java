package Array;
/*
Problem Understanding:
You are tasked with swapping the k-th element from the beginning with the k-th element from the end in a given array. The array uses 1-based indexing, which means the first element is at index 1 (not 0 like in Java).
 */

import java.util.List;

public class SwapKth_element {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
    }
    public static void swapKthElement(int[] arr, int k) {
        int n = arr.length;
        int temp = arr[k - 1];
        arr[k - 1] = arr[n - k];
        arr[n - k] = temp;
    }
    public void swapKth(int k, List<Integer> arr) {
        int n = arr.size(); // Size of the list

        // Validate k: 1-based index must be within the array size
        if (k <= 0 || k > n) return;

        // Calculate the indices to swap (convert 1-based to 0-based)
        int startIndex = k - 1;  // 1-based to 0-based index
        int endIndex = n - k;    // Opposite index from the end

        // Perform the swap
        int temp = arr.get(startIndex);
        arr.set(startIndex, arr.get(endIndex));
        arr.set(endIndex, temp);
    }
}
