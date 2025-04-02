package String;

import java.util.HashMap;

/*
@author Vishnu
@Date: 2025-03-18 10:41
Problem Understanding:
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.

Example 1:
Input: s = "egg", t = "add"
Output: true
Input: s1 = "aab", s2 = "xyz"
Output: false
Explanation:  There are two different characters in aab but there are three different charactersin xyz. So there won't be one to one mapping between s1and s2.
 */
public class IsomorphicStrings {
    public static void main(String[] args) {
      String s1="egg";
      String s2="add";
      System.out.println(isIsomorphic(s1,s2));
      System.out.println(isIsomorphic1(s1,s2));

      String s3="foo";
      String s4="bar";
      System.out.println(isIsomorphic(s3,s4));
      System.out.println(isIsomorphic1(s3,s4));
    }
    public static boolean isIsomorphic1(String s, String t) {
        if (s.length() != t.length()) {
            return  false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character,Character> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if (map.containsKey(c1) && map.get(c1)!=c2){
                return false;
            }
            if (map1.containsKey(c2) && map1.get(c2)!=c1){
                return false;
            }
            map.put(c1,c2);
            map1.put(c2,c1);
        }
        return  true;
    }
    public  static  boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)]) {
                return false;
            }
            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
