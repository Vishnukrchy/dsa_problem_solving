package Array;

import ProblemSolvingChanlange.User;

/*
@Author: Vishnu kumar
@Date: 2022-07-30 10:41
Problem Understanding:
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

 */
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[] = User.userInputArray();
        RemoveDuplicateFromSortedArray obj = new RemoveDuplicateFromSortedArray();
        int result = obj.removeDuplicates(arr);
        System.out.println("The length of the new array is: " + result);

    }

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        // +1 because we need to return the length of the new array
        return i + 1;
    }

    public int removeDuplicates1(int[] nums) {
        int n = nums.length;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
