package Array.Sorting_Algorithm;
/*
Problem Understanding:

Selection Sort is a simple sorting algorithm that selects the smallest element from an unsorted list in each iteration and places that element at the beginning of the unsorted list.
The algorithm is efficient for small lists or lists that are almost sorted.

Example:

Input: 64, 34, 25, 12, 22, 11, 90
Output: 11, 22, 25, 34, 64, 90

Sorting Algorithm:
    Time Complexity: O(n^2)
    step 1: Find the smallest element in the unsorted list.
    step 2: Swap the smallest element with the first element of the unsorted list.
    step 3: Repeat steps 1 and 2 for the remaining elements of the unsorted list.

    Steps:
        64, 34, 25, 12, 22, 11, 90 => initial array

        step 1 -:   11, 34, 25, 12, 22, 64, 90 => here   11 is smallest so swap them i=0,j=0
        step 2 -:   11, 22, 25, 12, 34, 64, 90 => here   22 is smallest so swap them i=1,j=1
        step 3 -:   11, 22, 25, 12, 34, 90, 64 => here   90 is smallest so swap them i=6,j=6

 */

import ProblemSolvingChanlange.User;

public class Selection_sort {
    public static void main(String[] args) {
        int [] arr=User.userInputArray();
        System.out.println("============= Original Array is : ==========");
        User.printArray(arr);
        System.out.println("============= Sorted Array is : ==========");
        User.printArray(selectionSort(arr));
        System.out.println("============= Sorted in Descending order Array is : ==========");
        User.printArray(selectionSortDescending(arr));
    }

    private static int[] selectionSort(int[] arr) {
        int n=arr.length;

        for(int i=0;i<n-1;i++) {
            int smallestIndex = i; int temp=0;// let's assume first element is smallest
            for(int j=i+1;j<n;j++) {
                // check if arr[j] is smaller than arr[smallestIndex]
                if(arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            if(smallestIndex != i) {
                temp = arr[i];
                arr[i] = arr[smallestIndex];
                arr[smallestIndex] = temp;
            }
        }

        return arr;
    }
    public static int[] selectionSortDescending(int[] arr) {
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            int largestIndex = i; int temp=0;// let's assume first element is largest
            for (int j = i+1; j <n ; j++) {
                if (arr[j] > arr[largestIndex]) {
                    largestIndex = j;
                }

            }
            if (largestIndex != i) {
                temp = arr[i];
                arr[i] = arr[largestIndex];
                arr[largestIndex] = temp;
            }
        }
        return arr;

    }
}
