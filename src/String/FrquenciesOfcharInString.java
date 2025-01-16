package String;

import java.util.HashMap;
import java.util.Map;

public class FrquenciesOfcharInString {
    public static void main(String[] args) {
        System.out.println(" ==================== Fixed Array For Testing =================== ");
        String s1 = "geeksforgeeks";
        System.out.println("First Repeating Character Is : " + frquenciesOfcharInString(s1));
        System.out.println("First Repeating Character Is : " + frquenciesOfcharInString2(s1));
    }

    private static String frquenciesOfcharInString(String s1) {
        int n = s1.length();
        int count[] = new int[256];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            count[s1.charAt(i)]++;
        }
        for (int i = 0; i < n; i++) {
            char c = s1.charAt(i);
            Integer count1 = count[c];
            map.put(c, count1);
//            if (count[c]>=1){
//                map.put(c,count[c]);
//            }

        }
        return map.toString();
    }

    public static String frquenciesOfcharInString2(String s1) {
        int n = s1.length();
        int ferq[] = new int[26];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s1.charAt(i);
            ferq[c - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            char c = s1.charAt(i);
            Integer count1 = ferq[c - 'a'];
            map.put(c, count1);
        }
        return map.toString();
    }

}
