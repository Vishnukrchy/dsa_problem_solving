package java_8_Feature.lamdaExpression;


interface ZeroParameter {
    void display();
}

class ZeroParameterTest {
    public static void main(String[] args) {
        ZeroParameter zeroParameter = () -> System.out.println("Hello World");
        zeroParameter.display();
    }
}
