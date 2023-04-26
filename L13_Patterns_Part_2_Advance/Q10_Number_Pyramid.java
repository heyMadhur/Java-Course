package L13_Patterns_Part_2_Advance;

public class Q10_Number_Pyramid {
    public static void main(String[] args) {
        // Print the following Pattern
        //     1
        //    2 2
        //   3 3 3
        //  4 4 4 4
        // 5 5 5 5 5        
        
        int r=5;
        for(int i=1; i<=r; i++){
            // For Spaces
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }

            // For Numbers
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
