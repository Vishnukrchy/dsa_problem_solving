package String;

import java.util.Stack;

/*
Problem Statement
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Examples :

Input: s = "[{()}]"
Output: true
Explanation: All the brackets are well-formed.
Input: s = "[()()]{}"
Output: true
Explanation: All the brackets are well-formed.
 */
public class Balanced_parentheses {
    public static void main(String[] args) {
        String s = "([)]";
        String s1 = "[{()}]";

        System.out.println(isValid(s));
        System.out.println(isValid1(s1));   }
    public static boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch== '(' || ch == '{' || ch == '[') {
                stack.push(ch);// push the opening bracket onto the stack
            } else {
                if(stack.isEmpty()) return false;
                //
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;


                }
            }

        }
        // if the stack is empty, the string is valid
        return stack.isEmpty();
    }
    public static boolean isValid(String s) {
        // check if the length of the string is odd
        if (s.length() % 2 != 0) {
            return false;
        }
        // take a stack to store the opening brackets on the top of the stack
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            // check if the current character is an opening bracket
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                System.out.println(stack);
            }// check if the current character is a closing bracket and if it matches the top of the stack
            else {
                if (stack.isEmpty() || (ch == ')' && stack.peek() != '(') || (ch == '}' && stack.peek() != '{') || (ch == ']' && stack.peek() != '[')) {
                    System.out.println(stack);
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }


}
/*
Solution:
Approach:
Traverse the string.
Push each opening bracket onto the stack.
For each closing bracket, check if it matches the top of the stack:
If it matches, pop the stack.
If it doesn’t match or the stack is empty, the string is invalid.
At the end of traversal, the stack should be empty for a valid string.
 */
