package String;

import java.util.HashSet;

/*
remove duplicate from string with insertion order
 exGiven a string s which may contain lowercase and uppercase characters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

Example 1:

Input: s = "geEksforGEeks"
Output: "geEksforG"
Explanation: After removing duplicate characters such as E, e, k, s, we have string as "geEksforG".
 */
public class RemoveDuplicateFromStringWithInsertionOrder {
    static void main() {
        String s = "geEksforGEeks";
        System.out.println("Using HashSet : "+removeDuplicate(s));
        System.out.println("Using Brute Force : "+removeDuplicate2(s));
    }
    // using hash set
    private static String removeDuplicate(String s) {
        HashSet<Character> set =new HashSet<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c =s.charAt(i);
            if (set.add(c)){
              sb.append(c);
            }
        }
        return sb.toString();
    }
    private static String removeDuplicate2(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
