package basic;
/*
Given two strings S1 and S2 as input. Your task is to concatenate two strings and then reverse the string. Finally print the reversed string.

Example 1:

Input: S1 = "Geeks" , S2 = "forGeeks"
Output: "skeeGrofskeeG"
Explanation: Concatenating S1 and S2 to
get "GeeksforGeeks" then reversing it to
"skeeGrofskeeG".
 */

public class JavaString {
    public static void main(String[] args) {
        String s1 = "Geeks";
        String s2 = "forGeeks";
        String result = reverseString(s1 + s2);
        System.out.println(result);
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
    public static String reverseString2(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    public static String reverseString3(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
