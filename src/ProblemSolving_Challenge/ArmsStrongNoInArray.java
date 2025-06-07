package ProblemSolving_Challenge;

import java.util.Scanner;

public class ArmsStrongNoInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ENter The Size Of Array ");

        Integer n = scanner.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the " + (i + 1) + " elements of array !!! ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==getPowerSome(arr[i])) {
                System.out.println(arr[i] + " Is Armstrong  No ");
            } else {
                System.out.println(arr[i] + " Is Not Armstrong No ");
            }
        }

    }
    public static  long getPowerSome(int n){
        int count = (int) getNoOfDigit(n);
        int sum =0;
        for (int i = 1; i <=n ; i++) {
            int rem=n%10;
            sum= (int) (sum+getPower(rem,count));
        }
        return  sum;
    }
    public  static long getPower(int a,int b){
        int power=1;
        for (int i = 1; i <=b ; i++) {
            power=power*a;
        }
        return  power;
    }

    public static long getNoOfDigit(int n) {
        int count = 0;
        while (n>0){
            count++;
            n=n/10;
        }
        return  count;
    }
}

