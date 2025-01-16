package Array;

import ProblemSolvingChanlange.User;

import java.util.LinkedList;

/*
Problem Understanding:
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Examples :

Input: n = 7, A = 2, B = 5, arr[] =  {1, 4, 5, 2, 7, 8, 3}
Output: True
Explanation: It has all elements between range 2-5 i.e 2,3,4,5.

Input: n = 7, A = 2, B = 5, arr[] =  {1, 2, 3, 4, 5, 6, 7}`
Output: False

 */
public class Elements_in_the_Range {
    public static void main(String[] args) {
        int arr[]=User.userInputArray();

        System.out.println("Number of good pairs is : "+countGoodPairs(arr));
        System.out.println("Check Range : "+checkRange(arr,arr.length,2,5));
        System.out.println("Check Elements : "+check_elements(arr,arr.length,2,5));

    }
    public static int countGoodPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]==nums[j] && i<j) {
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean checkRange(int arr[], int n, int A, int B) {
//        for(int i=0;i<n;i++) {
//            if(arr[i]>=A && arr[i]<=B) {
//                return true;
//            }
//        }
//        return false;
        if (arr.length == 0) return false;
        LinkedList<Integer> values = new LinkedList<>();

          for (int val: arr) {
              values.add(val);
          }
          for (int val=A; val<=B; val++) {
              if (!values.contains(val)) return false;
          }
          return true;


    }
    public static int check_elements(int arr[], int n, int A, int B) {
        int count=0;
        for(int i=0;i<n;i++) {
            if(arr[i]>=A && arr[i]<=B) {
                count++;
            }
        }
        return count;

    }
}
