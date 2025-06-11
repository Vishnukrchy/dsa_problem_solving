package GFG_160_days_challenge;

import java.util.ArrayList;
import java.util.List;

public class D3_ReverseArray {
    public static void main(String[] args) {

    }
    // APPROACH 1 : By Two Pointer Technique
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }
    // APPROACH 2 : By Using Recursion
    public static void reverseArrayRecursion(int[] arr, int left, int right) {
       if(left>=right) {
           return; // Base case: if left index is greater than or equal to right index, return
       }
         // Swap elements at left and right indices
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        // update indices
        reverseArrayRecursion(arr, left + 1, right - 1);

    }
    // APPROACH 3 : By Using Java Collections
    public static void reverseArrayCollections(int[] arr) {
        // Convert the array to a List
        List<Integer> list=new ArrayList<>();
        for (int num:arr){
            list.add(num);
        }
         // Reverse the List
        // list.reversed(); // by using Java Collections

        // Alternatively, you can manually reverse the List
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
        // Alternatively, you can use Collections.reverse(list); to reverse the list
        // Collections.reverse(list); // by using Java Collections
        // by  lambda expression
        //list.sort((a,b)->b-a); // This will sort the list in descending order, effectively reversing it
        // Note: The above line sorts the list in descending order, which is not exactly reversing it.
        // Now, the List is reversed, and we can convert it back to an array

        // Convert the List back to an array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }
    // APPROACH 4 : By Using Streams (Java 8+)
    public static void reverseArrayStreams(int[] arr) {
        // Convert the array to a List, reverse it using streams, and convert it back to an array
        arr = java.util.Arrays.stream(arr)
                .boxed() // Convert int to Integer
                .sorted((a, b) -> b - a) // Sort in descending order
                .mapToInt(Integer::intValue) // Convert back to int
                .toArray();
    }
    // APPROACH 5 : By  Brute Force
    public static void reverseArrayBruteForce(int[] arr) {
        int n = arr.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - 1 - i]; // Fill the new array with elements in reverse order
        }
        // Copy the reversed array back to the original array
        System.arraycopy(reversed, 0, arr, 0, n);
    }
}
/*
lution 1: Brute-force (Shift Elements One-by-One)
Approach:
Rotate the array d times.

In each rotation:

Store the first element.

Shift all other elements one step to the left.

Put the stored element at the end.

🔸 Pros:
Easy to understand.

🔸 Cons:
Time Complexity: O(n × d) → inefficient for large d

Space Complexity: O(1)

🔸 Solution 2: Optimal In-Place Reversal Algorithm (Recommended) ✅
Approach:
Normalize d: d = d % n

Reverse first d elements.

Reverse the remaining n-d elements.

Reverse the whole array.

Example:
For arr = [1, 2, 3, 4, 5], d = 2:

Reverse first 2 → [2, 1, 3, 4, 5]

Reverse last 3 → [2, 1, 5, 4, 3]

Reverse whole array → [3, 4, 5, 1, 2]

🔸 Time Complexity: O(n)
🔸 Space Complexity: O(1)

 */
/*
// by using brute force
public class RotateArrayBruteForce {
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;  // normalize if d > n

        for (int i = 0; i < d; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        leftRotate(arr, d);

        // Print result
        for (int i : arr) System.out.print(i + " ");
    }
}

 public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;  // normalize if d > n

        // Step 1: Reverse first d
        reverse(arr, 0, d - 1);

        // Step 2: Reverse remaining
        reverse(arr, d, n - 1);

        // Step 3: Reverse full array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        leftRotate(arr, d);

        // Print result
        for (int i : arr) System.out.print(i + " ");
    }
 */