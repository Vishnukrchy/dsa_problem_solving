package Array;
/*

@Author :Vishnu kumar
@Date: 2022-07-30 10:41

Problem Statement -GFG
Given an array arr[] of positive integers and another integer target. Determine if there exists two distinct indices such that the sum of there elements is equals to target.

Examples:
Input: arr[] = [1, 4, 45, 6, 10, 8], target = 16
Output: true
Explanation: arr[3] + arr[4] = 6 + 10 = 16.
Input: arr[] = [1, 2, 4, 3, 6], target = 11
Output: false
Explanation: None of the pair makes a sum of 11.
 */


import java.util.HashMap;
import java.util.HashSet;

public class TwoSum_Pair_with_Given_Sum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int target = 16;
        System.out.println(hasPairWithSum(arr, target));

        int arr1[] = {1, 2, 4, 3, 6};
        int target1 = 11;
        System.out.println(hasPairWithSum2(arr1, target1));
    }


    // Approach 1 By Brute Force technique
    public static boolean hasPairWithSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    //Approach 2 By using HashMap // Hashset
    public  static  boolean hasPairWithSum2(int[] nums, int target) {

//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement)) {
//                return true;
//            }
//            map.put(nums[i], i);
//        }
//        return false;

        HashSet<Integer> seen =new HashSet<>();

        for(int i:nums){
            int complements=target-i;
            if (seen.contains(complements)){
                return  true;
            }
            seen.add(i);

        }
        return false;


    }


    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

}


