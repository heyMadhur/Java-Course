package L20_Recursion_Basics;

public class Imp_T7_Tiling_Problem {

    public static int tileChoice(int len) {
        if(len==0) return 1;
        if(len==1) return 1;

        // Choose to be verticle
        int choice1= tileChoice(len-1);

        // Choose to be Horizontal
        int choice2= tileChoice(len-2);
        
        return choice1+choice2;
        
    }

    public static void main(String[] args) {
        // Tiling Problem
        // Given a "2 X n" floor and tilesd of size "2 X 1", count the number of ways to tile the given floor using the 2 X 1 tiles.
        // A tile can either be placed horizonatally or vertically

        System.out.println(tileChoice(4));
        
    }    
}
