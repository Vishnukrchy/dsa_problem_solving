package ProblemSolving_Challenge;

import java.util.Scanner;

public class ModifiyArrayAddDelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Initialize the array and fill it with user inputs
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + "th element of the array: ");
            arr[i] = scanner.nextInt();
        }

        // Insert operation
        System.out.println("Enter the position to insert the element: ");
        int positionInsert = scanner.nextInt();
        System.out.println("Enter the value to insert: ");
        int valueInsert = scanner.nextInt();

        // Call the method to insert the element
        int[] newArr = insertElement(arr, positionInsert, valueInsert);
        System.out.println("Array after insertion: ");
        for (int i : newArr) {
            System.out.print(i + " ");
        }

        // Delete operation
        System.out.println("\nEnter the position to delete the element: ");
        int positionDelete = scanner.nextInt();

        // Call the method to delete the element
        int[] arrAfterDelete = deleteElement(newArr, positionDelete);
        System.out.println("Array after deletion: ");
        for (int i : arrAfterDelete) {
            System.out.print(i + " ");
        }
    }

    // Method to insert element at the specified position
    private static int[] insertElement(int[] arr, int position, int value) {
        int newArray[] = new int[arr.length + 1];

        // Copy elements before the insertion point
        for (int i = 0; i <position ; i++) {
            newArray[i]=arr[i];
        }

        // Insert the new value
        newArray[position] = value;

        // Copy remaining elements after the insertion point
        for (int i = position; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }

        return newArray;
    }

    // Method to delete element from the specified position
    private static int[] deleteElement(int[] arr, int position) {
        // Create a new array that is one element smaller
        int newArray[] = new int[arr.length - 1];

        // Copy elements before the deletion point
        for (int i = 0; i < position; i++) {
            newArray[i] = arr[i];
        }

        // Copy elements after the deletion point
        for (int i = position; i < newArray.length; i++) {
            newArray[i] = arr[i + 1];
        }

        return newArray;
    }
}
