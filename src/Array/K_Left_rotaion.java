package Array;

class K_Left_Rotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        for (int i = 0; i < k; i++) {
            rotateLeftByOne(arr);
        }
        rotateLeftByK(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

public static void rotateLeftByOne(int[] arr) {
    // Store the first element, as it will be moved to the end after rotation
    int temp = arr[0];
    // Shift each element one position to the left
    for (int i = 1; i < arr.length; i++) {
        // Move the current element to the previous position
        arr[i - 1] = arr[i];
    }
    //  Place the original first element at the end of the array
    arr[arr.length - 1] = temp;
}
    public static void rotateLeftByOne1(int[] arr) {
        int n = arr.length;
        int left = 0;
        for (int right = 1; right < n; right++) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
        }
    }

    // Rotate array left by k positions using the reversal (two-pointer) method
    public static void rotateLeftByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Helper method to reverse elements between two indices
    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
