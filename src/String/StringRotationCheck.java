package String;
/*
@Author: vishnu Kumar
@Date: 2025-03-03 10:41

Problem Understanding:
Given two strings s1 and s2. Return true if the string s2 can be obtained by rotating (in any direction) string s1 by exactly 2 places, otherwise, false.
Note: Both rotations should be performed in same direction chosen initially.
Examples:
Input: s1 = "amazon", s2 = "azonam"
Output: true
Explanation: "amazon" can be rotated anti-clockwise by two places, which will make it as "azonam".
 */
public class StringRotationCheck {
    public static void main(String[] args) {
        String s1="amazon";
        String s2="azonam";
        System.out.println(checkRotation(s1,s2));
    }

    private static boolean checkRotation(String s1, String s2) {
        if(s1.length()!=s2.length()) return  false;
        int n=s1.length();
        if (n<2) return s1.equals(s1);

        // Left Rotation: Move first 2 characters to the end
        String leftRotate=s1.substring(2)+s1.substring(0,2);

        // Right Rotation: Move last 2 characters to the beginning
        String rightRotate = s1.substring(n-2)+s1.substring(0,n-2);

        // Check if s2 matches either rotated version
        boolean result =s2.equals(leftRotate) || s1.equals(rightRotate);
        return  result;
    }
}
