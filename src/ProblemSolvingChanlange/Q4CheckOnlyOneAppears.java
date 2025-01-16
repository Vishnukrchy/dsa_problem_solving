package ProblemSolvingChanlange;

import java.util.*;

public class Q4CheckOnlyOneAppears {
    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        System.out.println(" ENter The Size Of Array ");
//
//        Integer n =scanner.nextInt();
//
//        int arr [] =new int[n];
//        for (int i = 0; i <n ; i++) {
//            System.out.println("enter the "+(i+1)+" elements of array !!! ");
//            arr[i]=scanner.nextInt();
//        }
//        System.out.println(getNon_Repeating_Elements(arr));
        // Example array for testing
        System.out.println(" ==================== Fixed Array For Testing =================== ");
        int test[] = {22, 21,3,5,22,3,0,2,1};
        System.out.println("Non-Repeating-Elements In Given Array Is : "+getNon_Repeating_Elements(test));
//        System.out.println("Non-Repeating-Elements In Given Array Is : "+getNon_Repeating_ElementsByCounter(test));
        System.out.println("Non-Repeating-Elements In Given Array Is : "+getNon_Repeating_ElementsByCounterByArrayCounter(test));


    }
    public static Map<String, Object> getNon_Repeating_Elements(int [] a){
        int n=a.length;
        List<Integer> non_repeating_list=new LinkedList<>();
        List<Integer> repeating_list=new LinkedList<>();
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int count=1;
            for (int j = i+1; j < n; j++) {
                if(a[i]==a[j]){
                    count++;
                    a[j]=a[n-1];
                    j--;n--;
                }
            }
              if (count == 1) { non_repeating_list.add(a[i]);} else{ repeating_list.add(a[i]);}

        }
        System.out.println(non_repeating_list);
        System.out.println(repeating_list);
        map.put("non-repeating-elements : ",non_repeating_list);
        map.put("repeating-elements : ",repeating_list);
        return map ;
    }
    public static Map<String, Object> getNon_Repeating_ElementsByCounterByArrayCounter(int[] a){
        List<Integer> non_repeating_list=new LinkedList<>();
        List<Integer> repeating_list=new LinkedList<>();
        Map<String, Object> map = new HashMap<>();
        int max=0;
        for (int num:a) max=num>max?num:max;
        int count[] =new int[max+1];
        for (int i = 0; i <a.length ; i++) {
            count[a[i]]++;
        }
        for (int i = 0; i <count.length ; i++) {
            if (count[i]==1){
                non_repeating_list.add(i);
            } else if (count[i]>1) {
                repeating_list.add(i);
            }
        }
        System.out.println(non_repeating_list);
        System.out.println(repeating_list);
        map.put("non-repeating-elements : ",non_repeating_list);
        map.put("repeating-elements : ",repeating_list);
        return map ;

    }

    public static Map<String, Object> getNon_Repeating_ElementsByCounter(int [] a){
        int n=a.length;
        List<Integer> non_repeating_list=new LinkedList<>();
        List<Integer> repeating_list=new LinkedList<>();
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int count=1;
            // to skip repeating elements
            if (a[i]==-1) continue;
            for (int j = i+1; j < n; j++) {
                if(a[i]==a[j]){
                    count++;
                    // mark visited
                   a[i]=-1;
                }
            }
            if (count == 1) { non_repeating_list.add(a[i]);} else{ repeating_list.add(a[i]);}

        }
        System.out.println(non_repeating_list);
        System.out.println(repeating_list);
        map.put("non-repeating-elements : ",non_repeating_list);
        map.put("repeating-elements : ",repeating_list);
        return map ;
    }

}
