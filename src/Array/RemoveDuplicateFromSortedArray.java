package Array;

import ProblemSolvingChanlange.User;

import java.util.HashSet;

/*
@Author: Vishnu kumar
@Date: 2022-07-30 10:41
Problem Understanding:
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

 */
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
       // int arr[] = User.userInputArray();
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicateFromSortedArray obj = new RemoveDuplicateFromSortedArray();
        int result = obj.removeDuplicates(arr);
        System.out.println("The length of the new array is: " + result);
        System.out.println("The new array is: "+removeDuplicates3(arr));

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
    public static int removeDuplicates3(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set=new HashSet<>();
        for (int i:nums){
            set.add(i);
        }
//        int count=0;
//        for (int i=0;i<set.size();i++){
//            nums[count++]=set.iterator().next();
//
//        }
//        User.printArray(nums);
//        return count;
        // Copy back unique elements to the array
        int i = 0;
        for (int num : set) {
            nums[i++] = num;
        }
        User.printArray(nums);
        return set.size();
    }
}
