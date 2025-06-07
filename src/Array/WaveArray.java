package Array;

import ProblemSolving_Challenge.User;

/*
@Author: Vishnu
@Date: 2025-02-27
Problem Understanding:
Given an array of integers, sort the array into a wave like array. In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5...
If there are multiple solutions, find the lexicographically smallest one.
Note: The given array is sorted in ascending order, and you don't need to return anything to change the original array.
Examples:
Input: arr[] = [1, 2, 3, 4, 5]
Output: [2, 1, 4, 3, 5]
Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.
 */
public class WaveArray {
    public static void main(String[] args) {
      int arr[] = {1, 2, 3, 4, 5};
      wave(arr);
    }
    public  static void wave(int[] arr){
        int n =arr.length;
        for (int i=0;i<n-1;i=i+2){
            // swap the adjacent elements
            int temp =arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        User.printArray(arr);
    }
}
