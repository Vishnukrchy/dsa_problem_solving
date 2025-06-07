package leet_code;
/*
@Author: Vishnu Kumar
@Date : 2025-06-07
@Problem: LeetCode - Valid Palindrome Type Easy
✅ Problem Explanation
You're given a string s. You need to determine whether it's a palindrome, considering the following rules:
🧹 Preprocessing:
Convert uppercase to lowercase
Ignore all non-alphanumeric characters
Keep only: a-z, A-Z, 0-9
Then, check if the string reads the same forward and backward

📌 Examples
Example 1:
Input: "A man, a plan, a canal: Panama"
Cleaned: "amanaplanacanalpanama"
✅ It's the same forward and backward → true
Example 2:
Input: "race a car"
Cleaned: "raceacar"
⛔ Not the same forward and backward → false
Example 3:
Input: " "
Cleaned: "" (empty string)
✅ An empty string is considered a palindrome → true
 */
public class ValidPalindrome {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(String s) {
        /*
        Approach: 1
        type 1
        1. Convert the string to lowercase and remove all non-alphanumeric characters.
        Reverse that cleaned string
        Compare cleaned string and reversed string
        type2
        1. Preprocess the string to remove non-alphanumeric characters and convert to lowercase.
        2. Check if the cleaned string is a palindrome by comparing characters from both ends.

         */
        // Edge case: if the string is null or empty, it's a palindrome
        if (s == null || s.isEmpty()) {
            return true;
        }
        StringBuilder cleaned = new StringBuilder();

        // Manual preprocessing: remove non-alphanumeric and convert to lowercase
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Check if c is a letter or digit (without using Character methods)
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {

                // Convert uppercase letters to lowercase
                if (c >= 'A' && c <= 'Z') {
                    cleaned.append((char) (c + 32)); // Convert to lowercase
                } else {
                    cleaned.append(c); // Keep lowercase letters and digits
                }
            }
        }
        // Check if the cleaned string is a palindrome
        String cleanedStr = cleaned.toString();
        // String reversedStr = cleaned.reverse().toString();
        String reversedStr = new String();
        for (int i = 0; i < cleanedStr.length(); i++) {
            reversedStr = cleanedStr.charAt(i) + reversedStr; // Reverse the cleaned string
        }
        return cleanedStr.equals(reversedStr); // Compare cleaned and reversed strings

        // Time complexity: O(n) where n is the len}

    }
    public static boolean isPalindrome1(String s) {
        /*
        type2
        1. Preprocess the string to remove non-alphanumeric characters and convert to lowercase.
        2. Check if the cleaned string is a palindrome by comparing characters from both ends.
         */
        // Edge case: if the string is null or empty, it's a palindrome

        // Preprocess the string: convert to lowercase and keep only alphanumeric characters
        if (s == null || s.isEmpty()) {
            return true; // An empty string is considered a palindrome
        }
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Check if the cleaned string is a palindrome
        String cleanedStr = cleaned.toString();
        int left = 0, right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It's a palindrome
    }
    // aproch: 2 using regex to remove all non-alphanumeric characters and then checking if the string is a palindrome


    // Alternative approach: Using two pointers to check if the string is a palindrome
    public static boolean isPalindrome2(String s) {
        // Approach: 2
        // Using two pointers to check if the string is a palindrome
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Move left pointer to the next alphanumeric character
            while (left < right && !isAlphanumeric(s.charAt(left))) {
                left++;
            }
            // Move right pointer to the previous alphanumeric character
            while (left < right && !isAlphanumeric(s.charAt(right))) {
                right--;
            }
            // Compare characters at left and right pointers
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    }

    private static boolean isAlphanumeric(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
