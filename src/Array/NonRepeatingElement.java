package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
@Author : Vishnu Kumar
@Date : 8/7/2026
@Description : Non Repeating Element
    ex arr = {1,2,3,1,2,3,4}
    output = 4

    approach
    1. use hash map
    2. use stream
 */
public class NonRepeatingElement {
    static void main() {
        int [] arr = {1,2,3,1,2,3,4};
        System.out.println("First non repeating element is : "+nonRepeatingElement(arr));
    }

    // Using brute force
    static int nonRepeatingElement1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
                if (count==1){
                    return arr[i];
                }
            }
        }
        return -1;
    }


    private static int nonRepeatingElement(int[] arr) {
     HashMap<Integer, Integer> map = new HashMap<>();
  // count frequency of each element
//     for (int i = 0; i < arr.length; i++) {
//         if (map.containsKey(arr[i])){
//             map.put(arr[i],map.get(arr[i]+1));
//         }else {
//             map.put(arr[i],1);
//         }
//     }
     // count frequency of each element using hashmap
     for (int num: arr){
         map.put(num,map.getOrDefault(num,0)+1);// getOrDefault(num,0) returns 0 if num is not present
     }

     for(int num :arr){
         if(map.get(num)==1){
             return num;
         }
     }
     return -1;

    }
    // using stream
    private static int nonRepeatingElement2(int[] arr) {
        return (int) Arrays.stream(arr).filter(i -> IntStream.of(arr).filter(j -> j == i).count() == 1).findFirst().orElse(-1);





    }
}
