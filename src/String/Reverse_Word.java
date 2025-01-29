package String;

public class Reverse_Word {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != ' ') {
                word.append(c);
            } else if (word.length() > 0) {
                result.append(word).append(" ");
                word.setLength(0);
            }
        }
        if (word.length() > 0) {
            result.append(word);    // Append the last word
        }
        return result.toString();
    }
}


/*
Steps
Trim the String:

Remove leading and trailing spaces using trim().
Initialize Variables:

Use a StringBuilder to collect the result and a temporary StringBuilder to construct each word.
Traverse the String from End to Start:

Start from the last character and move backward:
If the current character is not a space, prepend it to the current word.
If it is a space and the current word is non-empty, add the word to the result and reset the word.
Handle the Last Word:

Add the last collected word to the result after the loop ends.
Return the Result:

Convert the StringBuilder result into a string and return it.
Edge Cases
Single Word:

Input: " a "
Output: "a"
Multiple Spaces:

Input: " hello world "
Output: "world hello"
Empty String:

Input: " "
Output: ""
 */
