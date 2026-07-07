package Array.revision;

import java.util.Arrays;

public class FindSmallestElement
{
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,11,8,9,10};

        int small =Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (small> arr[i]){
                small=arr[i];
            }
        }
        System.out.println(" smallest  no  is "+small);
        System.out.println(" smallest  no  is "+smallestByStream(arr));

    }

    private static int smallestByStream(int[] arr) {
        return Arrays.stream(arr)// convert array to stream
                .min()// find minimum element
                .getAsInt();// get minimum element as int
    }
}
