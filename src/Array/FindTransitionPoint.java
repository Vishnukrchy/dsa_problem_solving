package Array;
/*
@Author: vishnu kumar
@date : 2025-02-20 10:41
Problem Understanding:
Given a sorted array, arr[] containing only 0s and 1s, find the transition point, i.e., the first index where 1 was observed, and before that, only 0 was observed.  If arr does not have any 1, return -1. If array does not have any 0, return 0.
Examples:
Input: arr[] = [0, 0, 0, 1, 1]
Output: 3
Explanation: index 3 is the transition point where 1 begins.
 */
public class FindTransitionPoint {
    public static void main(String[] args) {
     int arr[] = {0, 0, 0, 1, 1};
     int n=arr.length;
     int start=0;
     int end=n-1;
     int mid=start+(end-start)/2;
     while(start<=end){
         if(arr[mid]==0){
             start=mid+1;
         }
         else if(arr[mid]==1){
             end=mid-1;
         }
         mid=start+(end-start)/2;
     }
     System.out.println(start);

     System.out.println(findTransitionPoint(arr));
    }
    public  static  int findTransitionPoint(int arr[]){
        int n=arr.length;
        for (int i = 0; i <n ; i++) {
            if (arr[i]==1){
                return  i;
            }

        }
        return -1;
    }

}
