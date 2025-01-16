package Array;

import ProblemSolvingChanlange.User;

import java.util.ArrayList;

/*
Problem Understanding:
You are given an array of integers. Your task is to find the leaders in the array. An element is a leader if it is greater than all the elements to its right side in the array.
Input: arr = [16, 17, 4, 3, 5, 2]
Output: [17, 5, 2]
Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.

 */
public class ArrayLeaders {
    public static void main(String[] args) {
        int [] arr=User.userInputArray();


    }
    public static int[] findLeaders(int[] arr) {
        int n = arr.length;
        int[] leaders = new int[n];
        int max = arr[n - 1];
        leaders[n - 1] = max;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaders[i] = max;
            } else {
                leaders[i] = max;
            }
        }
        return leaders;
    }
    public static ArrayList<Integer> findLeaders2(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = arr[n - 1];
        leaders.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaders.add(max);
            }
        }
       // leaders.reversed();
       // return leaders;
        // Reverse the list to get leaders in the correct order
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = leaders.size() - 1; i >= 0; i--) {
            result.add(leaders.get(i));
        }

        return result;
    }
    public static ArrayList<Integer> findLeaders3(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = arr[n - 1];
        leaders.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaders.add(max);
            }
        }
        return leaders;
    }

}
