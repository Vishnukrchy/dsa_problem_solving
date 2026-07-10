package Array;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
@Author : Vishnu Kumar
@Date : 7/7/2026
@Description : Union of 2 sorted arrays
 ex arr1 = {1,2,3,4,5}
 arr2 = {1,2,3,4,5}
 output = {1,2,3,4,5}
 approach
 1. use 2 pointer approach
 2. use hash set
 3. use stream
 */
public class Unionof2SortedArrays {
    static void main() {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4,5};
        ArrayList<Integer> result = unionOf2SortedArrays(arr1, arr2);
        System.out.println(result);


        ArrayList<Integer> union = unionOf2SortedArrays2(arr1, arr2);

        System.out.println("Union of the two arrays:");
        System.out.println(union);
    }

    static ArrayList<Integer> unionOf2SortedArrays(int[] arr1, int[] arr2) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : arr1){
            set.add(num);
        }
        for(int num :arr2){
            set.add(num);
        }
        return new ArrayList<>(set);
    }
    
    static ArrayList<Integer> unionOf2SortedArrays2(int[] a, int[] b) {
     // 2 pointer approach
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {

                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;

            } else if (a[i] > b[j]) {

                if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);
                }
                j++;

            } else {

                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
        }

        while (i < a.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }

        while (j < b.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }

        return ans;
    }
    // using Stream API
    static ArrayList<Integer> unionOf2SortedArrays3(int[] a, int[] b) {
        //return Stream.of(a, b).flatMapToInt(Arrays::stream).distinct().boxed().collect(Collectors.toCollection(ArrayList::new));

        java.util.ArrayList<Integer> result =Stream.of(a,b)
                .flatMapToInt(Arrays::stream).distinct()// remove duplicates
                .boxed()// convert to stream of Integer
                .collect(Collectors.toCollection(ArrayList::new));// collect to ArrayList
        return result;
    }


      
      
      
      
      
      

}
