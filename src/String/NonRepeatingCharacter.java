package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
      String s = "geeksforgeeks";
      //  System.out.println(s.indexOf("a"));
       // System.out.println(new NonRepeatingCharacter().nonRepeatingCharacter(s));
        System.out.println(nonRepeatingCharacter(s));
        System.out.println(nonRepeatingCharacter1(s));
    }
    // By Using Broute Force (Two Pointers)
    public static  String nonRepeatingCharacter1(String s) {
        int n = s.length();
        for (int i=0;i<n;i++){
            boolean isUnique = true;
            for (int j=0;j<n;j++){
                if (i!=j && s.charAt(i)==s.charAt(j)){
                    isUnique = false;
                    break;
                }
            }
            if (isUnique){
                return s.charAt(i)+"  at " + i;
            }
        }

        return -1+" ";
    }
    // By Frequency Counter
    public static String nonRepeatingCharacter(String s) {
        int n = s.length();
        int freq[]=new int [256];
        for (int i=0;i<n;i++){
            freq[s.charAt(i)]++;
        }
        for (int i=0;i<n;i++){
            if (freq[s.charAt(i)]==1){
                return s.charAt(i)+"  at " + i;
            }
        }
        return -1+" ";
    }
    // By Using HashSet/m
    public static String nonRepeatingCharacter3(String s) {
        int n = s.length();

        Map<Character,Integer> charcount = new HashMap<>();
                for(char c:s.toCharArray()){
                    charcount.put(c,charcount.getOrDefault(c,0)+1);
                }

                for (int i=0;i<n;i++){
                    if (charcount.get(s.charAt(i))==1){
                        return s.charAt(i)+"  at " + i;
                    }
                }
                return -1+" ";

       // HashSet<Character> charCount = new HashSet<>();
//        for (int i=0;i<n;i++){
//            if (set.contains(s.charAt(i))){
//                set.remove(s.charAt(i));
//            }else {
//                set.add(s.charAt(i));
//            }
//        }
//        for (int i=0;i<n;i++){
//            if (set.contains(s.charAt(i))){
//                return s.charAt(i)+"  at " + i;
//            }
//        }
//        return -1+" ";
    }
    // By Sorting
    public static String nonRepeatingCharacter2(String s) {
        char arr[] = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = ' ';
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != ' ') {
                return arr[i]+"  at " + i;
            }
        }
        return -1+" ";
    }

}
