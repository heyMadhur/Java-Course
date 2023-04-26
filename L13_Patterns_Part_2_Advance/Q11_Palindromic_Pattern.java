package L13_Patterns_Part_2_Advance;

public class Q11_Palindromic_Pattern {
    public static void main(String[] args) {
        // Print the following Pattern
        //         1
        //       2 1 2 
        //     3 2 1 2 3 
        //   4 3 2 1 2 3 4 
        // 5 4 3 2 1 2 3 4 5 

        int r=5;

        for(int i=1; i<=r; i++){
            // For Spaces
            for(int j=1; j<=r-i; j++){
                System.out.print("  ");
            }

            // For Numbers Desc
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }

            // For Numbers Asc
            for(int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
