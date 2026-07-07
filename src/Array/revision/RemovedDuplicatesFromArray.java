package Array.revision;

import java.util.Arrays;

/*
removed duplicates from array
 ex {1,2,3,1,2,5}
 output {1,2,3,5}
 */
public class RemovedDuplicatesFromArray {
    static void main() {
        int arr [] = {1,2,3,1,2,5};
        System.out.println(Arrays.toString(arr));
        arr=removeDuplicates(arr);
      // removeDuplicatesUsingStream(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void removeDuplicatesUsingStream(int[] arr) {
        int [] result =Arrays.stream(arr)
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(result));
    }

    // brute force  time complexity O(n^2) space complexity O(1)
    private static int [] removeDuplicates(int[] arr) {
        int n =arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1  ; j <n ; j++) {
                if (arr[i]==arr[j]){
                    arr[j]=arr[n-1];
                    n--;
                    j--;
                }
            }
        }
        int [] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
        }
        System.out.println(Arrays.toString(result));
        return result;

    }
}
