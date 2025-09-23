package Test.acutec_global;

import java.util.Arrays;
import java.util.List;

/*
given a number list and find the first number which is divisible by 3 and 5
 */
public class Q2_Stream {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 30, 45};
        // Using Java Streams to find the first number divisible by both 3 and 5
        int firstDivisible = Arrays.stream(numbers)
                .filter(num->num%3==0&& num%5==0)// filter numbers that are divisible by both 3 and 5 filter function applies a condition to each element of the stream and returns a new stream containing only the elements that match the condition
                .findFirst() // find the first element that matches the condition
                .orElse(-1);// orElse provides a default value if no element is found

        /*
        Explanation:
        1. `Arrays.stream(numbers)`: Converts the array of numbers into a stream.
        2. `.filter(num -> num % 3 == 0 && num % 5 == 0)`: Filters the stream to include only numbers that are divisible by both 3 and 5.
        3. `.findFirst()`: Retrieves the first element from the filtered stream.
        4. `.orElse(-1)`: If no such element is found, it returns -1 as a default value.
        notes if we used findAny() instead of findFirst() it would return any element that matches the condition, not necessarily the first one in the original order.
         and if we used collect(Collectors.toList()) it would return a list of all elements that match the condition, not just the first one.
         .orElse(-1) is used to provide a default value in case no element is found that matches the condition. This prevents a NoSuchElementException from being thrown.
          if you want to return an Optional<Integer> instead of a primitive int, you can simply remove the orElse(-1) part and use findFirst() directly. This will return an Optional<Integer> that may or may not contain a value.
          if we not use orElse(-1) and no element is found, it will throw a NoSuchElementException when trying to access the value of the Optional returned by findFirst().
         */
        // Print the result
        if (firstDivisible != -1) {
            System.out.println("The first number divisible by both 3 and 5 is: " + firstDivisible);
        } else {
            System.out.println("No number found that is divisible by both 3 and 5.");
        }
        /*
        Output:
         */
        // by using map function we can also get the first number divisible by both 3 and 5

        List<Integer> firstDivisibleList = Arrays.stream(numbers)
                .filter(num -> num % 3 == 0 && num % 5 == 0)
                .mapToObj(Integer::valueOf) // Convert int to Integer
                .toList(); // Collect the results into a List

        System.out.println("List of numbers divisible by both 3 and 5: " + firstDivisibleList);

        List<Integer> list=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 30, 45);

        list.stream()
                .filter(num -> num % 3 == 0 && num % 5 == 0)
                .findFirst()
                .ifPresentOrElse(
                        num -> System.out.println("The first number divisible by both 3 and 5 is: " + num),
                        () -> System.out.println("No number found that is divisible by both 3 and 5.")
                );

        list.stream()
                .filter(num-> num % 3 == 0 && num % 5 == 0)
                .mapToInt(Integer::intValue) // Convert Integer to int
                .findFirst()
                .ifPresentOrElse(
                        num -> System.out.println("The first number divisible by both 3 and 5 is: " + num),
                        () -> System.out.println("No number found that is divisible by both 3 and 5.")
                );


    }
}
