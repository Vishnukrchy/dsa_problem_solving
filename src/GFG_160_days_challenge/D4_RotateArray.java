package GFG_160_days_challenge;

import ProblemSolving_Challenge.User;

/*
@author: Vishnu Kumar
@Date: 2025-06-11
Problem: Rotate Array GFG Type Easy
Problem Understanding:
You are given:
An array arr[] of size n
A number d
Your task is to rotate the array to the left (counter-clockwise) by d positions in-place.
🚩 Left Rotation:
Each element is shifted to the left by one place d times.
Elements at the beginning wrap around to the end.
Also, if d > n, then it’s equivalent to rotating by d % n times.
Example 1:
arr = [1, 2, 3, 4, 5]
d = 2

After 1st left rotation → [2, 3, 4, 5, 1]
After 2nd left rotation → [3, 4, 5, 1, 2]
Example 2:
arr = [10, 20, 30, 40, 50]
d = 3
After 1st left rotation → [20, 30, 40, 50, 10]
After 2nd left rotation → [30, 40, 50, 10, 20]
 */
public class D4_RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        rotateArray(arr, d);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    //Approach 1: Reversal Algorithm ( by Function to rotate the array to the left by d positions time complexity O(n)
    public static void rotateArray(int[] arr, int d) {
        int n=arr.length;
        // Normalize d to handle cases where d > n
        d = d % n; // This ensures we don't do unnecessary full rotations
        if (d == 0 || n <= 1) {
            return; // No rotation needed
        }
        // Step 1: Reverse the first d elements form 0 to d-1 (d-1 because of 0-based index)
        reverse(arr,0,d-1);
        //after reversing first d elements
        User.printArray(arr);
        //step 2: Reverse the remaining n - d elements from d to n-1
        reverse(arr,d,n-1);
        //after reversing remaining n-d elements
        User.printArray(arr);
        // Step 3: Reverse the entire array from 0 to n-1
        reverse(arr,0,n-1);
    }
   //
    private static void reverse(int[] arr, int start, int end) {
        // Helper method to reverse elements in the array from start to end indices
       while (start<end){
           int temp = arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
    }

    // Approach 2: Brute Force Method (Shift One by One)
    public static void rotateArrayBruteForce(int[] arr, int d) {
         int n=arr.length;
         d%=n; // Normalize d to handle cases where d > n
            if (d == 0 || n <= 1) {
                return; // No rotation needed
            }
        // Perform d left shifts one by one
//        for (int i=0;i<d;i++){
//            // save the first element
//            int firstElement = arr[0];
//            // Shift all elements one step to the left
//            for (int j=1;j<n;j++){
//                // Move the current element to the previous position
//                arr[j-1]=arr[j];
//            }
//            // after shifting, place the saved First element at the end
//            arr[n-1]=firstElement;
//        }

        // Using a helper method to rotate the array left by one position d times
        for (int i = 0; i < d; i++) {
            rotateLeftByOne(arr);
        }
    }
    public  static void rotateLeftByOne(int[] arr){
        // Helper method to rotate the array left by one position
        int firstElement = arr[0]; // Save the first element
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i]; // Shift each element one position to the left
        }
        arr[arr.length - 1] = firstElement; // Place the saved first element at the end
    }
    // Approach 3: Using Extra Space (New Array)
    public static void rotateArrayExtraSpace(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Normalize d to handle cases where d > n
        if (d == 0 || n <= 1) {
            return; // No rotation needed
        }
        int[] temp = new int[n]; // Create a temporary array
        // Copy the last d elements to the beginning of temp
        for (int i = 0; i < d; i++) {
            temp[i] = arr[n - d + i];
        }
        // Copy the first n - d elements to the end of temp
        for (int i = 0; i < n - d; i++) {
            temp[d + i] = arr[i];
        }
        // Copy the rotated elements back to the original array
        System.arraycopy(temp, 0, arr, 0, n);
    }


}
/*
✅ Solution Approaches:
🥇 Approach 1 – Brute Force (Shift One by One)
Idea:
Do d left shifts one by one.
In each shift:

Save the first element.

Shift all others one step left.

Place saved element at the end.

Time Complexity: O(n × d)
Space Complexity: O(1)
🔁 Inefficient for large d

⚡ Approach 2 – Optimal Reversal Algorithm
Idea:

First reverse the first d elements.

Then reverse the remaining n - d elements.

Finally reverse the whole array.

This simulates left rotation efficiently.

Time Complexity: O(n)
Space Complexity: O(1) ✅ Best Approach
 */
