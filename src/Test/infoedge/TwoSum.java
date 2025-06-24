package Test.infoedge;

import java.util.HashMap;
import java.util.Map;

/*
@Author :vishnu
@Date :2025-06-23 10:41
Problem Understanding:
 Two Sum Problem:
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 */
public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
    }
    // Brute Force Approach
    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    // Return the indices of the two numbers
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // Return an empty array if no solution is found
    }
    // Optimized Approach using HashMap
    private static int[] twoSumOptimized(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement=target-nums[i];
            // Check if the complement exists in the map
            if(map.containsKey(complement)){
                // Return the indices of the two numbers
                return new int[]{map.get(complement), i};
            }
            // Store the current number and its index in the map
            map.put(nums[i], i);


        }
        return new int[]{}; // Return an empty array if no solution is found

    }
    // Using Stream API
    private static int[] twoSumStream(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{}; // Return an empty array if no solution is found
    }
}
