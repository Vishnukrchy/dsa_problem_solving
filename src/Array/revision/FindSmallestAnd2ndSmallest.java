package Array.revision;

import java.util.Arrays;

public class FindSmallestAnd2ndSmallest {
    static void main() {
        int arr []={1,2,3,4,5,6,11,8,9,10};
        int small=Integer.MAX_VALUE;
        int secondSmall=Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<small){
                secondSmall=small;
                small=arr[i];
            } else if (arr[i]>small && arr[i]<secondSmall) {
                secondSmall=arr[i];
            }
        }
        System.out.println("Smallest element: " + small);
        System.out.println("Second smallest element: " + secondSmall);

        smallestAndSecondSmallestByStream(arr);
    }

    private static void smallestAndSecondSmallestByStream(int[] arr) {
        int small= Arrays.stream(arr).min().getAsInt();
        int secondSmall=Arrays.stream(arr).filter(x->x!=small).min().getAsInt();

        int secondsma=Arrays.stream(arr)
                        .boxed()
                                .distinct()
                                        .sorted()
                                                .skip(1)
                                                        .findFirst()
                                                                .orElseThrow(() -> new RuntimeException("Not enough elements"));

        System.out.println("Smallest element: " + small);
        System.out.println("Second smallest element: " + secondSmall);
        System.out.println("Second smallest element: " + secondSmall);


    }
}
