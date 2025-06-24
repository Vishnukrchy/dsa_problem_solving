package Test.infoedge;

import java.util.Stack;

/*
Problem Statement
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
example 1:
Input: s = "()"
Output: true
example 2:
Input: s = "()[]{}"
Output: true
example 3:
Input: s = "(]"
Output: false
 */
public class ValidateParentheses {
    public static void main(String[] args) {

        String s = "({[]})";
        boolean result = isValid(s);
        System.out.println("Is the string valid? " + result);
    }

    // Using stack to validate parentheses
    private static boolean isValid(String s) {
        // Create a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                // If it's an opening bracket, push it onto the stack
                stack.push(s.charAt(i));
            } else {
                // If it's a closing bracket, check if the stack is empty or if the top of the stack doesn't match
                if (!stack.isEmpty() &&
                        ((s.charAt(i) == ')' && stack.peek() == '(') ||
                                (s.charAt(i) == '}' && stack.peek() == '{') ||
                                (s.charAt(i) == ']' && stack.peek() == '['))) {
                    // If it matches, pop the top of the stack
                    stack.pop();

                } else {
                    // If it's a closing bracket and the stack is empty or doesn't match, return false
                    return false;
                }
            }
        }
        // If the stack is empty at the end, all brackets were matched correctly
        return stack.isEmpty();

    }
}

