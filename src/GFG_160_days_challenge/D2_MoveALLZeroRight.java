package GFG_160_days_challenge;
/*
@author: Vishnu Kumar
@Date: 2025-06-09
Problem: Move all zeros to the left side of the array GFG Type Easy
Problem Understanding:
Given an array of size N, move all zeros to the left side of the array while maintaining the order of non-zero elements.
//                map.put(arr[i],map.get(arr[i])+1);
Examples:
Input: arr[] = {1, 0, 2, 0, 3}
Output: {1,2,3,0,0}
 */
public class D2_MoveALLZeroRight {
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 3};
        moveAllZeroRight(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    // Approach: Two Pointer Technique
    public static void moveAllZeroRight(int[] arr) {
//        int n = arr.length;
//        int j = 0; // Pointer for non-zero elements
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != 0) {
//                arr[j++] = arr[i]; // Place non-zero element at the next position
//            }
//        }
//        // Fill remaining positions with zeros
//        while (j < n) {
//            arr[j++] = 0;
//        }
        int left = 0; // Pointer for non-zero elements
        int right = arr.length - 1; // Pointer for zero elements
        while (left <= right) {
            if (arr[left] == 0 && arr[right] != 0) {
                // Swap elements
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (arr[left] != 0) {
                left++;
            } else {
                right--;
            }
        }
    }
}
