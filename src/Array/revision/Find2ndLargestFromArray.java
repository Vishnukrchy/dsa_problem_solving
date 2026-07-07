package Array.revision;

import java.util.Arrays;
import java.util.Comparator;

/*
2. Find the second largest element

 */
public class Find2ndLargestFromArray {
    static void main(String[] args) {
        // ex array
        int[] arr = {1,2,3,4,5,6,11,8,9,10};
        System.out.println(" Second largest element in array is : "+find2ndLargestElement(arr));
        System.out.println(" Second largest element in array is : "+find2ndLargestElementUsingStream(arr));

        int[] arr1 = {5, 1, 9, 3, 9, 7};
        System.out.println(find2ndLargestElementUsingStream(arr1));
    }

    private static int find2ndLargestElementUsingStream(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not enough elements"));
    }

//    private static String find2ndLargestElementUsingStream(int[] arr) {
//        return Arrays.stream(arr)           // convert array to stream
//                .boxed()                   // convert int → Integer
//                .distinct()                // remove duplicates
//                .sorted(Comparator.reverseOrder()) // sort descending
//                .skip(1)                   // skip largest element
//                .findFirst()               // get second largest
//                .map(String::valueOf)      // convert to String
//                .orElse("Not enough elements");
//    }
    //

    // by using  brute force
    private static int  find2ndLargestElement(int[] arr) {
         // we can do by sorting
        // ex  we sort the array in ascending order
        // then second last element will be second largest
        // time complexity is O(nlogn)
        // space complexity is O(1)
//        Arrays.sort(arr);
//        return arr[arr.length-2];

         // using 2 variables
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for (int i =0;i<arr.length;i++){
            if (arr[i]>largest){
                // update second largest is current largest
                secondLargest=largest;
                // update largest
                largest=arr[i];
            } else if (arr[i]>secondLargest && arr[i] !=largest) {
                secondLargest =arr[i];
            }
        }
        return secondLargest;
    }
}
