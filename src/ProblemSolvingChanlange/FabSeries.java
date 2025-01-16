package ProblemSolvingChanlange;

import java.util.Scanner;

public class FabSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Nth term of the Fibonacci sequence
        System.out.println("Enter The Nth Term:");
        int n = scanner.nextInt();

        // Initializing the first two terms of Fibonacci series
        int a = 0, b = 1;

        // Printing the Fibonacci series up to the Nth term
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.println(a + ((i == n) ? "" : ","));
            int c = a + b;
            a = b;
            b = c;
        }
        nTh_termOfFabSeries(n);
    }

    private static int nTh_termOfFabSeries(int n) {
        int a = 0, b = 1, c = 0;

        switch (n) {
            case 1:
                return a;  // For the 1st term, return 0
            case 2:
                return b;  // For the 2nd term, return 1
        }

        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return b;  // b holds the nth term of the Fibonacci sequence
    }
}
