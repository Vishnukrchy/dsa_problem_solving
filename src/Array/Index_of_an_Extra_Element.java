package Array;

import java.util.stream.IntStream;

/*
@Author : Vishnu Kumar
@Date : 10/7/2026
@Description : Index of an Extra Element
  example
  arr1 = {1,2,3,4,5}
  arr2 = {1,2,3,4,5,6}
  output = 5
  explanation : 6 is the extra element so index is 5
  approach
  1.using binary search
  2. use stream
  3. brute force
 */
public class Index_of_an_Extra_Element {

    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5,6};

        System.out.println("Brute Force : " + indexOfExtraElement(arr1, arr2));
        System.out.println("Stream      : " + indexOfExtraElement3(arr1, arr2));
        System.out.println("Binary      : " + indexOfExtraElement2(arr1, arr2));
    }

    // Brute Force
    private static int indexOfExtraElement(int[] arr1, int[] arr2) {

        int[] bigger = arr1.length > arr2.length ? arr1 : arr2;
        int[] smaller = arr1.length > arr2.length ? arr2 : arr1;

        for (int i = 0; i < smaller.length; i++) {
            if (bigger[i] != smaller[i]) {
                return i;
            }
        }

        return smaller.length;
    }

    // Stream
    private static int indexOfExtraElement3(int[] arr1, int[] arr2) {

        int[] bigger = arr1.length > arr2.length ? arr1 : arr2;
        int[] smaller = arr1.length > arr2.length ? arr2 : arr1;

        return IntStream.range(0, smaller.length)
                .filter(i -> bigger[i] != smaller[i])
                .findFirst()
                .orElse(smaller.length);
    }

    // Binary Search
    private static int indexOfExtraElement2(int[] arr1, int[] arr2) {

        int[] bigger = arr1.length > arr2.length ? arr1 : arr2;
        int[] smaller = arr1.length > arr2.length ? arr2 : arr1;

        int left = 0;
        int right = smaller.length - 1;
        int ans = smaller.length;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (bigger[mid] == smaller[mid]) {
                left = mid + 1;
            } else {
                ans = mid;
                right = mid - 1;
            }
        }

        return ans;
    }
}