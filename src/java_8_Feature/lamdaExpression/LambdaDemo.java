package java_8_Feature.lamdaExpression;
/*

 */
@FunctionalInterface
interface Addable{
 int add(int a,int b);
}
@FunctionalInterface
interface Greetings {
    void sayHello();
}
public class LambdaDemo {
    public static void main(String[] args) {
        // Example 1: Lambda Without Parameters
        Greetings greet = () -> System.out.println("Hello, Vishnu!");
        greet.sayHello();
        //Example 2: Lambda for Adding Two Numbers
        Addable addition=(a,b)->a+b;
        System.out.println("Sum : "+addition.add(3,5));


    }
}

