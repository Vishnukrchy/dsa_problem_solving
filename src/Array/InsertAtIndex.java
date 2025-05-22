package Array;
/*
@Author: Vishnu kumar
@Date: 2025-05-21 10:41
Problem Understanding:
You are given an array arr(0-based index). The size of the array is given by sizeOfArray. You need to insert an element at given index.
Examples:
Input: arr[] = {1, 2, 3, 4, 5}, sizeOfArray = 5, index = 2, element = 10
Output: arr[] = {1, 2, 10, 3, 4, 5}
Explanation: 10 is inserted at index 2

Examples:
Input: arr[] = {1, 2, 3, 4, 5}, sizeOfArray = 5, index = 5, element = 10
Output: arr[] = {1, 2, 3, 4, 5, 10}
Explanation: 10 is inserted at index 5

 */
public class InsertAtIndex {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int sizeOfArray = 6;
        int index = 5;
        int element = 10;
        solution2(arr, sizeOfArray, index, element);
    }
    // by taking new array
    public static void solution1(int[] arr, int sizeOfArray, int index, int element) {
        if (index > sizeOfArray) {
            System.out.println("Invalid index. Index should be less than or equal to the size of the array");
            return;
        }
        int newArr[] =new int[sizeOfArray+1];
        for (int i = 0; i <index ; i++) {
            newArr[i] = arr[i];
        }
        newArr[index]=element;

        // this is also correct
//        for (int i = index+1; i <sizeOfArray ; i++) {
//            newArr[i]=arr[i-1];// in original array index is i-1 and in new array index is i
//        }
      // this is better way
        for (int i = index; i <sizeOfArray ; i++) {
            newArr[i+1]=arr[i];
        }

        System.out.println("Array after insertion: ");
        for (int i : newArr) {
            System.out.print(i + " ");
        }

    }
public static void solution2(int[] arr, int sizeOfArray, int index, int element) {
    if (index > sizeOfArray - 1 || index < 0) {
        throw new IndexOutOfBoundsException("Index should be between 0 and " + (sizeOfArray - 1) + " inclusive");
    }
    // Ensure arr has enough space
    if (arr.length < sizeOfArray) {
        int[] newArr = new int[sizeOfArray];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }
    for (int i = sizeOfArray - 1; i > index; i--) {
        arr[i] = arr[i - 1];
    }
    arr[index] = element;
    System.out.println("Array after insertion: ");
    for (int i : arr) {
        System.out.print(i + " ");
    }
}
     // taking new array
     public void insertAtIndex(int arr[], int sizeOfArray, int index, int element) {
         // Create a temporary array to store result
         int[] temp = new int[sizeOfArray];

         for (int i = 0; i < index; i++) {
             temp[i] = arr[i];  // Copy elements before index
         }

         temp[index] = element;  // Insert the new element at index

         for (int i = index; i < sizeOfArray - 1; i++) {
             temp[i + 1] = arr[i];  // Shift rest to the right
         }

         // Copy back to original array
         for (int i = 0; i < sizeOfArray; i++) {
             arr[i] = temp[i];
         }
     }

}
