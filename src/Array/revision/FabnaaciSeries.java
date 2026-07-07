package Array.revision;

/*
fabnaaci series
example:
arr = [0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811,514229,832040,1346269,2178309,3524578,5702887,9227465,14930352,24157817,39088169,63245986,102334155,165580141,267914296,433494437,701408733,1134903170,1836311903]
 */
public class FabnaaciSeries {

    static void main() {
        // generate fabnaaci series
        int first =0;
        int second =1;
        int n=10 ;// n is the number of terms
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;// next term is sum of previous two terms
            first = second;// update the first
            second = next;// update the second
        }

        // find nth fabnaaci number
        System.out.println(findNthFabnaaciNumber(10));
    }

    private static int findNthFabnaaciNumber(int n) {
        int first = 0;
        int second = 1;
        if (n == 0) {
            return 0;
        }
        for (int i = 0; i < n - 1; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }
}
