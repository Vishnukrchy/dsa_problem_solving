package Array;

public class RemoveDuplicatesFromArr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        removeDuplicates(arr);
    }
    public static void removeDuplicates(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j=i+1;j<n;j++) {
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=arr[n-1];
                    n--;
                    j--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] == arr[j]) {
//                    arr[j] = arr[n - 1];
//                    n--;
//                    j--;
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}
