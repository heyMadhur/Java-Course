package L10_Loops;

public class Q5 {
    public static void main(String[] args) {
        // Q5 What is wrong in the following program?
        // Ans. variable i is in local scope
        
        for(int i=0;i<=5;i++ ){
            System.out.println("i = "+i);
        }
        // System.out.println("i after the loop = "+ i );
        
        
    }
}
