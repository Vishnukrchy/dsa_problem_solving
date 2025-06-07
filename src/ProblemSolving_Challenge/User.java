package ProblemSolving_Challenge;

import java.util.Scanner;

// check Odd Even
public class User {
    public static int []  userInputArray(){
        Scanner scanner =new Scanner(System.in);
        System.out.println(" ENter The Size Of Array ");

        Integer n =scanner.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("enter the "+(i+1)+" elements of array !!!");
            arr[i]=scanner.nextInt();
        }
        System.out.println("============= Original Array is : =========");
        for(int arr1:arr){
            System.out.print(arr1+" ");
        }

        System.out.println();
        return arr;
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int userInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        return scanner.nextInt();
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
