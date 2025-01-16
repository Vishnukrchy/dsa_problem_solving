package ProblemSolvingChanlange;

import java.util.Scanner;

public class StrongNoinArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=scanner.nextInt();
        int arr []= new int[n];
        for (int i = 0; i <n; i++) {
            System.out.println("Enter the " + i + "th element of the array: ");
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            if (getFactorialSum(arr[i])==arr[i]){
                System.out.println(arr[i]+" is a strong number");
            }
            else{
                System.out.println(arr[i]+" is not a strong number");
            }
        }

    }
    public static int getFactorialSum(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            int fact=1;
            for (int i = 1; i <=rem; i++) {
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        return sum;
    }
}
