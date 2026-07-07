package Array.revision;

public class ArmstrongNo {
    static void main() {
        int num = 1;

        if(isArmstrongNo(num) == num) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

    }
    public static int countDigitOfNo(int n) {
        int count =0;
        while (n>0){
            n=n/10;
            count++;

        }
        return count;
    }
    public static int isArmstrongNo(int num) {
        int count = countDigitOfNo(num);
        int sum =0;
        while (num>0){
            int lastDigit = num % 10;
         //   sum = sum + (int) Math.pow(lastDigit, count);
            sum = sum + getPower(lastDigit, count);
            num = num / 10;
        }
        return sum;


    }
    public static int getPower(int a,int b){
        int power=1;
        for (int i = 0; i < b; i++) {
            power = power * a;
        }
        return power;
    }

}
