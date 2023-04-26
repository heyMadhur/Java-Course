package Imp_L27_Stacks;

import java.util.*;

public class T4_Reverse_using_Stack {

    public static String reverseStr(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {

        // Ques Reverse a string using Stack
        System.out.println(reverseStr("abc"));

    }

}
