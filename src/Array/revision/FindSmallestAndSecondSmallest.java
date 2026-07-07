package Array.revision;

import java.util.Arrays;

public class FindSmallestAndSecondSmallest {
    static void main() {
        Integer small = Integer.MAX_VALUE;
        Integer secondSmall = Integer.MAX_VALUE;
        int[] arr = {1,2,3,4,5,6,11,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if(small>arr[i]){
                secondSmall = small;
                small = arr[i];
            } else if (arr[i]>secondSmall && arr[i] !=small) {
                secondSmall = arr[i];
            }
        }
        System.out.println("Smallest element: " + small);
        System.out.println("Second smallest element: " + secondSmall);
        
        smallestAndSecondSmallestByStream(arr);
    }

    private static void smallestAndSecondSmallestByStream(int[] arr) {
        int small = Arrays.stream(arr).min().getAsInt();
//        int secondSmall=Arrays.stream(arr)
//                .boxed()
//                        .distinct()
//                                .sorted()
//                                        .skip(1)
//                                                .findFirst()
//                                                        .orElseThrow(() -> new RuntimeException("Not enough elements"));
        int secondSmall = Arrays.stream(arr).filter(x -> x != small).min().getAsInt();
        System.out.println("Smallest element: " + small);
        System.out.println("Second smallest element: " + secondSmall);

    }
}
