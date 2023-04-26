package L11_Patterns_Part_1;

public class Q2_Inverted_Star_Pattern {
    public static void main(String[] args) {
        // Print the following Pattern
        // ****
        // ***
        // **
        // *
        
        int r=4;
        for(int i=r; i>=1; i--){
            // For Stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
        
        
    }
}
