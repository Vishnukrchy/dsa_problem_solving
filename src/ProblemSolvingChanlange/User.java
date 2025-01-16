package ProblemSolvingChanlange;

import java.util.Scanner;

import static java.lang.System.out;

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
    
}
