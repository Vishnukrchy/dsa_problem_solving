package Array;
/*
Problem Understanding:
Given an array arr[], the size is reduced by 1 element at each step. In the first step, the maximum element would be removed, while in the second step, the minimum element of the remaining array would be removed, in the third step again the maximum, and so on. Continue this till the array contains only one element. And find the final element remaining in the array.
Examples:
Input: arr[] = [7, 8, 3, 4, 2, 9, 5]
Ouput: 5
Explanation:In first step '9' would be removed, in 2nd step '2' will be removed, in third step '8' will be removed and so on. So the last remaining element would be '5'.
 */

import java.util.Arrays;

public class RemainingElement {

    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 4, 2, 9, 5};
        int[] arr1 = {7, 8, 3, 4, 2, 9, 5};
        System.out.println(remainingElement(arr));
        System.out.println(remainingElement(arr1));
    }
    public static  int remainingElement(int[] arr) {
        // first step is sort the array
        Arrays.sort(arr);
        int min=0;
        int max=arr.length-1;
//        while(min<max){
//            min++;
//            max--;
//        }
        boolean removeMax = true;  // Flag to decide whether to remove max or min

        while (max-min>0){
            if (removeMax) {
               // arr[max] = arr[max-1];
                max--;
            } else {
              //  arr[min] = arr[min+1];
                min++;
            }
            removeMax = !removeMax;
        }

        return arr[min];
    }
}
