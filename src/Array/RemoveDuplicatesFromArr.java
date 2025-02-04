package Array;

import ProblemSolvingChanlange.User;

import java.util.Arrays;

public class RemoveDuplicatesFromArr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        removeDuplicates(arr);
    }
    public static void removeDuplicates(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j=i+1;j<n;j++) {
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=arr[n-1];
                    n--;
                    j--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] == arr[j]) {
//                    arr[j] = arr[n - 1];
//                    n--;
//                    j--;
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }

    public static int[] removeDuplicates2(int[] arr) {
        int n = arr.length;

        int max= Arrays.stream(arr).max().getAsInt();
        int count[]=new int[max+1];
        for (int i = 0; i <arr.length ; i++) {
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
}
