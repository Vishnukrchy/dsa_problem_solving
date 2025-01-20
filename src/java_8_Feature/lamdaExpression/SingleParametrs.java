package java_8_Feature.lamdaExpression;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleParametrs {

    public static void main(String[] args) {
        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        // Using forEach() method  by lambda expression
        list.forEach(n-> System.out.println(n));
        // Using forEach() method by method reference -> method reference is a feature of java 8 that allows us to pass a method reference as an argument to a lambda expression
        list.forEach(System.out::print);

        list.forEach(n->{
            boolean isEven = n % 2 == 0;
            if (isEven) {
                System.out.println(n + " is even");
            }else {
                System.out.println(n + " is odd");
            }
        } );
    }

}

