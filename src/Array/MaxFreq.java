package Array;

import java.util.HashMap;

public class MaxFreq {
    public static void main(String[] args) {
        int arr [] = {2,3,3,5,6,5,5,4};
        maxFrequency(arr);
       System.out.println(maxFreq(arr));


    }
    public static  void maxFrequency(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > max) {
                max = map.get(arr[i]);
            }
        }
        System.out.println(max);

    }
    public static  int maxFreq(int arr[]) {
        int max = arr[0];
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    max = arr[i - 1];
                }
                count = 1;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            max = arr[arr.length - 1];
        }
        return max;
    }
}
