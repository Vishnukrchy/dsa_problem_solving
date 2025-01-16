package java_8_Feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayStreamExample {

    public static void main(String[] args) {
        // Sample array of integers
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Convert array to a list for easier stream operations
        List<Integer> numberList = Arrays.asList(numbers);

        // Find even numbers using stream
        List<Integer> evenNumbers = numberList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // Find odd numbers using stream
        List<Integer> oddNumbers = numberList.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        // Find numbers greater than 5 using stream
        List<Integer> greaterThanFive = numberList.stream()
                .filter(n -> n > 5)
                .collect(Collectors.toList());

        // Print the results
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println("Numbers greater than 5: " + greaterThanFive);

        // Calculate the sum of all numbers using stream
        int sum = numberList.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of all numbers: " + sum);

        // Find the maximum number using stream
        Integer max = numberList.stream()
                .max(Integer::compare)
                .orElse(null);
        System.out.println("Maximum number: " + max);

        // Find the minimum number using stream
        Integer min = numberList.stream()
                .min(Integer::compare)
                .orElse(null);
        System.out.println("Minimum number: " + min);
    }
}