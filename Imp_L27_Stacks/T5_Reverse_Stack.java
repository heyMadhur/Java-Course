package Imp_L27_Stacks;

import java.util.*;

public class T5_Reverse_Stack {

    public static void pushBottom(Stack<Integer> stack, int data) {
        if(stack.isEmpty()){
            stack.add(data);
            return;
        }
        // Pop Element
        int val= stack.pop();
        pushBottom(stack, data);

        // BackTracking
        stack.push(val);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if(stack.isEmpty()){
            return;
        }

        int val= stack.pop();

        reverseStack(stack);

        pushBottom(stack, val);

        
    }

    public static void main(String[] args) {

        // Ques Reverse a stack

        Stack<Integer> s= new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
        
        
    }
    
}
