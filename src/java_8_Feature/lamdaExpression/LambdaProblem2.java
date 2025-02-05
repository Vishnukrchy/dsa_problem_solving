package java_8_Feature.lamdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaProblem2 {
    public static void main(String[] args) {
        LambdaFilterEven.lambdaFilterEven();

    }
}
// Q1  Filter Even Numbers from a List
class LambdaFilterEven {
    public static void lambdaFilterEven() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers); // Output: [2, 4, 6]
    }
}
//Q2 Sort a List of Strings in Reverse Order
class LambdaSortReverse {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
       fruits.sort((a,b)->b.compareTo(a));
        System.out.println(fruits); // Output: [cherry, banana, apple]
    }
}
// Q3 Find the Maximum Number in a List
class LambdaFindMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 1, 9, 5);
        Optional<Integer> maxNum=numbers.stream().max(Integer::compareTo);
        maxNum.ifPresent(System.out::println); // Output: 9
    }
}
//Q4  Remove Duplicates from a List
class LambdaRemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                        .collect(Collectors.toList());
        System.out.println(uniqueNumbers); // Output: [1, 2, 3, 4, 5]
    }
}
