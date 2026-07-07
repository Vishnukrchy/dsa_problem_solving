package Array.revision;

public class ReverseNo {
    static void main() {

        int  num =12345;
        /*
        if we find  mode %10 we get the last digit
        12345%10 = 5
        1234%10 = 4
        123%10 = 3
        12%10 = 2
        1%10 = 1

        if we divide the number by 10 we get the last digit
        12345/10 = 1234
        1234/10 = 123
        123/10 = 12
        12/10 = 1
        1/10 = 0
         and if we multiply the last digit with 10 we get the next digit
         1*10 = 10
         2*10 = 20
         3*10 = 30
         4*10 = 40
         5*10 = 50
          and if we add the next digit with the previous digit we get the next digit
          10+20 = 30
          30+30 = 60
          60+40 = 100
          100+50 = 150
         */


         /*
          for reverse the number we need to
          1. find the last digit
          2. multiply the last digit with 10
          3. add the next digit with the previous digit
          4. divide the number by 10
          5. repeat step 1-4 until the number is 0
          */
        int reversed =0;
        for (int i = 0; i < num; i++) {
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num = num / 10;

        }
        System.out.println(reversed);
    }
}
