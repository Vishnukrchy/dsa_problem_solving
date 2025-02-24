package Array;

public class MinimumdistanceinanArray {
    public static void main(String[] args) {

    }
    public static  int minimumDistance(int[] nums, int x,int y) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x || nums[i] == y) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == x || nums[j] == y) {
                        min = Math.min(min, Math.abs(j - i));
                    }
                }
            }
        }
        return min;
    }
}
