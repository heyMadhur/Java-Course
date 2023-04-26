package L13_Patterns_Part_2_Advance;

public class Q2_Inverted_and_Rotated_Half_Pyramid {
    public static void main(String[] args) {
        // Print the following Pattern
        //    *
        //   **
        //  ***
        // ****        
        
        int r=4;
        for(int i=1; i<=r; i++){
            // For Spaces
            for(int k=1; k<=r-i; k++){
                System.out.print(" ");
            }
            // For Stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
    }
    
}
