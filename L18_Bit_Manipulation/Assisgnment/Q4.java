package L18_Bit_Manipulation.Assisgnment;

public class Q4 {

    public static void printLowerCase(String str) {
        
        for (int i = 0; i < str.length(); i++) {
            System.out.print((char) (str.charAt(i) | ' '));
        }
    }


    public static void main(String[] args) {
        
        // Q4 Convert uppercase characters to lowercase using bits.

        printLowerCase("HVK BROO!!");
        
    }
    
}
