package Test.infoedge;

import java.util.*;

/*
@Author :vishnu
@Date :2025-06-23 10:41
Problem Understanding:
Given an array of strings strs, group the anagrams together. You can return the answer in any order.



Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams1(strs);
        System.out.println("Grouped Anagrams: " + result);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map to store anagrams
        Map<String, Integer> mp = new HashMap<>();

        List<List<String>> ans = new ArrayList<>();
//
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            // Check if the sorted string is already in the map
            if (mp.containsKey(sortedStr)) {
                ans.get(mp.get(sortedStr)).add(str);
            } else {
                mp.put(sortedStr, ans.size());
                ans.add(new ArrayList<>(Arrays.asList(str)));
            }
        }

        return ans;
    }

    private static List<List<String>> groupAnagrams1(String[] strs) {

       // Create a map to store anagrams
        Map<String, List<String>> anagramMap = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        // Iterate through the array of strings
        for (String str : strs) {
            // Sort the characters of the current string
            char[] sortedChars = str.toCharArray();
            Arrays.sort(sortedChars);
            String sortedString = new String(sortedChars);

            // Get the list of anagrams for the sorted string
            List<String> anagrams = anagramMap.getOrDefault(sortedString, new ArrayList<>());

            // Add the current string to the list of anagrams
            anagrams.add(str);

            // Update the map with the sorted string and its list of anagrams

            anagramMap.put(sortedString, anagrams);
        }

        // Add the lists of anagrams to the result list
        for (List<String> anagrams : anagramMap.values()) {
            result.add(anagrams);
        }

        return result;


    }
}
