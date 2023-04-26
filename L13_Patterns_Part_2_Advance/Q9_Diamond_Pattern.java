package L13_Patterns_Part_2_Advance;

public class Q9_Diamond_Pattern {
    public static void main(String[] args) {
        // Print the following Pattern
        //    *
        //   ***
        //  *****
        // *******
        // *******
        //  *****
        //   ***
        //    *

        int r=4;

        // For Upper Diamond
        for(int i=1; i<=r; i++){
            // For Space
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }

            // For Stars
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // For Lower Diamond
        for(int i=r; i>=1; i--){
            // For Space
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }

            // For Stars
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
        
        
    }
}
