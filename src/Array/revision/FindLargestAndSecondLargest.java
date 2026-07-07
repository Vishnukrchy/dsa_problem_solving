package Array.revision;

import java.util.Arrays;
import java.util.Comparator;

public class FindLargestAndSecondLargest {
    static void main() {
        int[] arr = {1,2,3,4,5,6,11,8,9,10};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (largest<arr[i]){
                secondLargest=largest;
                largest=arr[i];
            } else if (arr[i]>secondLargest && largest !=arr[i]) {
                secondLargest=arr[i];

            }

        }
        System.out.println("Largest element: " + largest);
        System.out.println("Second largest element: " + secondLargest);

        largestAndSecondLargestByStream(arr);
    }

    private static void largestAndSecondLargestByStream(int[] arr) {
        int laggest = Arrays.stream(arr).max().getAsInt();
       // int secondLargest = Arrays.stream(arr).filter(x -> x != laggest).max().getAsInt();
        int secondLargest =Arrays.stream(arr).boxed()
                        .distinct()
                                .sorted(Comparator.reverseOrder())
                                        .skip(1)
                                                .findFirst()
                                                        .orElseThrow(() -> new RuntimeException("Not enough elements"));
        System.out.println("Largest element: " + laggest);
        System.out.println("Second largest element: " + secondLargest);
    }
}
