package L11_Patterns_Part_1;

public class Q3_Half_Pyramid {
    public static void main(String[] args) {
        // Print the following Pattern
        // 1
        // 12
        // 123
        // 1234
        
        int r=4;
        for(int i=1; i<=r; i++){
            // Print Numbers
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
        
        
    }
}
