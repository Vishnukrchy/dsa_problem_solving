package Array;

import javax.swing.*;

/*
Problem Understanding:
Given two strings s1 and s2, determine if s2 is a rotation of s1 using only one call to isSubstring (e.g., "waterbottle" is a rotation of "erbottlewat").

Problem Explanation:
To determine if s2 is a rotation of s1, we can check if s2 is a substring of s1 concatenated with itself. If s2 is a substring of s1 concatenated with itself, then s2 is a rotation of s1.

Example:
Input: s1 = "abcd", s2 = "cdab"
Output: true
Explanation: "cdab" is a rotation of "abcd".
Algorithm:
1. Concatenate s1 with itself.
2. Check if s2 is a substring of the concatenated string.

 */
public class StringRotationCheck {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="cdab";

        System.out.println(isRotation(s1,s2));
        System.out.println(isRotation1(s1,s2));
    }

    private static boolean isRotation(String s1, String s2) {
        if (s1.length()!=s2.length()){
            return false;
        }
       // String s3=s1+s2;
       // return s3.indexOf(s2)!=-1;
        String s3=s1.concat(s1);
        return s3.contains(s2);
    }
    public  static  boolean isRotation1(String s1,String s2){
        int n=s1.length();
        if(s1.length()!=s2.length()){
            return false;
        }
        for (int i=0;i<n;i++){
//            if(s1.charAt(i)==s2.charAt(0)){
//                String s3=s1.substring(i)+s1.substring(0,i);
//                if(s3.equals(s2)){
//                    return true;
//                }
//            }
            String leftRotate  =s1.substring(i)+s1.substring(0,i);
            String rightRotate=s1.substring(n-i)+s1.substring(0,n-i);
            if(leftRotate.equals(s2) || rightRotate.equals(s2)){
                return true;
            }
        }
        return false;

    }
    public static boolean isRotation2(String s1,String s2){
        //return s1.length()==s2.length() && (s1+s1).contains(s2);
        s1=s1+s2;
        boolean results=s1.lastIndexOf(s2)!=-1;
        return results;
    }
}
