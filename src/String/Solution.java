package String;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" ENter The String ");
        String s1=scanner.next();
        String s2=scanner.next();
        //System.out.println(findUncommonChars(s1,s2));
        System.out.println(uncommonChars(s1,s2));
    }
    static String findUncommonChars(String s1, String s2) {
        // Create two sets to store unique characters of both strings
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        // Add characters of s1 to set1
        for (char c : s1.toCharArray()) {
            set1.add(c);
        }

        // Add characters of s2 to set2
        for (char c : s2.toCharArray()) {
            set2.add(c);
        }

        // Create a result set for uncommon characters
        Set<Character> result = new HashSet<>(set1);

        // Perform XOR operation: Add elements from set2, but remove common ones
        result.addAll(set2);
        set1.retainAll(set2); // Find common characters
        result.removeAll(set1); // Remove common characters

        // Convert the result set to a sorted list
        List<Character> sortedList = new ArrayList<>(result);
        Collections.sort(sortedList);

        // Build the result string
        StringBuilder resultStr = new StringBuilder();
        for (char c : sortedList) {
            resultStr.append(c);
        }

        return resultStr.toString();
    }
    static String uncommonChars(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        String r = "";

        // Step 1: Find characters in s1 that are not in s2
        for (int i = 0; i < c1.length; i++) {
            boolean isUncommon = true;
            for (int j = 0; j < c2.length; j++) {
                if (c1[i] == c2[j]) {
                    isUncommon = false;
                    break;
                }
            }
            if (isUncommon && r.indexOf(c1[i]) == -1) {
                r += c1[i];
            }
        }

        // Step 2: Find characters in s2 that are not in s1
        for (int i = 0; i < c2.length; i++) {
            boolean isUncommon = true;
            for (int j = 0; j < c1.length; j++) {
                if (c2[i] == c1[j]) {
                    isUncommon = false;
                    break;
                }
            }
            if (isUncommon && r.indexOf(c2[i]) == -1) {
                r += c2[i];
            }
        }

        return r.isEmpty() ? "-1" : r;
    }
    String findUncommonChars1(String s1, String s2) {
        // Frequency array for 26 lowercase letters
        int[] freq = new int[26];

        // Mark characters in s1
        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }

        // Mark characters in s2
        for (char c : s2.toCharArray()) {
            freq[c - 'a']++;
        }

        // Find uncommon characters (appear exactly once across both strings)
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 1) { // Character appears in only one of the strings
                result.append((char) (i + 'a'));
            }
        }

        return result.toString();
    }
}
