package Test.acutec_global;

import java.util.Scanner;

/*
@Author: Vishnu Kumar
@Date: 2025-07-09
@Problem: Print 0 and 1 in a specific pattern
          write a program to print 0 and 1 in a s if number is 0 the print 1 and if number is 1 then print 0
          // without using any loops and recursion and ternary operator not switch case not any other control flow statements


 */
public class Print_0_1 {
    /*
     write a program to print 0 and 1 in a s if number is 0 the print 1 and if number is 1 then print 0
          // without using any loops and recursion and ternary operator not switch case not any other control flow statements

     */
    public static void main(String[] args) {
        int n = 0; // Change this value to test with 0 or 1
        // Using a simple arithmetic operation to toggle between 0 and 1
       System.out.println("Enter a number (0 or 1): ");
        int num=new Scanner(System.in).nextInt();
        print_0_1(num);
    }

    private static void print_0_1(int num) {
        int result = (num + 1) % 2;
        System.out.println(result); // This will print 1 if n is 0, and 0 if n is 1
    }
   // Method to print 0 or 1 based on the input number and using bitwise operations
    public static void print_0_1() {
        int n = 0; // Change this value to test with 0 or 1
        // Using bitwise NOT operator to toggle between 0 and 1
        int result = n ^ 1; // XOR with 1 will flip the bits
        System.out.println(result); // This will print 1 if n is 0, and 0 if n is 1

    }
}
