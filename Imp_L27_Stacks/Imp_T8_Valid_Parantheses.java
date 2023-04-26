package Imp_L27_Stacks;

import java.util.Stack;

public class Imp_T8_Valid_Parantheses {

    // Time Complexity= O(m)
    public static boolean validParantheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(str.charAt(i));
            } 
            else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {stack.pop();}
            else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {stack.pop();} 
            else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {stack.pop();} 
            else
                return false;
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(validParantheses("({}(({{}}))"));

    }

}
