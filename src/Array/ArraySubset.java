package Array;
/*
Problem Understanding:
Given an array arr[] of size N, check if it can be partitioned as two subsets such that the sum of elements in both subsets is same or not.
 */

public class ArraySubset {
    public static void main(String[] args) {

    }
    public static boolean isSubsetSum(int arr[], int n, int sum) {
        boolean t[][] = new boolean[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0) {
                    t[i][j] = false;
                }
                if (j == 0) {
                    t[i][j] = true;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][sum];
    }

}
