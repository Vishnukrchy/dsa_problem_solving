package java_8_Feature.lamdaExpression;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Basic_lambda_Problem {
    public static void main(String[] args) {
        //Q1 Convert  String  Lower to  Upper

        Function<String,String> toUpperCase = str->str.toUpperCase();
        System.out.println(toUpperCase.apply("hello"));

        //Q2  Find the Square of a Number
        Function<Integer,Integer> square =(x)->(x*x);
        System.out.println(square.apply(5)); // Output: 25

        //Q3 Check if a Number is Even or Odd
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(4)); // Output: true
        System.out.println(isEven.test(7)); // Output: false

        //Q4  Concatenate Two Strings
        BiFunction<String, String, String> concat = (s1, s2) -> s1 + " " + s2;
        System.out.println(concat.apply("Hello", "Vishnu")); // Output: Hello Vishnu

    }

}
