package leet_code;
/*
@Author: Vishnu
@Date: 2022-07-30 10:41
Problem Statement : LeatCode :35. Search Insert Position
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
Examples:
Input: nums = [1,3,5,6], target = 5
Output: 2 EXPLAINATION: The target 5 exists at index 2 and (2) is the first index with a value greater than 5.
Input: nums = [1,3,5,6], target = 2
Output: 1 EXPLAINATION: The target 2 exists at index 1 and (1) is the first index with a value greater than 2.

 */
public class SearchInsertPosition {
    public static void main(String[] args) {
      int nums[] ={1,3,4,5,3,9,0};
      int target=3;
    }
    public int searchInsert1(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low<=high){

        }
    }
    // By using Binary Search
    public  static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
       while (start<=end){
           int mid=(start+end)/2;
           if(nums[mid]==target){
               return  mid;
           } else if (nums[mid]>target){
               end=mid-1;
           } else {
               start=mid+1;
           }
           mid=(start+end)/2;
       }
       return -1;
    }
}
