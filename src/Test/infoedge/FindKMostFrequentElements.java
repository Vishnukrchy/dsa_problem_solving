package Test.infoedge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
@Author :vishnu
@Date :2025-06-23 10:41
Problem Understanding:
Given an integer array nums[] and a number k, return the k most frequent elements.
Example:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1, 2]

 */
public class FindKMostFrequentElements {
    public static void main(String[] args) {
    System.out.println("Find K Most Frequent Elements");
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = findKMostFrequentElememnts(nums, k);
        System.out.println("K Most Frequent Elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Using brute force method
        int[] result1 = findKMostFrequentElememnts1(nums, k);
        System.out.println("K Most Frequent Elements using brute force: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
    }
    // By using HashMap
    private static int[] findKMostFrequentElememnts(int[] ints, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : ints) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency Map: " + map);
//        // Debug: Print the frequency map
//        System.out.println("Frequency Map: " + map);
//        // Find the k most frequent elements
//         List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
//        entryList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
//        int[] result = new int[Math.min(i, entryList.size())];
//        for (int j = 0; j < result.length; j++) {
//            result[j] = entryList.get(j).getKey();
//        }
//        // Debug: Print the result
//        System.out.println("K Most Frequent Elements: ");
//        for (int num : result) {
//            System.out.print(num + " ");
//        }
//        return result;
        List<Integer> result = new ArrayList<>();
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() >= i) {
//                result.add(entry.getKey());
//            }
//        }
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
              if(entry.getValue()>=k){
                result.add(entry.getKey());
              }
         }
          // Convert List to int[]
          int[] resultArray = new int[result.size()];
          for (int i = 0; i < result.size(); i++) {
                resultArray[i] = result.get(i);
          }
          return resultArray;
       }

       // By using brute force
    public static  int[] findKMostFrequentElememnts1(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
    for (int num:nums){
        frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
    }
    // Debug: Print the frequency map
        System.out.println("Frequency Map: " + frequencyMap);
        // convert the map entries to a list and sort it by frequency
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        // sort the list in descending order of frequency
        entryList.sort((a,b)->b.getValue().compareTo(a.getValue()));
        // Debug: Print the sorted entry list
        System.out.println("Sorted Entry List: " + entryList);
        // take the first k elements from the sorted list
        int[] result = new int[Math.min(k, entryList.size())];
        for (int i = 0; i < result.length; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
    // By using brute force not using HashMap
    public static int[] findKMostFrequentElememnts2(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count >= k && !result.contains(nums[i])) {
                result.add(nums[i]);
            }
        }
        // Convert List to int[]
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
    // By using brute force not using HashMap
    public static int[] findKMostFrequentElememnts3(int[] nums, int k) {
      int n = nums.length;
      List<Integer> result = new ArrayList<>();
      for (int i=0;i<n;i++){
          int count=0;
          for (int j=i+1;j<n;j++){
              if (nums[i]==nums[j]){
                  count++;
                  //nums[j]=-1; // Mark as visited
                  nums[j]=nums[n-1];
                    n--; // Reduce the size of the array
                  j--; // Recheck at the current index after the swap
              }
          }
            if (count >= k && !result.contains(nums[i])) {
                result.add(nums[i]);
            }
      }
        // Convert List to int[]
//        int[] resultArray = new int[result.size()];
//        for (int i = 0; i < result.size(); i++) {
//            resultArray[i] = result.get(i);
//        }
        Integer[] resultArray =(Integer[]) result.toArray();
        int[] primitiveArray = new int[resultArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            primitiveArray[i] = resultArray[i];
        }
        return primitiveArray;
    }



}
