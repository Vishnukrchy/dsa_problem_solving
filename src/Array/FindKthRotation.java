package Array;
/*
@Author: vishnu kumar
@date : 2025-02-24 10:41

Problem Understanding:
Given an increasing sorted rotated array arr of distinct integers. The array is right-rotated k times. Find the value of k.
Let's suppose we have an array arr = [2, 4, 6, 9], so if we rotate it by 2 times so that it will look like this:
After 1st Rotation : [9, 2, 4, 6]
After 2nd Rotation : [6, 9, 2, 4]

Examples:

Input: arr = [5, 1, 2, 3, 4]
Output: 1
Explanation: The given array is 5 1 2 3 4. The original sorted array is 1 2 3 4 5. We can see that the array was rotated 1 times to the right.
 */

public class FindKthRotation {
    public static void main(String[] args) {

    }
    // by Using Linear Search
    public static int findKthRotation1(int[] nums) {
        int n = nums.length;
        int minIndex=0;
        for (int i=1;i<n;i++){
            if (nums[i]<nums[minIndex]){
                minIndex=1;
            }
        }
        return minIndex;
    }

}
