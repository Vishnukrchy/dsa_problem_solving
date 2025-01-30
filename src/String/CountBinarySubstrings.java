package String;
/*
@author Vishnu
@Date: 2022-07-30 10:41

Problem Statement
Given a string s, return the number of non-empty substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
Substrings that occur multiple times are counted the number of times they occur.

Example 1:
Input: s = "00110011"
Output: 6 explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".

 */
public class CountBinarySubstrings {
    public static void main(String[] args) {
     String s = "00110011";
        System.out.println(countBinarySubstrings(s));
        System.out.println(countBinarySubstrings1(s));
    }
    // by using loop
    public static int countBinarySubstrings1(String s) {
        int count = 0;
        int n = s.length();

         for (int i=0;i<n;i++) {
            // first start with 1
             if (s.charAt(i) == '1') {
                 // Find all ending positions with '1'
                 for (int j=i+1;j<n;j++) {
                     // search
                     if (s.charAt(j) == '1') {
                         String substring = s.substring(i, j + 1);
                         System.out.println("Valid Substring: " + substring);
                         count++;
                     }
                 }
             }
         }
         return count;
    }
    // by using loops
    public static int countBinarySubstrings(String s) {
        /*
        Approach:
        Traverse the string.
        Count the number of consecutive 0's and 1's.
        Count the number of substrings that have equal number of consecutive 0's and 1's.
         Formula : totalSubstrings = n * (n + 1) / 2 where n is  count of 1`s
         */
//
        int countOnes = 0;
        for (char c: s.toCharArray()) {
            if (c == '1') {
                countOnes++;
            }
        }

        System.out.println("Total count of '1's in the string: " + countOnes);
        // Apply the formula: N * (N-1) / 2
        int result = countOnes * (countOnes - 1) / 2;

        return result;


//        int count = 0;
//        int n = s.length();
//        int prev0 = 0;
//        int prev1 = 0;
//        for(int i = 0; i < n; i++){
//            if(s.charAt(i) == '1'){
//                prev1++;
//            }else{
//                prev0++;
//            }
//            if(prev0 == prev1){
//                count++;
//            }
//        }
//        return count;

    }
}
