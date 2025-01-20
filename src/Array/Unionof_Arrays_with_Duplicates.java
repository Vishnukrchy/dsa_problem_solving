package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Unionof_Arrays_with_Duplicates {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        int[] union = getUnion(arr1, arr2);
        for (int num : union) {
            System.out.print(num + " ");
        }

}
    public static int doUnion1(int[] a, int[] b) {
        // Step 1: Combine the arrays
        int[] combined = new int[a.length + b.length];
        int index = 0;

        // Add elements from array a[]
        for (int num : a) {
            combined[index++] = num;
        }

        // Add elements from array b[]
        for (int num : b) {
            combined[index++] = num;
        }

        // Step 2: Sort the combined array
        Arrays.sort(combined);

        // Step 3: Count distinct elements
        int count = 1; // First element is always unique
        for (int i = 1; i < combined.length; i++) {
            if (combined[i] != combined[i - 1]) {
                count++;
            }
        }

        return count;
    }
    public static int doUnion(int[] a, int[] b) {
        // Create a HashSet to store unique elements
        Set<Integer> unionSet = new HashSet<>();

        // Add elements of array a[] to the set
        for (int num : a) {
            unionSet.add(num);
        }

        // Add elements of array b[] to the set
        for (int num : b) {
            unionSet.add(num);
        }

        // The size of the set represents the number of unique elements in the union
        return unionSet.size();
    }

  private static int[] getIntersection(int[] arr1, int[] arr2) {
      int[] intersection = new int[arr1.length + arr2.length];
      int index = 0;
      for (int num : arr1) {
          if (Boolean.parseBoolean(arr2.toString())) {
              intersection[index++] = num;
          }
      }
      return intersection;
  }
    private static int[] getUnion(int[] arr1, int[] arr2) {
        int[] union = new int[arr1.length + arr2.length];
        int index = 0;
        for (int num : arr1) {
            union[index++] = num;
        }
        for (int num : arr2) {
            union[index++] = num;
        }
        return union;
    }


    }
