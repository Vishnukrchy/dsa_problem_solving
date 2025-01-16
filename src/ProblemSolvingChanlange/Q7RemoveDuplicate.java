package ProblemSolvingChanlange;

import java.util.Arrays;

public class Q7RemoveDuplicate  {
    public static void main(String[] args) {
//      int arr[] = User.userInputArray();
        int[] arr = {2, 3, 3, 5, 6, 5, 4};
        // Call the method to remove duplicates

        int arr1[] = removeDuplicateByCounter1(arr);
        int arr2[] = removeDuplicateByCounter2(arr);
        System.out.println();  // For line brea/k

        // Display the new array without duplicates
        System.out.print("New Array (without duplicates): ");
        for (int a : arr1) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("New Array With only unique values: ");
        User.printArray(arr2);

    }

    public static int[] removeDuplicateByCounter1(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
        int count[] = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i]] == 1) {
                arr[j++] = arr[i];
            }
        }
        return Arrays.copyOfRange(arr, 0, j);
    }
    public static int[] removeDuplicateByCounter2(int[] arr) {
        int max =Arrays.stream(arr).max().getAsInt();
        int count[] = new int[max+1];
        for (int i = 0; i < arr.length ; i++) {
            count[arr[i]]++;
        }
        // Step 4: Add elements to the result array only if they appear for the first time
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i]] > 0) {
                // Add the element only once and set its count to 0 to ignore future occurrences
                arr[j++] = arr[i];
                count[arr[i]] = 0;  // Set count to 0 to avoid adding the same element again
            }
        }

        // Step 5: Return the array resized to the correct length (only unique elements)
        User.printArray(arr);
        return Arrays.copyOfRange(arr, 0, j);
    }

    // Method to remove duplicates without using extra inner shifting loop
    private static int[] removeDuplicate(int[] arr) {
        int n = arr.length;

        // Outer loop to go through each element
        for (int i = 0; i < n; i++) {
            // Inner loop to check for duplicates
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    // If a duplicate is found, swap it with the last element
                    arr[j] = arr[n - 1];
                    n--;  // Reduce the array size
                    j--;  // Recheck at the current index after the swap
                }
            }
        }

        // Create a new array with the correct size
        int newArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
    private static int[] removeDuplicate1(int[] arr) {
        int n = arr.length;

        // Iterate over the array and find duplicates
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    // Shift elements to the left to remove the duplicate
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--; // Reduce the size of the array
                    j--; // Recheck the current index
                }
            }
        }

        // Return the array resized to the correct length
        return Arrays.copyOf(arr, n);
    }
}
