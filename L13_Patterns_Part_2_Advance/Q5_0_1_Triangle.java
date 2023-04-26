package L13_Patterns_Part_2_Advance;

public class Q5_0_1_Triangle {
    public static void main(String[] args) {
        // Print the following Pattern
        // 1
        // 01
        // 101
        // 0101        
        // 10101
        
        int r=5;
        int num=1;
        for(int i=1; i<=r; i++){
            // For Printing nums
            for(int k=1; k<=i; k++){
                num=((i+k)%2==0)?1:0;
                System.out.print(num);
            }     
            System.out.println();
        }
        
    }
}
