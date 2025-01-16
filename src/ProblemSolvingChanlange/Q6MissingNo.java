package ProblemSolvingChanlange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q6MissingNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ENter The Size Of Array ");

        Integer n = scanner.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the " + (i + 1) + " elements of array !!! ");
            arr[i] = scanner.nextInt();
        }
      List result=  missingNo(arr);
        System.out.println(result);
    }

    private static List<Integer> missingNo(int[] arr) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(arr);// sort the Array
        int nextExpNo;
        int nextActNo;
        for (int i = 0; i < arr.length-1; i++) {
            nextActNo=arr[i+1];
            nextExpNo=arr[i]+1;
            while (nextExpNo<nextActNo){
                list.add(nextExpNo);
              nextExpNo++;
            }
        }
        return list;
    }


}
