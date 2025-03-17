package Array;

import java.util.HashSet;

/*
@Author : Vishnu Kumar
@Date : 202-03-10 10:41
Problem Understanding:
Given two unsorted integer arrays a[] and b[] each consisting of distinct elements, the task is to return the count of elements in the intersection (or common elements) of the two arrays.
Intersection of two arrays can be defined as the set containing distinct common elements between the two arrays.
Examples:

Input: a[] = [89, 24, 75, 11, 23], b[] = [89, 2, 4]
Output: 1
Explanation: 89 is the only element in the intersection of two arrays.
Input: a[] = [1, 2, 4, 3, 5, 6], b[] = [3, 4, 5, 6, 7]
Output: 4
Explanation: 3, 4, 5, and 6 are the elements in the intersection of two arrays.
 */
public class ArrayIntersection {
    public static void main(String[] args) {
        int a[] = {89, 24, 75, 11, 23};
        int b[] = {89, 2, 4};

        System.out.println(intersection(a,b));
        System.out.println(intersection2(a,b));
    }
    public  static int intersection(int a[],int b[]) {
        int count =0;
        for (int i = 0; i < a.length; i++) {
            for(int j=0;j<b.length;j++) {
              if (a[i]==b[j]) {
                  count++;
                  break; // break used for avoid the  counting duplicate occurrences of elements
              }
            }
        }
        return count;
    }
    public  static int intersection2(int a[],int b[]) {
int count =0;
        HashSet<Integer> set = new HashSet<>();

//        for (int i = 0; i < a.length; i++) {
//            for(int j=0;j<b.length;j++) {
//                if (a[i]==b[j]) {
//                    set.add(a[i]);
//                }
//            }
//        }
//        return set.size();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
//        for (int i = 0; i < b.length; i++) {
//            set.add(b[i]);
//        }
//        return set.size();
        for(int i:b) {
            if (set.contains(i)){
                count++;
            }
        }
        return count;

    }
}
