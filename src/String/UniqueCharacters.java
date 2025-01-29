package String;
/*
@author Vishnu
@Date: 2022-07-30 10:41

Problem Statement
//Given  two strings s and t, determine if they are isomorphic.
//isomorphic means that the two strings can be replaced by one another without any changes in the order of characters.
//Example 1:
string s1: geeksforgeeks
string s2: geeksquiz

 Final unique character string: fioqruz


 */
public class UniqueCharacters {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "geeksquiz";
        String result = uniqueCharacters(s1, s2);
        System.out.println("Final unique character string: " + result);
    }

    public static String uncommonCharacters1(String s1, String s2) {

        StringBuilder sb = new StringBuilder();
        int freq1[] =new int[26];
        int freq2[] =new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

//        for (int i = 0; i < 26; i++) {
//            if (freq1[i] != freq2[i]) {
//                sb.append((char) (i + 'a'));
//            }
//        }

        for (char c='a';c<='z';c++){
            if (freq1[c-'a'] != freq2[c-'a']) {
                sb.append(c);
            }
        }
        return sb.toString();

    }

///  important logic
    private static String uniqueCharacters(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.indexOf(s1.charAt(i)) != s2.indexOf(s1.charAt(i))) {
                sb.append(s1.charAt(i));
            }
        }
        return sb.toString();
    }

}
