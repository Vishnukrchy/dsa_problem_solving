package Array.revision;

import java.util.Arrays;

/*
Move ALl Zero To end in array
ex
 int
 */


import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {1, 3, 0, 3, 5, 0, 4, 0};
        System.out.println("original array");
        System.out.println(Arrays.toString(arr));
        System.out.println("after moving all zero to end");
        arr = moveAllZeroToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] moveAllZeroToEnd(int[] arr) {
        int[] arr1 = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr1[index] = arr[i];
                index++;
            }
        }
        return arr1;
    }
}
