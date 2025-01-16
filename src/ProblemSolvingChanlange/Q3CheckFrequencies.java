package ProblemSolvingChanlange;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Q3CheckFrequencies {
    public static void main(String[] args) {
        // Example array for testing
        int test[] = {22, 21, 1, 3, 1, 3, 22, 5, 4, 22};

        // Print the results using different methods
        System.out.println("======== Frequencies By Normal Counter ================");
        checkFrequencies1(test.clone()); // Cloning to avoid side effects in original array

        // Print the results using different methods
        System.out.println("======== Frequencies By  Counter ================");
        checkFrequencies(test.clone()); // Cloning to avoid side effects in original array

        System.out.println("======== Frequencies By Count Array ================");
        checkFrequenciesUsingCounterArray(test.clone());

        System.out.println("======== Frequencies By Map ================");
        checkFrequenciesUsingMap(test.clone());
    }
    private static void checkFrequencies1(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j <n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j]=arr[n-1];
                    j--;n--;
                }
            }
            System.out.println(arr[i] + " occurs: " + count + " times");
        }
    }

    // Method 1: Checking frequencies using a normal counter
    private static void checkFrequencies(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            // Skip already visited elements
            if (arr[i] == -1) continue;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    // Mark as visited
                    arr[j] = -1;
                }
            }
            System.out.println(arr[i] + " occurs: " + count + " times");
        }
    }

    // Method 2: Checking frequencies using a count array (efficient for small positive integers)
    public static void checkFrequenciesUsingCounterArray(int[] arr) {
        // Find the maximum element in the array to size the count array
        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max value in the array is: " + max);

        // Create a count array based on the maximum value
        int[] count = new int[max + 1]; // Adding 1 to include the max value as an index

        // Populate the count array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Print frequencies of each number based on the count array
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(i + " occurs: " + count[i] + " times");
            }
        }
    }

    // Method 3: Checking frequencies using a map
    public static Map<Integer, Integer> checkFrequenciesUsingMap(int[] arr) {
        Map<Integer, Integer> frequencyMap = new TreeMap<>();

        // Manually count frequencies without using predefined methods
        for (int i = 0; i < arr.length; i++) {
            // If the number is already in the map, increment its count
            if (frequencyMap.containsKey(arr[i])) {
                frequencyMap.put(arr[i], frequencyMap.get(arr[i]) + 1);
            } else {
                // Otherwise, initialize its count to 1
                frequencyMap.put(arr[i], 1);
            }
        }

        // Print the frequencies
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs: " + entry.getValue() + " times");
        }

        return frequencyMap;
    }
}
