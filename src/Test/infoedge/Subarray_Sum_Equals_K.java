package Test.infoedge;

import java.util.HashMap;
import java.util.Map;

/*
@Author :vishnu
@Date :2025-06-23 10:41
Problem Understanding:
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.
Example:
Input: nums = [1,1,1], k = 2
Output: 2

Explanation: The subarrays are [1,1] (at indices 0 and 1) and [1,1] (at indices 1 and 2).
Example:
Input: nums = [1,2,3], k = 3
Output: 2
explanation: The subarrays are [1,2] (at indices 0 and 1) and [3] (at index 2).
 */
public class Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        int result = subarraySum(nums, k);
        System.out.println("Total number of subarrays whose sum equals to " + k + " is: " + result);
    }

    private static int subarraySum(int[] nums, int k) {
        //
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                // Calculate the sum of the subarray from index i to j
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
    // // Optimized approach using HashMap
    private static int subarraySumOptimized(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize with sum 0 to handle cases where subarray starts from index 0

        for (int num : nums) {
            sum += num; // Update the cumulative sum
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k); // If (sum - k) exists, add its frequency to count
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1); // Update the frequency of the current sum
        }
        return count;
    }
}
