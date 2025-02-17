package Array;
/*
@Author: Vishnu kumar
@Date: 2025-02-12   10:41
Problem Understanding:
Given an array of positive numbers, find the maximum product of three numbers.
example:

 */

public class Product_array_puzzle {
    public static void main(String[] args) {

    }
    public static  int [] maxProduct(int[] nums) {
        int n=nums.length;
        int arr[] =new int[n];
        arr[0]=nums[0];
        arr[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            arr[i]=Math.max(arr[i-1],Math.max(arr[i-2]+nums[i],nums[i]));
        }
        return arr;
    }
}
