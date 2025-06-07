package GFG_160_days_challenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Problem Understanding:
Given an array arr[] of size N, find the second largest element in the array. If there is no second largest element, return -1.
Examples:
Input: arr[] = {1, 2, 3, 4, 5}
Output: 4
Input: arr[] = {5, 5, 5}
Output: -1
Note: The second largest element is the second distinct element in the array, not the second element in terms of index.
 */
public class D1_SecondLarges {

    // approach 1: by sorting the array
    public static int secondLargest(int arr[]) {
        // Check if the array is null or has less than 2 elements
        //  Sorting the array in ascending order
        //  if you want to sort in descending order, you can use Arrays.sort(arr, Collections.reverseOrder());
        //  but here we are sorting in ascending order ans then finding the second largest element
        // if we just find second largest element by last 2 index element its working fine if there are no duplicates
        // but if there are duplicates then we need to check for the second largest element
        // to find second largest tenement by sorting we need also to check this condition is  the last two elements are same or not
        // Time Complexity: O(N log N) due to sorting
        if (arr.length < 2) {
            return -1; // Not enough elements for a second largest
        }

        // Sort the array in descending order
        Arrays.sort(arr);
      //  System.out.println(arr[arr.length-2]); // This will give the second largest element if there are no duplicates
        // Find the second largest element
        for (int i = arr.length-2; i >=0; i--) {
               if (arr[i]!=arr[i+1]){
                     return arr[i]; // Return the second largest element
               }

        }

        return -1; // No second largest element found
    }

    // approach 2: by iterating the array
    public  static int secondLargest2(int arr[]){
        // iterate the array and find the largest and second largest element
        // first we will find the largest element and then we will find the second largest element
        // Time Complexity: O(N)
        if (arr.length < 2) {
            return -1; // Not enough elements for a second largest
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // Iterate through the array to find the largest and second largest elements
        for (int i=0;i<arr.length;i++){
            // If current element is greater than largest, update both largest and second largest
            if (arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            } else if (arr[i]>secondLargest && arr[i]!=largest) {
                // If current element is not equal to largest and is greater than second largest, update second largest
                secondLargest=arr[i];

            }



        }
        // If second largest is still Integer.MIN_VALUE, it means there was no second largest element
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
        }

    // approach 3: by using HashSet
    public static int secondLargest3(int arr[]) {
        // Use a HashSet to store unique elements
        // Then convert the HashSet to an array and sort it
        // Finally, return the second largest element if it exists
        if (arr.length < 2) {
            return -1; // Not enough elements for a second largest
        }

        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }

        if (uniqueElements.size() < 2) {
            return -1; // No second largest element found
        }
        // Convert the HashSet to an array and sort it by .toArray() method its returning an array of Object type
        // so we need to convert it to Integer[] type
        Integer[] uniqueArray = uniqueElements.toArray(new Integer[0]);
        Arrays.sort(uniqueArray);

        return uniqueArray[uniqueArray.length - 2]; // Return the second largest element
    }

    public static void main(String[] args) {
        int[][] testArrays = {
                {1, 2, 3, 4, 5},         // Normal increasing
                {5, 5, 5},               // All elements same
                {2},                     // Single element
                {7, 7, 6, 6, 5},         // Duplicates, descending
                {10, 9, 8, 7, 6},        // Normal decreasing
                {1, 2},                  // Two elements, distinct
                {2, 1},                  // Two elements, reversed
                {Integer.MAX_VALUE, Integer.MIN_VALUE, 0}, // Extreme values
                {3, 3, 2, 1},            // Duplicates at start
                {-1, -2, -3, -4},        // All negative numbers
        };

        int[] expected = {4, -1, -1, 6, 9, 1, 1, 0, 2, -2};

//        for (int i = 0; i < testArrays.length; i++) {
//            int result1 = D1_SecondLarges.secondLargest(testArrays[i].clone());
//            int result2 = D1_SecondLarges.secondLargest2(testArrays[i].clone());
//            System.out.printf("Test %d: Expected=%d, secondLargest=%d, secondLargest2=%d\n",
//                    i + 1, expected[i], result1, result2);
//        }
        // Testing the secondLargest method
//        for (int i = 0; i < testArrays.length; i++) {
//            int result = D1_SecondLarges.secondLargest(testArrays[i].clone());
//            System.out.printf("Test %d: Expected=%d, secondLargest=%d\n",
//                    i + 1, expected[i], result);
//        }
//
//        // Testing the secondLargest2 method
//        for (int i = 0; i < testArrays.length; i++) {
//            int result2 = D1_SecondLarges.secondLargest2(testArrays[i].clone());
//            System.out.printf("Test %d: Expected=%d, secondLargest2=%d\n",
//                    i + 1, expected[i], result2);
//        }

        // Testing the secondLargest3 method
        for (int i = 0; i < testArrays.length; i++) {
            int result3 = D1_SecondLarges.secondLargest3(testArrays[i].clone());
            System.out.printf("Test %d: Expected=%d, secondLargest3=%d\n",
                    i + 1, expected[i], result3);
        }
    }


}
