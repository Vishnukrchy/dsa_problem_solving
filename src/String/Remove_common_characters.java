package String;

import java.util.Scanner;

/*
Given two strings s1 and s2. Modify both the strings such that all the common characters of s1 and s2 are to be removed and the uncommon characters of s1 and s2 are to be concatenated.
Note: If all characters are removed print -1.
Problem Explanation:
We need to:

Identify the common characters in both strings s1 and s2.
Remove the common characters from both strings.
Concatenate the remaining characters from s1 and s2.
If no characters are left in either string, return -1.
 */
public class Remove_common_characters {
    public static String uncommonChars(String s1, String s2) {
        // Implement the logic here
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(s1);

        for (char c:s1.toCharArray()){
            if (s2.indexOf(c) == -1  ){
                sb1.append(c);
            }
//            if (!s1.contains(String.valueOf(c))){
//                sb1.append(c);
//            }
        }
        for (char c:s2.toCharArray()){
            if (s1.indexOf(c) == -1  ){
                sb2.append(c);
            }
        }
        String result = sb1.toString() + sb2.toString();
        if (result.length() == 0) {
            return "-1";
        }
        return result;
    }
    public static String removeCommonCharacters(String s1, String s2) {
        // Implement the logic here

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    s1 = s1.replace(s1.charAt(i), ' ');
                    s2 = s2.replace(s2.charAt(j), ' ');
                }
            }
        }
        if (s1.length() == 0 || s2.length() == 0) {
            return "-1";
        }
        return s1 + s2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = scanner.nextLine();
        String result = removeCommonCharacters(s1, s2);
        System.out.println("Result: " + result);
        System.out.println("Result: " + uncommonChars(s1, s2));
    }

}
