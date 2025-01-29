package Array;

public class MaxFreq {
    public static void main(String[] args) {
        int arr [] = {2,3,3,5,6,5,5,4};


    }
    public static  void maxFrequency(int arr[]) {

    }
    public static  int maxFreq(int arr[]) {
        int max = arr[0];
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    max = arr[i - 1];
                }
                count = 1;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            max = arr[arr.length - 1];
        }
        return max;
    }
}
