package Array.revision;

public class StrongNo {
    static void main() {
        int num = 4058;
     //   System.out.println(getFatorial(5));
        if(isStrongNo(num) == num) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a Strong number");
        }
    }

    private static int isStrongNo(int num) {
        int sum=0;
        while (num>0){
            int lastDigit = num % 10;
            sum=sum+getFatorial(lastDigit);
            num=num/10;

        }
        return sum;
    }

    private static int getFatorial(int lastDigit) {
        int fact=1;
        for (int i = 1; i <=lastDigit; i++) {
            fact=fact*i;

        }
        return fact;
    }
}
