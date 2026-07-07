package Test.tcs;
/*
Reverse a string without using built‑in methods.
 */
public class ReverseString {
    static void main() {
        String str = "IAM";
        System.out.println(reverseString(str));
        System.out.println(reverseString2(str));
    }
    private static String reverseString(String str) {
        //return new StringBuilder(str).reverse().toString();
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
    private static String reverseString2(String str) {
       String res ="";
        for (int i = 0; i < str.length(); i++) {
            res =str.charAt(i)+res;
        }
        return res;

    }
    // using array stream
    private static String reverseString3(String str) {
        return str.chars().mapToObj(c -> (char) c)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .reverse().toString();
    }
}
