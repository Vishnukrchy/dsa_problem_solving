package Array.revision;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondSmallest {
    static void main(String[] args) {
     int arr[] = {1,2,3,4,5,6,11,8,9,10};
     int small = Integer.MAX_VALUE;
     int secondSmall = Integer.MAX_VALUE;
     for (int i=0; i<arr.length;i++){
         if (small>arr[i]){
             secondSmall = small;
             small = arr[i];
         }
         else if (arr[i]>small && arr[i]<secondSmall){
             secondSmall = arr[i];
         }
     }
     System.out.println(" Second smallest element is : "+secondSmall);
     System.out.println(" Second smallest element is : "+secondSmallByStream(arr));

    }

    private static int secondSmallByStream(int[] arr) {

        return Arrays.stream(arr)
                .distinct() // removed duplicates
                .boxed()// convert int to Integer
                .sorted()// sort in ascending  order
                .skip(1)// skip the largest element
                .findFirst()//
                .orElseThrow(() -> new RuntimeException("Not enough elements"));

    }
}
