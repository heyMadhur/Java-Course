package L11_Patterns_Part_1;

public class Q1_Star_Pattern {
    public static void main(String[] args) {
        // Print the following Pattern
        // *
        // **
        // ***
        // ****
        
        int r=4;

        for(int i=0; i<r; i++){
            // For Stars
            for(int j= 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
    }
}
