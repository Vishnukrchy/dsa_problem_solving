package Array.revision;

import java.util.Arrays;

/*
1. Find the largest element in an array
 */
public class FIndLargestElementOfArray {
    public static void main(String[] args) {
        // ex array
        int[] arr = {1,2,3,4,5,6,11,8,9,10};
        System.out.println(" Largest element in array is : "+findLargestElement(arr));
        System.out.println(" Largest element in array is : "+findLargestElementUsingStream(arr));
    }
    public static int findLargestElement(int[] arr) {
        int large =0;
        int  n=arr.length;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>large){
                large=arr[i];
            }

        }
        return large;

        // by using sorting
//        Arrays.sort(arr);
//        return arr[n-1];
    }
    // by using stream
    public static int findLargestElementUsingStream(int[] arr) {

        // Creating stream

        int large = Arrays.stream(arr).max().getAsInt();
        return large;

    }
}
