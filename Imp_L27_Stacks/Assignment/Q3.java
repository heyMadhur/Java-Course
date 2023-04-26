package Imp_L27_Stacks.Assignment;

import java.util.Stack;

public class Q3{

    public static void decodeString(String str){
        String ans="";
        Stack<Character> stack= new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c= str.charAt(i);
            if(c!=']') stack.push(c);
            else{
                while(stack.peek()!='['){
                    ans= stack.pop()+ans;
                }
                stack.pop();            // to remove ] bracket from stack
                int times= stack.pop()-'0';
                ans=ans.repeat(times);
            }
        }
        System.out.println(ans); 
    }
    
    public static void main(String[] args) {

        // Q3 Decode a String
        // We have an encoded strings and the task is to decode it. The pattern in which the strings are encoded is as follows.

        String str= "2[cv]";        // Output= cvcv
        String str2= "3[b2[ca]]";     // Output= bvvbvvbvv

        decodeString(str);
        decodeString(str2);
        
    }
}