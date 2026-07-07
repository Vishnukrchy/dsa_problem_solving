package Array.revision;

import java.util.Arrays;

/*
Problem Understanding:
You are given an array of integers. Your task is to sort the array into 0s, 1s and 2s. You should change the array in-place.
 Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.

Examples:
Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.
 */
public class Shift0Or12 {
    static void main() {
        int arr []={0,1,2,0,1,2};
        System.out.println("original array");
        System.out.println(Arrays.toString(arr));
        System.out.println("after sorting");
        System.out.println(" ");
        //Arrays.sort(arr);
        //Arrays.stream(arr).sorted();


        System.out.println(Arrays.toString( sort012(arr)));
    }

    // Without Sorting
    private static int [] sort012(int[] arr) {
        int n = arr.length;

        int count0 = 0, count1 = 0, count2 = 0;
        for (int i : arr) {
            if (i == 0) {
                count0++;
            } else if (i == 1) {
                count1++;
            } else if (i == 2) {
                count2++;
            }
        }
        int index = 0;
        // Fill with 0s
        while (count0-- > 0) {
            arr[index++] = 0;
        }
        // Fill with 1s
        while (count1-- > 0) {
            arr[index++] = 1;
        }
        // Fill with 2s
        while (count2-- > 0) {
            arr[index++] = 2;
        }
        return arr;
    }
    // With Sorting
    private static void sort012_withBubbleSorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


    }
    public void sort012_withInsertionSorting(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid]
                    int temp0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // Swap arr[mid] and arr[high]
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;
            }
        }
    }

}
