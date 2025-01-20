package Array;
/*
Problem Understanding:
Given an unsorted array arr of positive integers. One number a from the set [1, 2,....,n] is missing and one number b occurs twice in the array. Find numbers a and b.
Note: The test cases are generated such that there always exists one missing and one repeating number within the range [1,n].
Examples:
Input: arr[] = [2, 2]
Output: [2, 1]
Explanation: Repeating number is 2 and smallest positive missing number is 1.
Input: arr[] = [1, 3, 3]
Output: [3, 2]
Explanation: Repeating number is 3 and smallest positive missing number is 2.
 */

public class Missing_And_Repeating {
    public static void main(String[] args) {
        int arr[] = {4, 3, 1, 2, 1, 3, 2};
        int n = arr.length;
        int sum = (n * (n + 1)) / 2;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 = sum2 + arr[i];
        }
        System.out.println(sum - sum2);
    }
    //
  public  static int[] repeatingAndMissingNo(int[] arr, int n) {
        /*Find the repeating and missing number  by using  Frequency Count
        Frequency table:
        Frequency table:
        0, 2, 1, 1, 1, 0, 1
        Repeating = 1, Missing = 5
        */

       int [] freq = new int[n+1];
       for (int i = 0; i < n; i++) {
           freq[arr[i]]++;
       }

       int missing = 0;
       int repeating = 0;
       for (int i = 1; i <= n; i++) {
           if (freq[i] == 0) {
               missing = missing + i;
           } else if (freq[i] == 2) {
               repeating = i;
           }
       }
       return new int[]{repeating, missing};


  }

    public  static int missingNo(int arr[], int n) {
        int total = (n + 1) * (n + 2) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return total - sum;
    }
}
