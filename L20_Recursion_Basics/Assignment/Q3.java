package L20_Recursion_Basics.Assignment;

public class Q3 {

    public static int strLength(String str) {
        if(str.length()==0) return 0;

        return 1 + strLength(str.substring(1));
        
    }

    public static void main(String[] args) {

        // Q3 Write a program to find Length of a String using Recursion.
        
        System.out.println(strLength("Hello"));
    }
    
}
