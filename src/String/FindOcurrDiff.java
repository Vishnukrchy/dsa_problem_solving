package String;

import java.util.HashMap;

public class FindOcurrDiff {

        public static int findOccurrenceDifference(int[] arr) {
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();

            // Step 1: Count frequencies
            for (int num : arr) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            // Debug: Print the frequency map
            System.out.println("Frequency Map: " + frequencyMap);

            // Step 2: Find max and min frequencies
            int maxFrequency = Integer.MIN_VALUE;
            int minFrequency = Integer.MAX_VALUE;

            for (int freq : frequencyMap.values()) {
                maxFrequency = Math.max(maxFrequency, freq);
                minFrequency = Math.min(minFrequency, freq);
            }

            // Debug: Print the max and min frequencies
            System.out.println("Max Frequency: " + maxFrequency);
            System.out.println("Min Frequency: " + minFrequency);

            // Step 3: Handle case where all frequencies are the same
            if (maxFrequency == minFrequency) {
                System.out.println("All elements have the same frequency. Returning 0.");
                return 0;
            }

            // Step 4: Return the difference
            int result = maxFrequency - minFrequency;
            System.out.println("Difference between max and min frequencies: " + result);
            return result;
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 2};
            int[] arr2 = {7, 8, 4, 5, 4, 1, 1, 7, 7, 2, 5};

            System.out.println("Result for arr1: " + findOccurrenceDifference(arr1)); // Output: 1
            System.out.println("Result for arr2: " + findOccurrenceDifference(arr2)); // Output: 2
        }


}
