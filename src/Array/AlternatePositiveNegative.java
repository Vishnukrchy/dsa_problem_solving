package Array;

import java.util.ArrayList;
import java.util.Arrays;

/*
alternate positive and negative
 ex {1,2,3,-1,-2,-3}
 output {1,-1,2,-2,3,-3}

 */
public class AlternatePositiveNegative {
    static void main() {
        int arr [] = {1,2,3,-1,-2,-3};
        System.out.println(Arrays.toString(arr));
        alternatePositiveNegative(arr);

    }

    private static void alternatePositiveNegative(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] >= 0 && arr[j] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (arr[i] < 0) {
                i++;
            } else if (arr[j] >= 0) {
                j--;
            } else {
                i++;
                j--;
            }
        }
    }
}
