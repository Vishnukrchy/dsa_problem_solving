package leet_code;
/*
@Author: Vishnu
@Date: 2025-02-04  10:41

Problem Statement : LeatCode :26. Remove Duplicates from Sorted Array
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
example 1:
Input: nums = [1,1,2]
Output: 2, nums = [1,2]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

 */

import java.lang.reflect.Array;

public class Q26_RemoveDuplicatesFromArr {
    public static void main(String[] args) {
        int arr []={1,3,3,1,2,3,4,1,5,4};

    }
    public  static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0;
        for(int j=1;j<n;j++){
            if (nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static int removeDuplicates1(int[] nums) {
        int n = nums.length;
        int count =1;
        for (int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
