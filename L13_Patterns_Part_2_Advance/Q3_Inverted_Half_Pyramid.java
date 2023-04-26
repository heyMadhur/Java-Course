package L13_Patterns_Part_2_Advance;

public class Q3_Inverted_Half_Pyramid {
    public static void main(String[] args) {
        // Print the following Pattern
        // 12345
        // 1234
        // 123
        // 12
        // 1
        
        int r=5;
        for(int i=r; i>=1; i--){
            // For Numbers
            for(int k=1; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
        
        
    }
}
