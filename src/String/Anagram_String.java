package String;

import java.util.HashMap;

/*
 * @author Vishnu
 * @Date: 2022-07-30 10:41
 * @Description:
 * Problem Statement
 * Given two strings str1 and str2, determine if they are anagrams of each other.
 * Example 1:
 * Input: str1 = "anagram", str2 = "nagaram"
 * Output: true
 * Example 2:
 * Input: str1 = "rat", str2 = "car"
 * Output: false

 */
public class Anagram_String {

    public static void main(String[] args) {

    }
    public boolean isAnagram1(String str1, String str2) {
        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a frequency map for the first string
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Check the second string against the frequency map
        for (char c : str2.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        return true;
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
