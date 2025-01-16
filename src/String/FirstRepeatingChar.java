package String;

import java.util.Scanner;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        System.out.println(" ==================== Fixed Array For Testing =================== ");
        String s1="geeksforgeeks";
        System.out.println("First Repeating Character Is : "+firstRepeatingCharacter(s1));
        Scanner scanner =new Scanner(System.in);
        System.out.println(" ENter The String ");
        String s2=scanner.next();
        System.out.println("First Repeating Character Is : "+firstRepeatingCharacter1(s2));
    }

    private static String firstRepeatingCharacter(String s1) {
        int n = s1.length();
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            char c = s1.charAt(i);
            freq[c - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            char c = s1.charAt(i);
            if (freq[c - 'a'] > 1) {
                return c + "";

            }
        }
        return "-1";
    }
    public  static String firstRepeatingCharacter1(String s1) {
        int n = s1.length();
        int count[] = new int[256];

        for (int i = 0; i < s1.length() ; i++) {
            count[s1.charAt(i)]++;
        }
        for (int i = 0; i < n; i++) {
            char c = s1.charAt(i);
            if(count[c]>1){
                return c+"";
            }
        }
        return "-1";
    }

}
