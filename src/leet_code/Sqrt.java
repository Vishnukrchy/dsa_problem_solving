package leet_code;

/*
@Author: Vishnu Kumar
@Date : 2025-06-009
@Problem: LeetCode - Sqrt(x) Type Easy
@Problem Explanation
You're given a non-negative integer x, and you're asked to compute its square root, but only the integer part, meaning you round down any decimal.

Also, you cannot use built-in functions like Math.sqrt(), pow(x, 0.5), or exponent operators (^, **).

📌 Examples
Input	Output	Explanation
x=4	2	√4 = 2, so output is 2
x=8	2	√8 ≈ 2.828... → round down → 2
x=0	0	Square root of 0 is 0
x=1	1	Square root of 1 is 1



 */
public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(4)); // Output: 2
        System.out.println(mySqrt(8)); // Output: 2
        System.out.println(mySqrt(0)); // Output: 0
        System.out.println(mySqrt(1)); // Output: 1
    }

    // Approach: 1 By using brute force
    public static int mySqrt(int x) {
   /*
   Approach:
We check every number starting from 1 and square it. As soon as the square becomes greater than x, we stop and return the previous number (i.e., i - 1), since i * i > x.

🔍 Dry Run Example:
Let’s take x = 8
We try:

1 × 1 = 1 ✔️

2 × 2 = 4 ✔️

3 × 3 = 9 ❌ (greater than 8)

→ So, we return 3 - 1 = 2

🧠 Time and Space:
Time Complexity: O(√x)

Space Complexity: O(1)


    */
        /*
          if (x < 2) return x; // Handle 0 and 1 directly
        for (int i = 1; i <= x / 2; i++) {
            if (i * i == x) return i; // Perfect square
            if (i * i > x) return i - 1; // First integer whose square exceeds x
        }
        return -1; // Should never reach here for non-negative x
         */
        if (x == 0 || x == 1) return x;

        int i = 1;
        while (i * i <= x) {
            i++;
        }
        return i - 1;
        /* DRY RUN:
        x = 8
        Iteration 1:
         - left = 1, right = 4
         - mid = 2, square = 4
         - 4 < 8, so left = 3
        Iteration 2:
         - left = 3, right = 4
         - mid = 3, square = 9
         - 9 > 8, so right = 2
        Loop ends, return right = 2
        */
        }




    // Approach: 2 By using Binary Search

        public static int sqrt(int x) {
    /*
    💡 Approach:
We use binary search between low = 0 and high = x:

Calculate mid = (low + high) / 2

If mid * mid == x, return mid directly

If mid * mid < x, we update the answer to mid and move low = mid + 1

If mid * mid > x, we move high = mid - 1

🔍 Dry Run Example:
Let’s take x = 8:

low = 0, high = 8

mid = 4 → 4*4 = 16 > 8 → high = 3

mid = 1 → 1*1 = 1 < 8 → ans = 1, low = 2

mid = 2 → 2*2 = 4 < 8 → ans = 2, low = 3

mid = 3 → 3*3 = 9 > 8 → high = 2

End loop → return ans = 2

✅ Code (Java):
     */
            if (x == 0 || x == 1) return x;

            int low = 0, high = x;
            int ans = 0;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                // Use long to avoid overflow
                long square = (long) mid * mid;

                if (square == x)
                    return mid;
                else if (square < x) {
                    ans = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return ans;
        }

}
