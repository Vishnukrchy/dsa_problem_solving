package Array;

import ProblemSolvingChanlange.User;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
@Author : Vishnu
@Date : 2025-03-17 10:41
Problem Understanding:
Given an array arr. Return the element that occurs at least k number of times.
Note:
If there are multiple answers, please return the first one.
If there is no element found, return -1.
Examples

Input: arr[] = [1, 7, 4, 3, 4, 8, 7], k = 2
Output: 4
Explanation: Both 7 and 4 occur 2 times. But 4 is first that occurs twice. As the index = 4, is the first element.

 */
public class AtLeastKOccurrences {
    public static void main(String[] args) {

     int arr[] = {1, 7, 4, 3, 4, 8, 7};
     int k = 2;
     System.out.println(atLeastK(arr,k));
     System.out.println(atLeastK_1(arr,k));
    }
    // Using HashMap
    public static  int atLeatK2(int arr[],int k){
        HashMap<Integer,Integer> freqCount=new HashMap<>();
        // count the frequency of each element
        for (int i=0; i<arr.length;i++){
            freqCount.put(arr[i],freqCount.getOrDefault(arr[i],0)+1);
        }
        // return the first element that occurs at least k times
        for (int i=0;i<arr.length;i++){
            if (freqCount.get(arr[i])>=k){
                return arr[i];
            }
        }
        return  -1;
    }
    // by linked map;
    public  static int atLeastK3(int arr[],int k){
        int n=arr.length;
        Map<Integer,Integer> freqMap=new LinkedHashMap<>();
        for (int i=0;i<n;i++){
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
            if (freqMap.get(arr[i])>=k){
                return arr[i];
            }
        }
        return -1;
    }

    public static int atLeastK_1(int[] arr, int k) {
        int n = arr.length;
        int max= Arrays.stream(arr).max().getAsInt();
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        User.printArray(count);
        for (int i=0;i<n;i++){
            if (count[arr[i]]>=k){
                return arr[i];// return first element which occurs at least k times
            }
        }
        return -1;
    }

    private static int  atLeastK(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        int element = 0;
        for(int i = 0; i < n; i++){
            count = 0;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count >= k){
                element = arr[i];
                return element;
            }
        }
       return  -1;
    }

}
