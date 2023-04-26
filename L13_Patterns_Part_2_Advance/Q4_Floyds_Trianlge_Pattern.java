package L13_Patterns_Part_2_Advance;

public class Q4_Floyds_Trianlge_Pattern {
    public static void main(String[] args) {
        // Print the following Pattern
        // 1
        // 2  3
        // 4  5  6
        // 7  8  9  10
        // 11 12 13 14 15

        int r=5;
        int n=1;

        for(int i=1; i<=r; i++){
            // For Nums
            for(int k=1; k<=i; k++){
                System.out.print(n);
                if(n<10){
                    System.out.print("  ");
                }
                else{
                    System.out.print(" ");
                }
                n++;
            }
            System.out.println();
        }
        
    }
}
