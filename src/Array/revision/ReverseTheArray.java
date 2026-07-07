package Array.revision;
/*
Resverse the array
 1. 1 2 3 4 5
 2. 5 4 3 2 1

 -- by using 2 pointer
    step 1: start = 0, end = n-1
    step 2: swap(arr[start], arr[end])
    step 3: start++
    step 4: end--
    step 5: repeat step 2-4 until start < end

 */

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseTheArray {
    static void main() {
    int arr []={1,2,3,4,5};

     // using 2 pointer
        int start =0;
        int end =arr.length-1;
        while(start<end){
         arr[start]=arr[start]+arr[end];
         arr[end]=arr[start]-arr[end];
         arr[start]=arr[start]-arr[end];
         start++;
         end--;
        }
        System.out.println(Arrays.toString(arr));
        // by stream
        System.out.println(Arrays.toString(reverseByStream(arr)));




        String[] arr1 = {"A", "B", "C", "D"};

       String [] reversed =IntStream.range(0,arr.length)
                       .mapToObj(i-> arr[arr.length-1-i])
               .toArray(String[]::new);



        System.out.println(Arrays.toString(reversed));






    }

    private static int [] reverseByStream(int[] arr) {
        //
        //return Arrays.stream(arr).boxed().collect(Collectors.toList()).reversed().stream().mapToInt(Integer::intValue).toArray();
//        int [] result = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            result[i] = arr[arr.length - 1 - i];
//        }
//        return result;

        int[] reversed = IntStream.range(0, arr.length) // IntStream.range(0, arr.length) generates indices: 0 → n-1
                .map(i -> arr[arr.length - 1 - i]) // arr[arr.length - 1 - i] maps each index to the reverse position
                .toArray(); // .toArray() collects results into a new array

        return reversed;
    }


}
