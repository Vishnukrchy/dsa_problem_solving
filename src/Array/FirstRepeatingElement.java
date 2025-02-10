package Array;

import ProblemSolvingChanlange.User;

import java.beans.Introspector;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
@AUTHOR: Vishnu Kumar
@Date: 2025-02-10 10:41
Problem Understanding:
Given an array arr[], find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.

Examples:
Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
Output: 5,1
Explanation: The first repeating element is 3
and its first occurrence is at index 2

 */
public class FirstRepeatingElement {
    public static void main(String[] args) {
//        int arr[]= User.userInputArray();
        int arr[]={10, 5, 3, 4, 3, 5, 6};
        int [] result=firstRepeatingElement(arr);
        // By Brut Force
        System.out.println(result[0]+" "+result[1]);
        // By Using Frquency Counter
        System.out.println(firstRepeatingElement2(arr)[0]+" "+firstRepeatingElement2(arr)[1]);
        // By HashSet
        System.out.println(firstRepeatingElement3(arr)[0]+" "+firstRepeatingElement3(arr)[1]);
        // By Using Map
        System.out.println(firstRepeatingElement4(arr)[0]+" "+firstRepeatingElement4(arr)[1]);


    }
    public static int [] firstRepeatingElement4(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        int repeatingValue = -1; // Store the first repeating element

        for (int i = 0; i < arr.length; i++) {
            if (indexMap.containsKey(arr[i])) {
                // Found a repeating element, update minIndex and store value
                if (indexMap.get(arr[i]) < minIndex) {
                    minIndex = indexMap.get(arr[i]);
                    repeatingValue = arr[i];
                }
            } else {
                // Store the first occurrence index (1-based index)
                indexMap.put(arr[i], i + 1);
            }
        }

        return (minIndex == Integer.MAX_VALUE) ? new int[]{-1, -1} : new int[]{repeatingValue, minIndex};
    }

    public  static int [] firstRepeatingElement(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    // here if we want 1 based index then add i+1 instead of i
                    return new int[]{arr[i],i};
                }
            }
        }
        return new int []{-1,-1};
    }
    public static int [] firstRepeatingElement2(int arr[]) {
        int n = arr.length;
        int max= Arrays.stream(arr).max().getAsInt();
        int[] freq = new int[max+1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < n; i++) {
            if (freq[arr[i]] > 1) {
                return new int[]{arr[i],i};
            }
        }
        return new int []{-1,-1};
    }
    public  static int [] firstRepeatingElement3(int arr[]) {
        int n = arr.length;
        HashSet<Integer> seen = new HashSet<>();
//        //
//        for (int i = 0; i < n; i++) {
//            if (seen.contains(arr[i])) {
//                return new int[]{arr[i],i};
//            } else {
//                seen.add(arr[i]);
//            }
//        }
        int repeatingValue = -1;
        int index = -1;
        for (int i = arr.length-1; i >=0; i--) {
            if (seen.contains(arr[i])) {
                repeatingValue = arr[i];
                index = i;

            } else {
                seen.add(arr[i]);
            }
        }
        return new int []{repeatingValue,index};
    }
}
