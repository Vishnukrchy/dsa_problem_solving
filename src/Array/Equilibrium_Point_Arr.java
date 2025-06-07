package Array;

import ProblemSolving_Challenge.User;

/*
Problem Understanding:
Given an array of N integers, find the equilibrium point in the array.
Equilibrium Point: A position where the sum of elements before it is equal to the sum of elements after it.
Concept
An equilibrium point is an index
*   `sum_left` is the sum of elements to the left of index `i`.
*   `sum_right` is the sum of elements to the right of index `i`.
For any index `i`, we can compute:
`sum_left` = `total_sum` - `sum_right` - `arr[i]`
Example:
Example 1:
Input: arr = [1, 2, 0, 3]

Execution:

total_sum = 6
Index 0:
sum_left = 0, sum_right = 5 → No match
Index 1:
sum_left = 1, sum_right = 3 → No match
Index 2:
sum_left = 3, sum_right = 3 → Match!
 */
public class Equilibrium_Point_Arr {
    public static void main(String[] args) {
     int arr[]= User.userInputArray();

        System.out.println("============= Original Array is : ==========");
        User.printArray(arr);
        System.out.println("============= equilibrium index is : ==========");
        System.out.println(EquilibriumPoint(arr));
        System.out.println("============= equilibrium index is : ==========");
//        System.out.println(EquilibriumPoint1(arr));
    }

    private static int EquilibriumPoint(int[] arr) {
        // total sum of array
        int total_sum=0;
        for(int i:arr){
            total_sum+=i;
        }
        int side_left_sum=0;
        for (int i = 0; i < arr.length; i++) {
            int side_right_sum=total_sum-side_left_sum-arr[i];
            if(side_left_sum==side_right_sum){
                return i;
            }
            side_left_sum+=arr[i];
        }
        return -1;
    }
//    private static int EquilibriumPoint1(int[] arr) {
//
//        List<Integer> numlist=Arrays.asList(arr);
//        int total_sum= numlist.stream().reduce(0, Integer::sum);
//        System.out.println(total_sum);
//        int side_left_sum=0;
//        for (int i = 0; i < arr.length; i++) {
//
//            int side_right_sum=total_sum-side_left_sum-arr[i];
//            if(side_left_sum==side_right_sum){
//                return i;
//            }
//            side_left_sum+=arr[i];
//        }
//        return -1;
//    }


}
