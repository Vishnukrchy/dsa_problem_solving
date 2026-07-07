package Test.tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

/*
remove duplicate from array list
 ex given an array list [1,2,3,1,2,5] return [1,2,3,5]
 */
public class RemoveDuplicateFromrrayList {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,1,2,5));
        System.out.println(list);
        removeDuplicates(list);
        System.out.println(list);
        removeDuplicates2(list);
    }

    private static void removeDuplicates(ArrayList<Integer> list) {
        // using hash set
        HashSet<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        // without hash set





    }
    // using stream
    private static void removeDuplicates2(ArrayList<Integer> list) {
         java.util.ArrayList<Integer> result =  list.stream()
                 .distinct()
                 .collect(Collectors.toCollection(()->new ArrayList<>()));

                 //.forEach(System.out::println);
        System.out.println(result);

    }
}
