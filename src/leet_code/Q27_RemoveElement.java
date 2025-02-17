package leet_code;
/*
@Author: Vishnu
@Date: 2025-02-05  10:41

Problem Statement : LeatCode :27. Remove Element
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

Example 1:
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).

 */

public class Q27_RemoveElement {
    public static void main(String[] args) {


    }
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int index=0;
        for (int i = 0; i <n ; i++) {
            if (nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }

        }
        return  index;
    }
    public int removeElement1(int[] nums, int val) {
        int n=nums.length;
        int count=0;
        for (int i = 0; i <n ; i++) {
            if (nums[i]==val){
                count++;
            }else{
                nums[i-count]=nums[i];
            }
        }
        return  n-count;
    }
}
