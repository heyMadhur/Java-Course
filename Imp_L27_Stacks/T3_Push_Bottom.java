package Imp_L27_Stacks;

import java.util.Stack;

public class T3_Push_Bottom {

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


    public static void main(String[] args) {
        // Ques Push at the bottom of the Stack

        Stack<Integer> stack= new Stack<>();
        // stack.push(5);
        // stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);
        System.out.println(stack);
        pushBottom(stack, 4);
        System.out.println(stack);


        
        
        
    }
    
}
