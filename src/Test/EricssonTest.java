package Test;

//Input: [-6, 9, -1, 4, 5, 3, -7, 8, -2]

//output [-6, -1, -7,-2, 9,4,5, 3,  8]
public class EricssonTest {
    public static void main(String[] args) {
                int[] arr = {-6, 9, -1, 4, 5, 3, -7, 8, -2};
                int[] output = getOutput(arr);

                for (int i = 0; i < output.length; i++) {
                    System.out.print(output[i] + (i < output.length - 1 ? ", " : ""));
                }
            }
            public static int[] getOutput(int[] input) {
                int[] output = new int[input.length];
                int index = 0;

                for (int num : input) {
                    if (num < 0) output[index++] = num;
                }
                for (int num : input) {
                    if (num > 0) output[index++] = num;
                }

                return output;
            }
    public static int[] getOutput2(int[] input) {
        int[] output = new int[input.length];
        int negIndex = 0, posIndex = 0;

        // First, count negatives to know where positives start
        for (int num : input) {
            if (num < 0) negIndex++;
        }
        posIndex = negIndex;

        // Fill output array in one pass
        negIndex = 0;
        for (int num : input) {
            if (num < 0) output[negIndex++] = num;
            else if (num > 0) output[posIndex++] = num;
        }
        return output;
    }

}