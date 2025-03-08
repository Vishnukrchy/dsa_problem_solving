package Array;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.IntStream.range;

/*
@Author: Vishnu Kumar
@Date : 2025-03-08 10:41
Problem Understanding:
Given an integer array nums, return true if the array is sorted in non-decreasing order, otherwise return false.
example 1:
Input: nums = [1,2,3,4,5]
Output: true
Explanation: The array is sorted in non-decreasing order.

Example 2:
Input: nums = [5,4,3,2,1]
Output: false
Explanation: The array is not sorted in non-decreasing order.
 */
public class CheckSortedArray {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        System.out.println(isSorted(arr));
        System.out.println(isSorted2(arr));
    }

    private static boolean isSorted(int[] arr) {
        int n=arr.length;
        for (int i=1;i<n;i++){
            // If any element is smaller than the previous one, it's not sorted
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
        return  true;
    }
    public static boolean isSorted2(int[] arr) {

       boolean result = IntStream.range(1, arr.length)
                .allMatch(i->arr[i]>=arr[i-1]);
        return result;
        //return range(1, arr.length).allMatch(i->arr[i]>=arr[i-1]);
    }
    public  static boolean isSorted3(int[] arr) {
        return Stream.iterate(1, i -> i + 1)
                .limit(arr.length - 1)
                .allMatch(i -> arr[i] >= arr[i - 1]);
    }

}
