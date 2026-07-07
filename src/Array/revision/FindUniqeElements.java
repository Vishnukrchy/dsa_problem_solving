package Array.revision;

import java.util.*;
import java.util.stream.Collectors;

/*
find unique elements from array
 ex arr {1,2,3,1,2,5}
 ans = {3,5}



 */
public class FindUniqeElements {
    static void main() {
        int arr [] ={1,3,4,5,2,3,4,3,6,7,4,7,9};
        System.out.println(Arrays.toString(findUniqueElements(arr)));

        long count = Arrays.stream(arr).distinct().count();
        System.out.println("unique elements count:  "+count);


        long count2 = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .values()
                .stream()
                .filter(c -> c == 1)
                .count();

        System.out.println("Elements appearing once: " + count2);




        List<Integer> result = Arrays.stream(arr)
                .distinct()
                .boxed()
                .collect(Collectors.toList());

        List<Integer> result2 =Arrays.stream(arr)
                        .boxed()
                                .filter(x->Collections.frequency(Arrays.asList(1,2,2,3,4,4,5),x)==1)
                                        .toList();
        System.out.println(result2);

        System.out.println(result);
    }
    private static int [] findUniqueElements(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();



        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if (entry.getValue()==1){
                list.add(entry.getKey());
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
