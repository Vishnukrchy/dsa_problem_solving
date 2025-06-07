package ProblemSolving_Challenge;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q2_CheckUniqeElemnts {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println(" ENter The Size Of Array ");

        Integer n =scanner.nextInt();

        int arr [] =new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("enter the "+(i+1)+" elements of array !!! ");
            arr[i]=scanner.nextInt();
        }
        int test[] = {1, 4, 3,1,4};
        System.out.println(checkUniqeElemnts(test));


    }

    private static Set<Integer> checkUniqeElemnts(int[] arr) {
        int n = arr.length;
        Set<Integer> result = new TreeSet<>();
        for (int i = 0; i < n ; i++) {
            int count = 1;
            for (int j = i + 1; j < n  - i; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    n--;
                    j--;
                }
            }
            if (count == 1) {
                System.out.println("Unique Elements " + arr[i]);
                result.add(arr[i]);
            }


        }
        return result;
    }

    public void checkUniqe(int arr[]) {
        int count[] = new int[arr.length];

        for (int i = 0; i < count.length; i++) {
            count[arr[i]]++;
        }
    }
}
