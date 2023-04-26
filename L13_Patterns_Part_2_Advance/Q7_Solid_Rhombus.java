package L13_Patterns_Part_2_Advance;

public class Q7_Solid_Rhombus {
    public static void main(String[] args) {
        // Print the following Pattern
        //    *****
        //   *****
        //  *****
        // *****
        
        int r=5;

        for(int i=1; i<=r; i++){
            // For Spaces
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            // For Stars
            for(int j=1; j<=r; j++){
                System.out.print("*");
            } 
            System.out.println();
        }
        
        
    }
    
}
