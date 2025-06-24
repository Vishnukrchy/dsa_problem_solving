package Test.infoedge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        System.out.println("Duplicates in the array: " + findDuplicates(arr));
    }
    // by using HashMap
    private static int [] findDuplicates(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num:arr){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }
        // Debug: Print the frequency map
        System.out.println("Frequency Map: " + frequencyMap);
        // Find duplicates
//        return frequencyMap.entrySet().stream()
//                .filter(entry -> entry.getValue() > 1)
//                .mapToInt(entry -> entry.getKey())
//                .toArray();
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int num : arr) {
            if (frequencyMap.get(num) > 1 && !duplicates.contains(num)) {
                duplicates.add(num);
            }
        }
        // Convert List to int[]
        int[] result = new int[duplicates.size()];
        for (int i = 0; i < duplicates.size(); i++) {
            result[i] = duplicates.get(i);
        }
        return result;
    }
    // by using brute force and frequency array
    private static int[] findDuplicatesBruteForce(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        int frequency[] = new int[max + 1];
        for (int num : arr) {
            frequency[num]++;
        }
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 1) {
                duplicates.add(i);
            }
        }
        // Convert List to int[]
        int[] result = new int[duplicates.size()];
        for (int i = 0; i < duplicates.size(); i++) {
            result[i] = duplicates.get(i);
        }
        return result;
    }
}
