package ProblemSolving_Challenge;

public class Q8Bigest_SecondBigest {
    public static void main(String[] args) {
        int[] arr = {6, 6}; // Example array
        printBigestAndSecondBigest(arr);
    }

    private static int[] printBigestAndSecondBigest(int[] arr) {
        int biggest = Integer.MIN_VALUE;
        int secondBiggest = Integer.MIN_VALUE;

        // Loop through array to find the largest and second largest elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > biggest) {
                // Update secondBiggest before updating biggest
                secondBiggest = biggest;
                biggest = arr[i];
            } else if (arr[i] > secondBiggest && arr[i] != biggest) {
                // Update only if arr[i] is less than biggest but greater than secondBiggest
                secondBiggest = arr[i];
            }
        }

        // Print the results
        if (secondBiggest == Integer.MIN_VALUE) {
            System.out.println("No second biggest element (all elements may be the same or only one unique value)");
        } else {
            System.out.println("Biggest: " + biggest + ", Second Biggest: " + secondBiggest);
        }

        return new int[]{biggest, secondBiggest};
    }
}
