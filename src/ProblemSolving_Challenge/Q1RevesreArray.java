package ProblemSolving_Challenge;

public class Q1RevesreArray {
    public static void main(String[] args) {
       int arr[]= User.userInputArray();
       reverseArray(arr);
    }

    private static int[] reverseArray(int[] arr) {
        int n=arr.length;
        for (int i = 0; i <n/2 ; i++) {
            arr[i]=arr[i]+arr[n-i-1];
            arr[n-i-1]=arr[i]-arr[n-i-1];
            arr[i]=arr[i]-arr[n-i-1];

            /*
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
             */


        }
        User.printArray(arr);
        return arr;
    }
}
