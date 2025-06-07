package Array;

import java.util.HashMap;

/*
@Author: Vishnu kumar
@Date :2025-05-29

Problem Understanding:
Given an array arr[] of size N and two elements x and y, use counter variables to find which element appears most in the array. If both elements have the same frequency, then return the smaller element.
Note:  We need to return the element, not its count.
Examples:
Input:
N = 11
arr[] = {1,1,2,2,3,3,4,4,4,4,5}
x = 4, y = 5
Output: 4
Explanation:
frequency of 4 is 4.
frequency of 5 is 1.
Since 4 has a higher frequency, it is returned.


 */
public class Majority {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,4,4,4,5};
        int x=4,y=5;
        System.out.println(majority(arr,x,y));

        System.out.println(majoritySolution2(arr,x,y));
    }
    // by brute force
    public static int majority(int arr[],int x,int y) {
        int countX=0,countY=0;
        for (int i = 0; i < arr.length ; i++) {
           if (arr[i]==x){
               countX++;
           } else if (arr[i]==y) {
               countY++;
           }
        }
        if (countX==countY){
            return x<y?x:y;
        }
         else if (countY>countX){
            return y;
        }else {
            return x;
        }


    }
    //by using hash map
    public static int majoritySolution2(int arr[],int x,int y) {

        HashMap<Integer,Integer> map=new HashMap<>();
       // count frequency by containsKey method of map
//        for (int i = 0; i <arr.length ; i++) {
//            if (map.containsKey(arr[i])){
//                map.put(arr[i],map.get(arr[i])+1);
//            }else {
//                map.put(arr[i],1 );
//            }
//        }

        //  count frequency by getOrDefault method of map
             /*
             getOrDefault() method returns the value of the map if the key is present in the map,
             otherwise it returns the default value passed as an argument to the method.
             example:
             map.put(1,1);
             map.put(2,2);
             map.put(3,3);
             System.out.println(map.getOrDefault(4,0)); => 0
             system.out.println(map.getOrDefault(1,0)); => 1
              */
        for (int i = 0; i <arr.length ; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1 );
        }
        if (map.get(x)==map.get(y)){
            return x<y?x:y;
        }
        else if(map.get(x)>map.get(y)){
            return x;
        }else {
            return y;
        }
    }

}
