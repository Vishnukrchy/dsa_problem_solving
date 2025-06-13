package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
@Author: Vishnu kumar
@Date :2025-06-13
Problem Understanding:
Given three arrays, find the common elements present in all three arrays. The output should be a sorted array of these common elements.
You’re given 3 arrays where:
Numbers are sorted from small to big.
Some numbers might show up more than once in a single array.
 Your job: Find all numbers that appear in all 3 arrays.
 If some numbers are common → return them once each
 If nothing is common → return -1

Examples:
Input:
arr1 = [1, 2, 3, 4, 5]
arr2 = [2, 3, 5, 7, 11]
arr3 = [1, 2, 3, 4, 5]
Output: [2, 3, 5]

Input:
arr1 = [1, 5, 10, 20, 40, 80]
arr2 = [6, 7, 20, 80, 100]
arr3 = [3, 4, 15, 20, 30, 70, 80, 120]
Output: [20, 80]
// If no common elements are found, return -1

 */
public class CommonInThreeArrays {
    public static void main(String[] args) {

    }
    public static int[] commonInThreeArrays(int[] arr1, int[] arr2, int[] arr3) {
        // First Way: Brute Force
         return bruteForce(arr1, arr2, arr3);

        // Second Way: Smart Way
        //return smartWay(arr1, arr2, arr3);
    }



    private static int[] bruteForce(int[] arr1, int[] arr2, int[] arr3) {
        //Using a Set to avoid duplicates
        Set<Integer> resultSet = new HashSet<>();

        // Check each number in arr1
        for (int num1:arr1){
            //check if it exists in arr2 and arr3
            for (int num2: arr2) {
                // If num1 is found in arr2, check arr3
                for (int num3: arr3) {
                    // If num1 is found in both arr2 and arr3
                    if (num1 == num2 && num1 == num3) {
                        resultSet.add(num1); // Add to result if found in all three
                    }
                }
            }
        }

        // Convert Set to int array
//        if (resultSet.isEmpty()) {
//            return new int[]{-1}; // If no common elements found, return -1
//        }
//        int[] result = new int[resultSet.size()];
//        int index = 0;
//        for (int num : resultSet) {
//            result[index++] = num; // Fill the result array
//        }
        // Convert Set to int array using streams
        int [] result =resultSet.stream().
                mapToInt(Integer::intValue).toArray();
        // Sort the result array
        Arrays.sort(result);

        return result.length > 0 ? result : new int[]{-1}; // If no common elements found, return -1

        /*
        // When i solved this problem,  i got following ideas
         if we need to return in List<Interger> format
         return resultSet.stream().sorted().collect(Collectors.toList());
         if we need to return in List<Integer> format in descending order
         return resultSet.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

          List<Integer> r = rs.stream().collect(Collectors.toList());
           Collections.sort(r);
           return r.size() > 0 ? r : Collections.singletonList(-1);

           How to convert Set<Integer> to int[] in Java?
              int[] result = resultSet.stream().mapToInt(Integer::intValue).toArray();
           How To Convert One Type Collection To Another Type Collection In Java?
             How To Convert Set To List In Java?
               way 1: Using the constructor of List
               List<Integer> list = new ArrayList<>(resultSet);
               way 2: Using the stream API
               List<Integer> list = resultSet.stream().collect(Collectors.toList());

              How To Convert Map To List In Java?
               way 1: Using the entrySet() method
               List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
               way 2: Using the stream API
               List<Map.Entry<Integer, Integer>> list = map.entrySet().stream().collect(Collectors.toList());

               How To Convert List To Set In Java?
               way 1: Using the constructor of Set
               Set<Integer> set = new HashSet<>(list);
               way 2: Using the stream API
               Set<Integer> set = list.stream().collect(Collectors.toSet());
         */
    }
    private static List<Integer> smartWay(List<Integer> arr1, List<Integer> arr2, List<Integer>  arr3) {
        //  very smart way to find common elements in three sorted arrays
        // used the set and there method to find common elements
        Set<Integer> set1 = new HashSet<>(arr1);
        Set<Integer> set2 = new HashSet<>(arr2);
        Set<Integer> set3 = new HashSet<>(arr3);


        // Find intersection of three sets
        // retainAll() method keeps only the elements that are also in the specified collection example set2 and set3
        set1.retainAll(set2); // Keep only elements that are in both set1 and set2
        set1.retainAll(set3); // Keep only elements that are also in set3

        // Convert Set to List and sort it
        List<Integer> resultList = set1.stream()
                .sorted()
                .collect(Collectors.toList());
        // If no common elements found, return -1
        return resultList.isEmpty() ? List.of(-1) : resultList; // If no common elements found, return -1

        // Using 3 pointers to find common elements
//        int i = 0, j = 0, k = 0;
//        Set<Integer> resultSet = new HashSet<>();
//        while (i < arr1.size() && j < arr2.size() && k < arr3.size()) {
//            // Compare elements at the current pointers
//            if (arr1.get(i).equals(arr2.get(j)) && arr1.get(i).equals(arr3.get(k))) {
//                resultSet.add(arr1.get(i)); // Add common element to result
//                i++;
//                j++;
//                k++;
//            } else if (arr1.get(i) < arr2.get(j)) {
//                i++; // Move pointer in arr1
//            } else if (arr2.get(j) < arr3.get(k)) {
//                j++; // Move pointer in arr2
//            } else {
//                k++; // Move pointer in arr3
//            }
//        }
//        // Convert Set to List and sort it
//        List<Integer> resultList = resultSet.stream()
//                .sorted()
//                .collect(Collectors.toList());
//        //
//        return resultList.isEmpty() ? List.of(-1) : resultList; // If no common elements found, return -1
    }
}

/*
First Way: Brute Force (Try Every Possibility)
How it works:
Look at each number in the first array (arr1).

For every number, check if that number is also in arr2 and arr3.

If yes, add it to result.

Make sure to not add the same number twice.

🧠 Imagine you’re holding arr1 in your hand and asking:

"Hey arr2, do you have this number? And arr3, do you have it too?"

👣 You walk step-by-step through arr1, and double-check each number with the other two.

Dry Run on Example:
Let’s check every number in arr1:

1 → not in both → ❌

5 → ❌

10 → ❌

20 → ✅ yes in all three → add

40 → ❌

80 → ✅ yes in all three → add

✅ Final result: [20, 80]

⚡ Second Way: Smart Way (3 Pointers Method)
Think of 3 fingers — one on each array.
You move the finger that’s pointing at the smallest number.

How it works:
Start with 3 pointers: i=0, j=0, k=0 (one for each array).

Compare arr1[i], arr2[j], arr3[k]:

If all 3 are equal → it's a common number → save it.

If not equal, move the pointer with the smallest number (because it can’t be common).

Repeat until you reach the end of any array.

Dry Run:
Let’s see what the 3 fingers are pointing at:

arr1[i] = 1

arr2[j] = 6

arr3[k] = 3

👉 Smallest is 1 → move i
Next: 5, 6, 3 → smallest is 3 → move k
...
Eventually we get:

20, 20, 20 → 💥 Boom! All match → add 20

later → 80, 80, 80 → 💥 Boom! Add 80

✅ Final result: [20, 80]

🧠 Why Smart Way is Better:
No repeated checking.

Walk forward in each array once.

No extra space.

Works even with duplicates if you skip them carefully.

🔚 Recap:
Method	Easy Way	Smart Way
Idea	Check every number in arr1	Use 3 pointers (one per array)
Time	Slower	Fast
Space	No extra space	No extra space
Good for	Learning logic	Real interviews
 */
