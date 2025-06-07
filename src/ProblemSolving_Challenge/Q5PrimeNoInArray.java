package ProblemSolving_Challenge;

import java.util.Scanner;

public class Q5PrimeNoInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");

        Integer n = scanner.nextInt();
        int arr[] = new int[n];

        // Taking input for the array
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + " of the array:");
            arr[i] = scanner.nextInt();
        }

        // Checking for prime numbers in the array
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.println(arr[i] + " is a prime number.");
            } else {
                System.out.println(arr[i] + " is not a prime number.");
            }
        }
    }

    // Method to check if a number is prime (using n/2 logic)
    public static boolean isPrime(int n) {
        if (n <= 1) return false;  // 0 and 1 are not prime numbers
        if (n == 2) return true;   // 2 is a prime number

        // Check divisors from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;  // If divisible, n is not prime
            }
        }
        return true;
    }
}
