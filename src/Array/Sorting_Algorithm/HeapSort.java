package Array.Sorting_Algorithm;
/*
Author: Vishnu Kumar
Date : 2025-06-15
Problem Understanding:
Heap Sort is a comparison-based sorting algorithm that uses a binary heap data structure. It is an in-place algorithm, meaning it requires only a constant amount of additional space, and it has a time complexity of O(n log n) in the worst case.
Heap Sort works by first building a max heap from the input data, and then repeatedly extracting the maximum element from the heap and placing it at the end of the sorted array. The process continues until all elements are sorted.
If num1 is found in all three arrays, add it to the result set
Examples:
Input: [3, 5, 1, 4, 2]
Output: [1, 2, 3, 4, 5]
   Algorithm Steps:
1. Build a max heap from the input array.
2. Swap the root of the heap (the maximum element) with the last element of the heap.
3. Reduce the size of the heap by one and heapify the root.
4. Repeat steps 2 and 3 until the heap is empty.



 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2};
        heapSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child index
        int right = 2 * i + 2; // right child index

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}
