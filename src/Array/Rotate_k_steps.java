package Array;

import ProblemSolving_Challenge.User;

/*
Problem Understanding:
Given an array of size N, rotate the array to the right by K steps, where K is a positive integer.

Examples:

Input: [1, 2, 3, 4, 5], K = 2
Output: [4, 5, 1, 2, 3]


 */
public class Rotate_k_steps {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        //rotate(arr, k);
        rotate2(arr, k);
    }

    //by using reverse
    public static void rotate2(int[] nums, int k) {
        int n = nums.length;
        // reverse all elements
        revserse(nums, 0, n - 1);
        User.printArray(nums);
        //reverse first k
        revserse(nums, 0, k - 1);
        User.printArray(nums);
        //reverse remaining
        revserse(nums, k, n - 1);
        User.printArray(nums);
    }


    // by taking new array
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int temp[] = new int[n];
        int index = 0;
        for (int i = n - k; i < n; i++) {
            temp[index++] = nums[i];
        }
        User.printArray(temp);
        for (int i = 0; i < n - k; i++) {
            temp[index++] = nums[i];
        }
        User.printArray(temp);

//        int[] temp = new int[k];
//        for (int i = 0; i < k; i++) {
//            temp[i] = nums[n - k + i];
//        }
//        for (int i = n - 1; i >= k; i--) {
//            nums[i] = nums[i - k];
//        }
//        for (int i = 0; i < k; i++) {
//            nums[i] = temp[i];
//        }

    }

    //by swapping
    public static void rotate1(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // If k > n, reduce k to within array bounds
        for (int i = 0; i < k; i++) {
            int temp = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }

    public static void revserse(int[] nums, int start, int end) {
//        for (int i=start;i<end;i++){
//            int temp=nums[i];
//            nums[i]=nums[end];
//            nums[end]=temp;
//            end--;
//        }
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        //User.printArray(nums);

    }
}
