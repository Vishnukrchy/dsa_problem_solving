package basic;
/*
Problem Understanding:
Given a positive integer N, find the sum of all integers from 1 to N (inclusive).
 */
public class SumOfN {
    public static void main(String[] args) {
        int N = 10; // Example input
        int sum = sumOfN(N);
        System.out.println("The sum of integers from 1 to " + N + " is: " + sum);
    }

    // Method to calculate the sum of integers from 1 to N
    public static int sumOfN(int N) {
        return (N * (N + 1)) / 2; // Using the formula for the sum of the first N natural numbers
    }
    public static int sumOfN2(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i; // Adding each integer from 1 to N
        }
        return sum;
    }
    public static int sumOfN3(int N) {
        return N * (N + 1) / 2; // Using the formula for the sum of the first N natural numbers
    }
}
