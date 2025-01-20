package Array.Searching;

import ProblemSolvingChanlange.User;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;
/*
Linear Search
-: Linear search is a simple searching algorithm that checks each element of the list one by one until a match is found or the whole list has been searched.

Time Complexity: O(n)
Space Complexity: O(1)

Example:
Input: arr = [1, 2, 3, 4, 5], key = 4
Output: 3

Linear Search Algorithm:
1. Start from the first element of the list.
2. If the current element matches the key, return its index.
3. If the current element is not equal to the key, move to the next element.
4. Repeat steps 2 and 3 until the end of the list is reached.


 */

public class Linear_serach {
    public static void main(String[] args) {
        int arr[] = User.userInputArray();
    }
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int linearSearch1(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
