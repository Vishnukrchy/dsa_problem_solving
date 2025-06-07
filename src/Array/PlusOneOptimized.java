package Array;

import ProblemSolving_Challenge.User;

/*
@Author: Vishnu Kumar
@Date : 2025-03-03 10:41
Problem Understanding:
Given a non-negative number represented as an array of digits, plus one to the number.
Examples:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

 */
public class PlusOneOptimized {
    public static void main(String[] args) {
    int arr [] ={1,2,3,4};
        User.printArray(plusOne(arr));

    }
    public static  int [] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n-1; i>=0 ; i--) {
            if (digits[i]!=9){
                digits[i]++;
                //digit[i]=digit[i]+1
                return digits;
            }
            digits[i]=0;
        }
        int newArr[]=new int[n+1];
        newArr[0]=1;
        return  newArr;
    }
}
