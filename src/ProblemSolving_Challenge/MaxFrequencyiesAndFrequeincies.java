package ProblemSolving_Challenge;

import java.util.Arrays;

public class MaxFrequencyiesAndFrequeincies {
    public static void main(String[] args) {
        //int arr[] =User.userInputArray();
        int[] arr = {2, 3, 3, 5, 6, 5,5, 4};
        System.out.println(Arrays.toString(maxFrequency1(arr)));
        maxFrequency(arr);
    }
    public static  int [] maxFrequency1(int[] arr){
        int maxNum= Arrays.stream(arr).max().getAsInt();
        int count[]=new int[maxNum+1];
        for (int i = 0; i <arr.length ; i++) {
            count[arr[i]]++;
        }
        int max=0;
        int tragetValue=0;
        for (int i = 0; i < arr.length; i++) {
            int freq=count[arr[i]];
            if(freq>max){
                max=freq;
                tragetValue=arr[i];
            }
        }
        return new int[]{tragetValue,max};
    }
    private static void maxFrequency(int[] arr) {
        int n=arr.length;
        int max=0;
        int targetValue=0;
        for (int i=0;i<n;i++){
            int count=1;
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    count++;
                    arr[j]=arr[n-1];
                    n--;    j--;
                }
            }
            if (count>max){
                max=count;
                targetValue=arr[i];
            }

        }
        User.printArray(arr);
        System.out.println(targetValue+" Maximum "+max+" times");
    }

}
