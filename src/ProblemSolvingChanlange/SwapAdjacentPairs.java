package ProblemSolvingChanlange;

public class SwapAdjacentPairs {
    public static void main(String[] args) {
        // Define an array
        int[] arr = {1, 2, 3, 4, 5, 6};

        // Print the original array
        System.out.println("Original Array:");
        printArray(arr);

        // Call the method to swap adjacent pairs
        swapPairs(arr);

        // Print the modified array
        System.out.println("Array after swapping adjacent pairs:");
        printArray(arr);
    }

    // Method to swap adjacent elements in pairs
    public static void swapPairs(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            // Swap arr[i] with arr[i+1]
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    // Helper method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

