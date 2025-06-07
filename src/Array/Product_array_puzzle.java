package Array;
/*
@Author: Vishnu kumar
@Date: 2025-02-12   10:41
Problem Understanding:
Given an array of positive numbers, find the maximum product of three numbers.
example:
Input: arr[] = [10, 3, 5, 6, 2]
Output: [180, 600, 360, 300, 900]
Explanation: For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.

 */

import ProblemSolving_Challenge.User;

public class Product_array_puzzle {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int[] res = maxProduct(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        int[] arr1= maxProduct1(arr);
        User.printArray(arr1);
    }

    public static int[] maxProduct(int[] nums) {

        int n = nums.length;
        int resultArr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                product = product * nums[j];
            }

            resultArr[i] = product;

        }
        return resultArr;

    }

    public static int[] maxProduct1(int[] nums) {
        int n = nums.length;
        int newArr[] = new int[n];

        for (int i=0;i<n;i++){
            int product=1;
            for (int j = 0; j < n; j++) {
                if (i!=j){
                    product=product*nums[j];
                }
            }
            newArr[i]=product;
        }
        return newArr;
    }
    public static  int [] maxProduct3(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        // Step 1: Compute prefix product directly in res[]
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * arr[i - 1];
        }

        // Step 2: Compute suffix product and multiply with prefix product in res[]
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= suffixProduct;
            suffixProduct *= arr[i];
        }

        return res;
    }
//    public static  int [] maxProduct(int[] nums) {
//        int n=nums.length;
//        int arr[] =new int[n];
//        arr[0]=nums[0];
//        arr[1]=Math.max(nums[0],nums[1]);
//        for(int i=2;i<n;i++){
//            arr[i]=Math.max(arr[i-1],Math.max(arr[i-2]+nums[i],nums[i]));
//        }
//        return arr;
//    }
}
