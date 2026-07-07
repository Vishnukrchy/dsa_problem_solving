package Array.revision;

import java.util.Arrays;

/*
two pointer
1. start = 0
2. end = n-1
3. repeat step 1-2 until start < end

example:
arr = [1,2,3,4,5]
start = 0
end = 4

         step 1: swap(arr[start], arr[end])
         step 2: start++
         step 3: end--
         step 4: repeat step 1-3 until start < end

         after reverse
         arr = [5,4,3,2,1]
 */
public class TwoPointer {
    static void main() {
        int arr []={1,2,3,4,5};

        int left =0;
        int right = arr.length-1;

        while(left<right){
            int tem =arr[left];
            arr[left]=arr[right];
            arr[right]=tem;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
