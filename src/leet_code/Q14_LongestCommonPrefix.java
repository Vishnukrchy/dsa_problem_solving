package leet_code;
/*

@Author: Vishnu
@Date: 2025-02-01
Problem Statement : LeatCode :14. Longest Common Prefix
      Given an array of strings, find the longest common prefix (LCP) among all the strings. If there is no common prefix, return an empty string ("").
      Example 1:
      Input: ["flower","flow","flight"]
      Output: "fl"
      Explanation: The longest common prefix among the three strings is "fl".
      Example 2:
      Input: ["dog","racecar","car"]
      Output: ""
      Explanation: There is no common prefix among the input strings.
 */

public class Q14_LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix1(strs));
    }

    public static String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) { // Start from 1 to compare with other words
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0]; // If all characters match, return the whole first word
    }

    public  static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        // Assume the first string is the longest common prefix
        String prefix = strs[0];
        // Loop through the remaining strings
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
