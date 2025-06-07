package Array.Sorting_Algorithm;

import java.util.Arrays;

/*
Problem Understanding:
Merge Sort is a divide and conquer algorithm. It divides the given array into two halves, calls itself for the two halves and then merges the two sorted halves.

Example:
Input: 64, 34, 25, 12, 22, 11, 90
Output: 11, 22, 25, 34, 64, 90

Sorting Algorithm:
    Time Complexity: O(n log n)
    step 1: Divide the array into two halves.
    step 2: Sort the two halves.
    step 3: Merge the two sorted halves.

    Merge Steps:



 */
public class Merge_Sort {

    public static void mergeSort(int[] arr, int left, int right) {
        System.out.println("Calling mergeSort on: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));

        if (left < right) {
            int mid = (left + right) / 2;
            System.out.println("Dividing array into two halves: " +
                    Arrays.toString(Arrays.copyOfRange(arr, left, mid + 1)) + " and " +
                    Arrays.toString(Arrays.copyOfRange(arr, mid + 1, right + 1)));

            // Recursively divide the array into two halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge function to combine two sorted arrays
    public static void merge(int[] arr, int left, int mid, int right) {
        System.out.println("Merging: " +
                Arrays.toString(Arrays.copyOfRange(arr, left, mid + 1)) + " and " +
                Arrays.toString(Arrays.copyOfRange(arr, mid + 1, right + 1)));

        int n1 = mid - left + 1; // Size of left subarray
        int n2 = right - mid;    // Size of right subarray

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray (if any)
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray (if any)
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

        System.out.println("After merging: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 5, 2, 7, 4, 1};
        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
