package ProblemSolving_Challenge;

import java.util.Scanner;

public class ArrayRotations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user to input the size of the array
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Creating an array and accepting its elements from the user
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Asking the user to choose the type of rotation
        System.out.println("Choose rotation option:");
        System.out.println("1: Left rotation by 1 position");
        System.out.println("2: Left rotation by k positions");
        System.out.println("3: Right rotation by k positions");
        System.out.println("4: Cyclic rotation");

        int choice = scanner.nextInt();

        switch (choice) {
            // Case for left rotation by 1 position
            case 1:
                rotateLeftByOne(arr);
                break;

            // Case for left rotation by k positions
            case 2:
                System.out.println("Enter value of k for left rotation: ");
                int kLeft = scanner.nextInt();
                rotateLeftByK(arr, kLeft);
                break;

            // Case for right rotation by k positions
            case 3:
                System.out.println("Enter value of k for right rotation: ");
                int kRight = scanner.nextInt();
                rotateRightByK(arr, kRight);
                break;

            // Case for cyclic rotation
            case 4:
                cyclicRotate(arr);
                break;

            // Handling invalid input
            default:
                System.out.println("Invalid option!");
                return;
        }

        // Printing the array after performing the chosen rotation
        System.out.println("Array after rotation: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Method for left rotation by 1 position
    public static void rotateLeftByOne(int[] arr) {
        int n = arr.length;
        int first = arr[0]; // Store the first element

        // Shift all elements to the left by 1
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = first; // Place the first element at the end
    }

    // Method for left rotation by k positions
    public static void rotateLeftByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // If k > n, reduce k to within array bounds

        // Rotate by k positions using multiple left rotations
        for (int i = 0; i < k; i++) {
            rotateLeftByOne(arr);
        }
    }

    // Method for right rotation by k positions
    public static void rotateRightByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // If k > n, reduce k to within array bounds

        // Right rotation can be done by performing left rotation by (n - k)
        rotateLeftByK(arr, n - k);
    }

    // Method for cyclic rotation (last element moves to the front)
    public static void cyclicRotate(int[] arr) {
        int n = arr.length;
        int last = arr[n - 1]; // Store the last element

        // Shift all elements to the right by 1
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last; // Place the last element at the front
    }
}
