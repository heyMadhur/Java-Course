package L13_Patterns_Part_2_Advance;

public class Q1_Hollow_Rectangle {
    public static void main(String[] args) {
        // Print the following Pattern
        // *****
        // *   *
        // *   *
        // *****

        int r=4, c=5;
        for(int i=1; i<=r; i++){
            // Printing Stars
            for(int k=1; k<=c; k++){
                if(i==1 ||  i==r || k==1 || k==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
        
        
    }
}
