package Array.revision;

/*
count digit of number
example:
12345
 ans = 5
 */
public class CountDigitOFNo {
    static void main() {
        int i=123456;

        int count =0;
       while(i>0){
        i=i/10;
        count++;
       }
       System.out.println(count);

    }
}
