package Array.Sorting_Algorithm;

import ProblemSolvingChanlange.User;

/*
Problem Understanding
Bubble Sort is a simple sorting algorithm that repeatedly steps through the list to be sorted, compares each pair of adjacent items and swaps them if they are in the wrong order.
Example:
Input: 64, 34, 25, 12, 22, 11, 90
Output: 11, 22, 25, 34, 64, 90
Bubble Sorting Algorithm
  Time Complexity: O(n^2)
  Steps:
      step 1 - compare first element with second element if first element is greater than second element then swap them
      step 2 - compare second element with third element if second element is greater than third element then swap them
      step 3 - compare third element with forth element if third element is greater than forth element then swap them
      step 4 - compare forth element with fifth element if forth element is greater than fifth element then swap them
      step 5 - compare fifth element with sixth element if fifth element is greater than sixth element then swap them
      step 6 - compare sixth element with seventh element if sixth element is greater than seventh element then swap them
      64, 34, 25, 12, 22, 11, 90 => initial array

    step 1 -:   64, 34, 25, 12, 22, 11, 90 => here   64 is greater than 34 so swap them i=0,j=1
    step 2 -:   34, 64, 25, 12, 22, 11, 90 => here   34 is greater than 25 so swap them i=1,j=2
    step 3 -:   25, 34, 64, 12, 22, 11, 90 => here   64 is greater than 12 so swap them i=2,j=3
    step 4 -:   25, 34, 12, 64, 22, 11, 90 => here   64 is greater than 22 so swap them i=3,j=4
    step 5 -:   25, 34, 12, 22, 64, 11, 90 => here   64 is greater than 11 so swap them i=4,j=5
    step 6 -:   25, 34, 12, 22, 11, 64, 90 => here   64 is greater than 90 so swap them i=5,j=6
    step 7 -:   25, 34, 12, 22, 11, 90, 64 => here   64 is greater than 90 so swap them i=6,j=7



 */
public class Bublble_Sort {
    public static void main(String[] args) {
        int [] arr=User.userInputArray();
        System.out.println("============= Original Array is : ==========");
        User.printArray(arr);
        System.out.println("============= Sorted Array is : ==========");
        User.printArray(bubbleSort(arr));
        System.out.println("============= Sorted Array is : ==========");
        User.printArray(bubbleSortDescending(arr));
    }
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        // n-1 times for each element is sorted by inner loop
        for (int i = 0; i < n - 1; i++) {
            int x=0;
            for (int j = 0; j < n - i - 1; j++) {

                // check if arr[j] is greater than arr[j+1]  for assending order
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    x++;
                }

            }
            System.out.println("============= Step "+(i+1)+" : ==========");
            User.printArray(arr);
            // here if x==0 means array is already sorted and we can break
            if(x==0){
                break;
            }


        }
        return arr;
    }
    public static int[] bubbleSortDescending(int[] arr) {
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                if (arr[j] < arr[j + 1]) {
                     arr[j] = arr[j + 1]+arr[j];
                     arr[j + 1] = arr[j]-arr[j+1];
                     arr[j] = arr[j]-arr[j+1];
                     swapped=true;
                }

            }
            if (!swapped){
                    break;
            }
        }
        return  arr;
    }


}
