package ProblemSolving_Challenge;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q9LowestAndHighest {
    public static void main(String[] args) {
        int arr[]=User.userInputArray();
       System.out.println(lowestAndHighest(arr));
        System.out.println(lowestAndHighest2(arr));
        User.printArray(arr);

        System.out.println(new Scanner(System.in).nextLine()==null);

    }

    public static Map<String, Integer> lowestAndHighest(int[] arr) {
        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        for (int num : arr) {
            lowest = Math.min(lowest, num);
            highest = Math.max(highest, num);
        }
       if (lowest == highest) {
           System.out.println("The array contains only one element. or having same values");
       }
        return Map.of("lowest", lowest, "highest", highest);

    }

    public static Map<String, Integer> lowestAndHighest2(int[] arr) {
        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        if (lowest == highest) {
            System.out.println("The array contains only one element. or having same values");
        }
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("lowest", lowest);
        map.put("highest", highest);
        return map;
    }

}
