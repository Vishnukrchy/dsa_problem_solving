package Test.infoedge;
/*
@Author :vishnu
@Date :2025-06-23 10:41
Problem Understanding:
Given a string s, find the length of the longest substring without duplicate characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }

    private static int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLength = 0;
        int start = 0;
        int[] charIndex = new int[256]; // Assuming ASCII characters

        for (int end=0;end<n;end++) {
            char currentChar = s.charAt(end);
            // If the character is already in the substring, move the start pointer
            if (charIndex[currentChar] > start) {
                start = charIndex[currentChar];
            }
            // Update the last seen index of the character
            charIndex[currentChar] = end + 1; // Store next index to avoid overlap
            // Calculate the length of the current substring
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
    // by using sliding window frequency counter
    private static int lengthOfLongestSubstringSlidingWindow(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        int[] charCount = new int[256]; // Assuming ASCII characters

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            charCount[currentChar]++;
            // If the character count exceeds 1, move the start pointer
            while (charCount[currentChar] > 1) {
                charCount[s.charAt(start)]--;
                start++;
            }
            // Calculate the length of the current substring
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
    // by using brouteforce method
    private static int lengthOfLongestSubstringBruteForce(String s) {
        int n = s.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            boolean[] seen = new boolean[256]; // Assuming ASCII characters
            int currentLength = 0;

            for (int j = i; j < n; j++) {
                char currentChar = s.charAt(j);
                if (seen[currentChar]) {
                    break; // Duplicate found, break the inner loop
                }
                seen[currentChar] = true; // Mark character as seen
                currentLength++;
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }




}
