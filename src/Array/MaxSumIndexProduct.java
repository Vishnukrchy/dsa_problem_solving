package Array;

import java.util.Arrays;

/*
@Author: Vishnu kumar
@Date: 2022-07-30 10:41
Problem Understanding:
Given an array, arr of integers. Your task is to write a program to find the maximum value of ∑arr[i]*i, where i = 0, 1, 2,., n-1. You are allowed to rearrange the elements of the array.
Note: Since the output could be large, print the answer modulo 109+7.

Examples:
Input: arr[] = [5, 3, 2, 4, 1]
Output: 40
Explanation: If we arrange the array as [1, 2, 3, 4, 5] then we can see that the minimum index will multiply with minimum number and maximum index will multiply with maximum number. So, 1*0 + 2*1 + 3*2 + 4*3 + 5*4 = 0+2+6+12+20 = 40 mod(109+7) = 40


 */
public class MaxSumIndexProduct {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 4, 1};
       // System.out.println(maxSumIndexProduct(arr));
        System.out.println(maxSumIndexProduct1(arr));

    }

    public static long maxSumIndexProduct1(int[] arr) {
        Arrays.sort(arr);
       long sum=0;
        for (int i = 0; i <arr.length ; i++) {

            sum=(sum+arr[i]*i)%MOD;
        }
        return sum;

    }
//    public static int maxSumIndexProduct(int[] arr) {
//        int n = arr.length;
//        int[] prefixSum = new int[n];
//        prefixSum[0] = arr[0];
//        for (int i = 1; i < n; i++) {
//            prefixSum[i] = prefixSum[i - 1] + arr[i];
//        }
//        int maxSum = 0; // Initialize result
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n-1; j++) {
//                int sum = prefixSum[j] - prefixSum[i - 1];
//                int product = sum * (j - i + 1);
//                maxSum = Math.max(maxSum, product);
//            }
//        }
//        return maxSum % 1000000007; // Return the maximum sum modulo 10^9+7
//    }
}
