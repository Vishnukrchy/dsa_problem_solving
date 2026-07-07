package Array;

import java.util.Arrays;

/*
move all negative elements to end

    Given an unsorted array arr[ ] having both negative and positive integers. Place all negative elements at the end of the array without changing the order of positive elements and negative elements.

Note: Don't return any array, just in-place on the array.
 ex
 1 -1 3 -3 4 -4
 1 3 4 -1 -3 -4
 */
public class MoveAllnegativeelementstoend {
    static void main() {
        int arr[] = {1, -1, 3, -3, 4, -4};
        moveAllNegativeToTheEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int [] moveAllNegativeToTheEnd(int[] arr) {
        int n=arr.length;
        int temp[]=new int[n];

        int index=0;
        // positive elements store
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0){
                temp[index++]=arr[i];

            }
        }
        // negative elements store
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                temp[index++]=arr[i];

            }
        }
        // copy temp array to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i]=temp[i];
        }
        return arr;
    }
}
