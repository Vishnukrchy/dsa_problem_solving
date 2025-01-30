package leet_code;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
@Author: Vishnu
@Date: 2022-07-30 10:41

Problem Statement
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.
In the American keyboard:
the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

Example 1:
Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
 */
public class KeyboardRow {
    public static void main(String[] args) {
      String[] words={"Hello","Alaska","Dad","Peace"};

      System.out.println(keyboardRow(words));
    }

    private static List<String> keyboardRow(String[] words) {
        /*
        .of() method returns an unmodifiable Set containing the specified elements
        -> .of method in collection framework is used to create an unmodifiable set or list
        key Notes:
        -> Set.of() method returns an unmodifiable Set containing the specified elements
         */

        Set<Character> row1 = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
        Set<Character> row2 = Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
        Set<Character> row3 = Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm');
//         row1.remove('q'); UnsupportedOperationException its a unmodifiable set means it cannot be modified
//        List<Set<Character>> rows = List.of(row1, row2, row3);
//        System.out.println(rows);

        List<String> result = List.of();

        for (String word : words) {
//            Set<Character> wordSet = Set.of(word.toLowerCase().toCharArray());
             String lowerCaseWord =word.toLowerCase();

             Set<Character> wordSet=new HashSet<>();

              for (char c:lowerCaseWord.toCharArray()){
                  wordSet.add(c);
              }

              if (row1.containsAll(wordSet)|| row2.containsAll(wordSet) || row3.containsAll(wordSet)){
                  result.add(word);
              }


        }

        return result;

    }
}
