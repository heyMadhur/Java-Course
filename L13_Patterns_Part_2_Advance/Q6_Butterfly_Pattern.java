package L13_Patterns_Part_2_Advance;

public class Q6_Butterfly_Pattern {
    public static void main(String[] args) {
        // Print the following Pattern
        // *      *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *
        int r=4;
        // For Upper Half
        for(int i=1; i<=r; i++){
            // For 1st Upper Half Stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }     
            // For Spaces
            for(int k=1; k<=r-i; k++){
                System.out.print("  ");
            }           
            // For 2nd Upper Half Stars 
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // For Lower Half
        for(int i=r; i>=1; i--){
            // For 1st Lower Half Stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            
            // For Spaces
            for(int k=1; k<=r-i; k++){
                System.out.print("  ");
            }
            
            // For 2nd Lower Half Stars 
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
