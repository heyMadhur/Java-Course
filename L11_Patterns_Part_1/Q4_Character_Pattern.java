package L11_Patterns_Part_1;

public class Q4_Character_Pattern {
    public static void main(String[] args) {
        // Print the following Pattern
        // A
        // BC
        // DEF
        // GHIJ

        char c= 'A';
        int r=4;
        for(int i=1; i<=r; i++){
            // For Characters
            for(int k=1; k<=i; k++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
        
        
    }
}
