package basic;
/*
We are given two integers a and b.
We need to find their GCD (Greatest Common Divisor) — the largest number that divides both a and b completely (remainder 0).

Example:

gcd(12, 15) = 3

gcd(10, 5) = 5

🛠 Solution Approach
 */
public class Gcd {
    public static void main(String[] args) {
     int a=12,b=15;
        System.out.println(gcdCustom(a,b));
        // or we can use inbuild function
       // System.out.println(gcd(10,5));

    }
    public  static  int gcdCustom(int a,int b){
        int min =a<b?a:b;// find min for  we iterate only at min value
        int gcd =1;// min gcd is always 1
        for (int i = 1; i <=min; i++) {
            if (a%i==0 && b%i==0){
                gcd=i;// update highest common divisor
            }
        }
        return gcd;
    }
    // by using recursion
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
