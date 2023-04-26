package Imp_L27_Stacks;

import java.util.ArrayList;


public class T1_Stack_ArrayList {

    static class Stack{
        static ArrayList <Integer> stack= new ArrayList<>();
        private static int top=-1;

        public static boolean isEmpty() {
            return stack.size()==0;
        }
        public static void push(int data){
            top++;
            stack.add(data);
            System.out.println(data+" pushed!!");
        }
        public static int pop(){
            if(isEmpty()) return -1;
            
            int val= stack.get(top);
            stack.remove(top);
            System.out.println(val+" popped!!");
            top--;
            return val;
        }
        public static int peek() {
            if(isEmpty()) return -1;
            return stack.get(top);
        }        
    }

    public static void main(String[] args) {
        Stack.push(5);
        Stack.push(4);
        Stack.push(3);
        Stack.push(2);
        Stack.push(1);
        Stack.push(0);
        
        System.out.println(Stack.peek());
        
        Stack.pop();
        
        System.out.println(Stack.peek());
        
        Stack.pop();
        
        System.out.println(Stack.peek());
        
    }
    
}
