package Array;

import Array.Searching.Linear_serach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
@Author: Vishnu
@Date: 2025-02-03 10:41
Problem Understanding:

Understanding the Problem:
Given an array arr[] of size n, where elements range from 1 to n.
Some numbers may be missing, while others may appear multiple times.
The task is to find the frequency of each number from 1 to n and return an array where:
result[i] represents the count of (i+1) in the original array (since we are using 0-based indexing in programming but the problem statement expects a 1-based count).

Example 1:
Input: arr[] = arr = [2, 3, 2, 3, 5]
Output: [0, 2, 2, 0, 1]
 */
public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        int[] result = frequencyCounter(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.println(frequencyCounter3(arr));
    }
    public static List<Integer> frequencyCounter3(int[] arr) {
        int n = arr.length;

        List<Integer> freqList=new ArrayList<>(Collections.nCopies(n, 0));
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0 && arr[i] <= n) {
//                freqList.set(arr[i] - 1, freqList.get(arr[i] - 1) + 1);
//            }
//        }
        for (int num:arr){
            if (num>=1 && num<=n){
                freqList.set(num-1,freqList.get(num-1)+1);
            }
        }
        return freqList;

    }
    // Function to count the frequency of each number WITH one-based indexing
    public static int[] frequencyCounter(int[] arr) {
//        int[] count = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            //for one-based indexing -1
//            count[arr[i] - 1]++;
//        }
////        return count;
        int n = arr.length;
        int result[] = new int[n];

        for(int i:arr){
            // for one-based indexing -1
            result[i-1]++;
        }
        return result;


    }
    // Function to count the frequency of each number WITH zero-based indexing and count from zero
    public static int[] frequencyCounter2(int[] arr) {

        int max=Arrays.stream(arr).max().getAsInt();
        int count[]=new int[max+1];
        for (int i = 0; i <arr.length ; i++) {
            count[arr[i]]++;
        }
        return count;
    }



}
