package String;
/*
@Author :vishnu
@Date :2025-02-06 10:41

Problem Understanding:
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
 */
public class FirstOcuurrance {
    public static void main(String[] args) {

    }
    // by using indexOf() method Its return the index of first occ
    public static int strStr(String haystack, String needle) {

        return  haystack.indexOf(needle);
    }
    // by using  Brute Force (Two Pointers)
    public static int strStr1(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
    public static int strStr2(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }


}
