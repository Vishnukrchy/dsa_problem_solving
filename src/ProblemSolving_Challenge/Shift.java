package ProblemSolving_Challenge;

import java.util.Arrays;

public class Shift {
    public static void main(String[] args) {
//        int[] arr = {0, 1, 0, 3, 12}; // Example array
        int arr[]=User.userInputArray();
        System.out.println("Array Before shifting zeros to left: " + Arrays.toString(arr));
        shiftZerosToLeft(arr);
        System.out.println("===================================" +
                "");
        shiftAllZeroToRigt(arr);

    }

    private static void shiftZerosToLeft(int[] arr) {
        int n = arr.length;
        int insertPositions = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[insertPositions] = arr[i];
                insertPositions--;
            }
        }
        System.out.println("Array after shifting All non zeros to right : " + Arrays.toString(arr));
        while (insertPositions >= 0) {
            arr[insertPositions] = 0;
            insertPositions--;
        }
        System.out.println("Array after shifting All zeros to left : " + Arrays.toString(arr));
    }
    public static void shiftAllZeroToRigt(int[] arr) {
        int n= arr.length;
        int insertPostion=0;
        for (int i = 0; i <n-1 ; i++) {
            if (arr[i]!=0){
                arr[insertPostion]=arr[i];
                insertPostion++;
            }
        }
        System.out.println("Array after shifting All non -zero into left Side");
        while (insertPostion<=n-1){
            arr[insertPostion]=0;
            insertPostion++;
        }
        System.out.println("Array after shifting All zeros to left : " + Arrays.toString(arr));
    }
}
