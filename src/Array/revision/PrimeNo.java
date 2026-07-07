package Array.revision;
/*
find prime number
ex 1,2,3,4,5,
 */
public class PrimeNo {
    static void main() {
    System.out.println(findPrimeNo(2));
    printPrimeNo();
    }

    private static boolean findPrimeNo(int n) {
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        for (int i = 3; i < n/2 ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    private static void printPrimeNo(){
        for (int i = 2; i <= 100; i++) {
            if(findPrimeNo(i)){
                System.out.println(i);
            }
        }
    }
}
