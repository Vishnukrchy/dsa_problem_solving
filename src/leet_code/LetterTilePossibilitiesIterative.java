package leet_code;
/*
@Author: Vishnu
@Date: 2025-02-017  10:41
Problem Statement : LeatCode :1079. Letter Tile Possibilities
You have n  tiles, where each tile has one letter tiles[i] printed on it.

Return the number of possible non-empty sequences of letters you can create.
Example 1:
Input: "AAB"
Output: 8
Explanation: The possible sequences are "A", "A", "B", "AA", "AAB", "BA", "AAB", "BAA".
 */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LetterTilePossibilitiesIterative {
    public static void main(String[] args) {
        String s = "AAB";
     //  System.out.println("Output :"+numTilePossibilities(s));
       // System.out.println("Output :"+numTilePossibilities(s));
        System.out.println("Output :"+numTilePossibilities1(s));
    }
    public static int numTilePossibilities1(String tiles) {
        Set<String> uniqueSequences = new HashSet<>();
        char[] arr = tiles.toCharArray();
        boolean[] used = new boolean[arr.length];

        generateSequences(arr, used, "", uniqueSequences);
        System.out.println(uniqueSequences);
        return uniqueSequences.size();
    }

    private static void generateSequences(char[] arr, boolean[] used, String current, Set<String> uniqueSequences) {
        if (!current.isEmpty()) {
            uniqueSequences.add(current);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                generateSequences(arr, used, current + arr[i], uniqueSequences);
                used[i] = false; // Backtrack
            }
        }
    }

    public static int numTilePossibilities(String tiles) {
        Set<String> uniqueSequences = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        System.out.println("Initial tiles: " + tiles);

        // Start with single-character sequences
        for (char ch : tiles.toCharArray()) {
            queue.offer(String.valueOf(ch));
            System.out.println("Adding initial sequence to queue: " + ch);
        }

        System.out.println("=== Processing Queue ===");

        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.println("Dequeued: " + current);

            // Add to the set if it's new
            if (uniqueSequences.add(current)) {
                System.out.println("Added to unique sequences: " + current);

                // Generate new sequences
                for (char ch : tiles.toCharArray()) {
                    String newSequence = current + ch;
                    queue.offer(newSequence);
                    System.out.println("Generated and added to queue: " + newSequence);
                }
            }
        }

        System.out.println("Final unique sequences: " + uniqueSequences);
        return uniqueSequences.size();
    }


//    public  static  int numTilePossibilities(String tiles) {
//      int n = tiles.length();
//      int[] freq = new int[26];
//      for (int i = 0; i < n; i++) {
//          freq[tiles.charAt(i) - 'A']++;
//      }
//      int result = 1;
//      for (int i = 0; i < 26; i++) {
//          if (freq[i] > 0) {
//              result *= (freq[i] + 1);
//              freq[i] = 0;
//          }
//      }
//      return result - 1;
//
//
//
//    }
}
