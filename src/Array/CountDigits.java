package Array;
/*
@author: Vishnu Kumar
@Date: 2025-06-07
@Problem: GFG - Count Digits Type Easy
✅ Problem Explanation
You're given a positive integer n, and the task is to count how many of its digits divide n evenly (i.e., n % digit == 0).

💡 Key Points:
Each digit must be checked individually.

If the digit is 0, ignore it (you cannot divide by zero).

The answer is the count of digits that divide n without a remainder.

📌 Examples
Example 1:

Input: n = 12
Digits: 1, 2
→ 12 % 1 == 0 ✅, 12 % 2 == 0 ✅
✅ Output: 2

Example 2:

Input: n = 2446
Digits: 2, 4, 4, 6
→ 2446 % 2 == 0 ✅
→ 2446 % 4 == 2 ❌
→ 2446 % 6 == 2 ❌
✅ Output: 1

Example 3:

Input: n = 23
Digits: 2, 3
→ 23 % 2 == 1 ❌, 23 % 3 == 2 ❌
✅ Output: 0


 */
public class CountDigits {
    public static void main(String[] args) {
        int n = 2446; // Example input
        //System.out.println(countDigits(n)); // Output: 2
        System.out.println(countDigits2(n)); // Output: 1
    }
  // approach: 1 by one checking each digit of the number and checking if it divides the number or not.
    public static int countDigits(int n) {

        int count = 0;
        int originalNumber = n;

        while (n > 0) {
            int digit = n % 10; // Get the last digit
            n /= 10; // Remove the last digit

            if (digit != 0 && originalNumber % digit == 0) {
                count++; // Increment count if digit divides original number
            }
        }

        return count; // Return the total count of divisible digits
        // Note: This approach avoids division by zero by checking if the digit is not zero before performing the modulus operation.
        //tIME complexity: O(log n) where n is the number of digits in the number.
    }
    // Alternative approach: Convert number to string and check each character
    public static int countDigits2(int n) {
        String numStr = String.valueOf(n);
        int count = 0;

        for (char c : numStr.toCharArray()) {
            int digit = c - '0'; // Convert char to int
            if (digit != 0 && n % digit == 0) {
                count++;
            }
        }

        return count;
        // tIME complexity: O(d) where d is the number of digits in the number.
    }
}
