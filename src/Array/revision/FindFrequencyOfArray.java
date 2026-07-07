package Array.revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/*
find frequency of array
ex 
 1 2 3 4 5 1 2 3 4 5
 1->2
 2->2
 3->2
 4->2
 5->2
 */
public class FindFrequencyOfArray {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        findFrequency(arr);

        int test[] = {22, 21, 1, 3, 1, 3, 22, 5, 4, 22};
        findFrequency2(test);
        // Print the results using different methods
        System.out.println("======== Frequencies By Normal Counter ================");
        checkFrequencies1(test.clone()); // Cloning to avoid side effects in original array
    }
    // brute force
    private static void checkFrequencies1(int[] arr) {
        int n =arr.length;
        for (int i = 0; i < n; i++) {
            int count=1;
            for (int j = i+1  ; j <n; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    // after incrementing the count we need to make the element -1
                    arr[j]=arr[n-1];
                    n--;
                    j--;
                }
            }
            System.out.println(arr[i]+"->"+count+" times");
        }
    }

    private static void findFrequency(int[] arr) {
        int n = arr.length;
      
        for (int i = 0; i < n; i++) {
            int count =1;
            if (arr[i]==-1) continue;
            for (int j = i+1 ; j < n; j++) {
                if (arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }

            }
            System.out.println(arr[i]+"->"+count+" times");
            
        }
    }
    //
    private static void findFrequency2(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        // create array of size max+1
        int[] freq = new int[max+1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]>0){
                System.out.println(i+"->"+freq[i]+" times");
            }
        }

    }
    // frequency by using hash map
    private static void findFrequency3(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

//        for (int i = 0; i < arr.length; i++) {
//           if (map.containsKey(arr[i])){
//               map.put(arr[i],map.get(arr[i])+1);
//           }else {
//               map.put(arr[i],1);
//           }
//        }
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue() + " times");
        }
    }
}
