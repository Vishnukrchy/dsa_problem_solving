package basic;
/*
@Author: Vishnu kumar

Given three distinct integers, a, b, c, return the largest number that is less than or equal to a, b, and c.
Examples:
Input: a = 1, b = 2, c = 3
Output: 2

Input: a = 2, b = 1, c = 3
Output: 2

Input: a = 2, b = 3, c = 1
Output: 2
 */


import java.util.Arrays;

public class MediumElement {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        System.out.println(mediumSolution1(a, b, c));
        System.out.println(mediumSolution2(a, b, c));

    }
    // by taking min and max// and array sort
    private static int mediumSolution1(int a, int b, int c) {
//        int min = Math.min(a, Math.min(b, c));
//        int max = Math.max(a, Math.max(b, c));
//        return max - (max - min);
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return arr[1];
    }
    private static int mediumSolution2(int a, int b, int c) {
//     if (a>b && a<c) return a;
//     if (b>a && b<c) return b;
//     return c;

        if (a>b){
            if (a<c) return a;
            else return c;
        }
        else {
            if (b<c) return b;
            else return c;
        }
    }
}
