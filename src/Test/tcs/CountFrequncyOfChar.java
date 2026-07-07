package Test.tcs;

import java.util.HashMap;
import java.util.Map;

/*
Count frequency of each character in a string using HashMap

 */
public class CountFrequncyOfChar {
    static void main() {
        String str = "hello";
        countFrequency(str);
    }

    private static void countFrequency(String str) {
        HashMap<Character,Integer> map=new HashMap<>();

//
//        for (int i = 0; i < str.length(); i++) {
//         if (map.containsKey(str.charAt(i))){
//             map.put(str.charAt(i),map.get(str.charAt(i))+1);
//         }else {
//             map.put(str.charAt(i),1);
//         }
//        }

        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
