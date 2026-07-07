package Test.tcs;
/*
plaindrome string

 ex given a string s, return true if the s is a palindrome, false otherwise.
 ex s = "A man, a plan, a canal: Panama" return true

 approach
 1. remove all non-alphanumeric characters
 2. convert to lowercase
 3. check if it is a palindrome

 */
public class PlainDromeString {
    static void main() {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    private static boolean isPalindrome(String s) {

        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //String rev = new StringBuilder(s).reverse().toString();

        int left =0;
        int right=s.length()-1;

        while (left<right){
            if (s.charAt(left) !=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    private static boolean isPalindrome2(String s) {

        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
}
