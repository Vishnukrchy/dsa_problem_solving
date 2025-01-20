package java_8_Feature.lamdaExpression;

/**
 * @Author: Vishnu Kumar
 * @Date: 2022-07-30 10:41
 * @Description: About lamda expression
 *
 * What is lamda expression?
 * -> Lamda expression is a way to create anonymous function. It is a function that is defined without a name.
 * -> in java lamda expression is introduced in java 8. that is used  with functional interface.
 * Syntax
 * Java Lambda Expression has the following syntax:
 * (argument list) -> { body of the expression }
 *
 * Components:
 * Argument List: Parameters for the lambda expression
 * Arrow Token (->): Separates the parameter list and the body
 * Body: Logic to be executed.
 * Lambda Expression Parameters
 *
 * Lambda Expression Parameters
 * There are three Lambda Expression Parameters are mentioned below:
 *
 * Zero Parameter
 * Single Parameter
 * Multiple Parameters
 *
 *   1. Zero Parameter
 *    -> Lambda expression can be used when there is no parameter to be passed.
 *    Example:
 *    @FunctionalInterface
 *      interface ZeroParameter {
 *     void display();
 *     }
 *     public class Geeks {
 *     public static void main(String[] args)
 *     {
 *         // Lambda expression with zero parameters
 *         ZeroParameter zeroParamLambda = ()
 *             -> System.out.println(
 *                 "This is a zero-parameter lambda expression!");
 *
 *         // Invoke the method
 *         zeroParamLambda.display();
 *     }
 * }
 * Output
 * This is a zero-parameter lambda expression!
 *
 *
 *
 * Rules to Remember
 * 1 If the body contains a single statement, the braces {} and return keyword can be omitted.
 * example:
 *        x -> x * x; // Simplified
 *
 * 2 If the body contains multiple statements, the braces {} and return keyword must be present.
 * example:
 *        x -> { return x * x; }
 *        or
 *        x -> {
 *            int result = x * x;
 *            return result;
 *        };
 *
 * 3 If no parameters are required, use empty parentheses ()
 * example:
 *        () -> System.out.println("Hello World!");
 *
 * 4 The parameter type can be inferred by the compiler, so specifying the type is optional.
 * example:
 *        (int x, int y) -> x + y; // Explicit
 *        (x, y) -> x + y;        // Inferred
 *
 *
 *Practical Use Cases
 * Iterating Collections:
 * List<String> names = Arrays.asList("John", "Jane", "Doe");
 * names.forEach(name -> System.out.println(name));
 *
 *
 * Filtering Data:
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
 * numbers.stream().filter(x -> x > 2).forEach(System.out::println);
 * Custom Logic in Sorting:
 * * List<String> fruits = Arrays.asList("Banana", "Apple", "Mango");
 * fruits.sort((a, b) -> a.compareTo(b));
 * System.out.println(fruits); // [Apple, Banana, Mango]
 */

/*
Practice Questions
1. Create a lambda expression that adds two numbers and returns the result.
2. Create a lambda expression that multiplies two numbers and returns the result.
3. Create a lambda expression that concatenates two strings and returns the result.
4. Create a lambda expression that checks if a number is even and returns a boolean value.
5. Create a lambda expression that checks if a number is odd and returns a boolean value.
6. Create a lambda expression that checks if a string is empty and returns a boolean value.

 */