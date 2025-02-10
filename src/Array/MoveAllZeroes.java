package Array;

/*
@Author: Vishnu Kumar
@Date: 2025-02-06 10:41
Problem Understanding:
Given an array arr[] of size N, move all the zeros to the end of the array.

Examples:
Input: arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}
Output: arr[] = {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}

Input: arr[] = {0, 1, 2, 3, 4}
Output: arr[] = {1, 2, 3, 4, 0}
*/

import java.util.Arrays;

public class MoveAllZeroes {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};

        System.out.println("============= Move All Zeroes to the End of the Array: ==========");
        pushZerosToEnd(arr.clone());  // Cloning to avoid modifying the same array
        pushZerosToEnd1(arr.clone());

        System.out.println("============= Move All Zeroes to the Left of the Array: ==========");
        moveLeftAllZero(arr.clone());
        moveLeftAllZero1(arr.clone());
    }

    /**
     * Moves all zeroes to the end while maintaining the order of non-zero elements.
     * Uses an index to track the position where the next non-zero element should be placed.
     */
    public static void pushZerosToEnd(int[] nums) {
        int n = nums.length;
        int insertPosition = 0;

        // Move all non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[insertPosition++] = num;
            }
        }

        // Fill the remaining places with zeroes
        for (int i = insertPosition; i < n; i++) {
            nums[i] = 0;
        }

        printArray(nums);
    }

    /**
     * Moves all zeroes to the end while maintaining the order of non-zero elements.
     * Similar approach but using a different loop style.
     */
    public static void pushZerosToEnd1(int[] nums) {
        int n = nums.length;
        int count = 0;

        // Move non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        // Fill the remaining places with zeroes
        while (count < n) {
            nums[count++] = 0;
        }

        printArray(nums);
    }

    /**
     * Moves all zeroes to the left while maintaining the order of non-zero elements.
     */
    public static void moveLeftAllZero(int[] nums) {
        int n = nums.length;
        int index = n - 1; // Pointer to place non-zero elements

        // Move non-zero elements towards the right
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                nums[index--] = nums[i];
            }
        }

        // Fill remaining leftmost places with zeroes
        while (index >= 0) {
            nums[index--] = 0;
        }

        printArray(nums);
    }

    /**
     * Moves all zeroes to the left using an alternate approach.
     */
    public static void moveLeftAllZero1(int[] nums) {
        int index = nums.length - 1;

        // Move non-zero elements to the rightmost available position
        for (int num : nums) {
            if (num != 0) {
                nums[index--] = num;
            }
        }

        // Fill remaining leftmost places with zeroes
        for (int i = index; i >= 0; i--) {
            nums[i] = 0;
        }

        printArray(nums);
    }

    /**
     * Utility function to print an array.
     */
    private static void printArray(int[] nums) {
        System.out.println(Arrays.toString(nums));
    }
}
