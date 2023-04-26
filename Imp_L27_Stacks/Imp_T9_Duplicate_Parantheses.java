package Imp_L27_Stacks;

import java.util.Stack;

public class Imp_T9_Duplicate_Parantheses {
    
    public static boolean checkDuplicateParantheses(String str) {

        Stack<Character> stack= new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if(ch!=')') stack.push(ch);
            else{
                int count=0;
                while(stack.pop()!='('){
                    count++;
                }
                if(count==0) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(checkDuplicateParantheses("(((a+(b)))+(c+d))"));
        System.out.println(checkDuplicateParantheses("((((a)+(b))+c+d))"));
        System.out.println(checkDuplicateParantheses("((a+b)+(c+d))"));
        System.out.println(checkDuplicateParantheses("(((a+b))+c)"));
        System.out.println(checkDuplicateParantheses("((a+b)+c)"));
        
    }
}
