package Array.Searching;

import ProblemSolving_Challenge.User;



/*
Binary Search
-: Binary search is a searching algorithm that finds the position of a target value within a sorted array by repeatedly dividing the search interval in half.
-: The algorithm works by repeatedly comparing the target value to the middle element of the current search interval and adjusting the search interval accordingly.

Time Complexity: O(log n)
Space Complexity: O(1)

example:
   arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
   target = 5
   mid = (0 + 9) / 2 = 4
   arr[mid] = 5
   target == arr[mid]
   return mid

   Binary Search Algorithm
        to search for an element in a sorted array
        low = 0 , high = arr.length - 1
        calculate mid = (low + high) / 2
        case 1: arr[mid] == target
            return mid
        case 2: arr[mid] > target
            high = mid - 1
        case 3: arr[mid] < target
            low = mid + 1

        step 1 - calculate mid = (0 + 9) / 2 = 4
        step2 check if arr[mid] == target then return mid
        step3 check if arr[mid] > target then high = mid - 1
        step4 check if arr[mid] < target then low = mid + 1
        step 5  increment the mid = (low + high) / 2

        now reapeat step 1 to step 4


 */
public class Binary_Serach {
    public static void main(String[] args) {
        int arr[] = User.userInputArray();
        int target = User.userInputNumber();
        arr=User.sortArray(arr);
        System.out.println("============= Original Array is : ==========");
        User.printArray(arr);
        System.out.println("============= Target is : ==========");
        System.out.println(target);
        System.out.println("============= Index is : ==========");
        System.out.println(binarySearch(arr, target));
    }
    public static int binarysearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1; // To track the leftmost occurrence

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid potential overflow

            if (arr[mid] == k) {
                result = mid; // Found the target, but continue searching left
                high = mid - 1; // Narrow down to the left half
            } else if (arr[mid] < k) {
                low = mid + 1; // Search the right half
            } else {
                high = mid - 1; // Search the left half
            }
        }

        return result; // Returns the leftmost occurrence or -1 if not found
    }
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high=arr.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        return -1;

    }

}
