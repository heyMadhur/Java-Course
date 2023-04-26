package L20_Recursion_Basics;

public class Imp_T10_Binary_Strings_Problem {

    public static void printBinaryStrings(int size, int lastPlace, String str) {
        // Base Case
        if(size==0){
            System.out.print(str+" ");
            return;
        }
                
        // If last Place is 0
        if(lastPlace==0){
            // Then Next Place can be 0
            printBinaryStrings(size-1, 0, str+"0");
            
            // Or Next Place can be 1
            printBinaryStrings(size-1, 1, str+"1");
        }

        // If first place is 1
        if(lastPlace==1){
            // Then Next Place can be only 0
            printBinaryStrings(size-1, 0, str+"0");
        }
    }

    
    public static void main(String[] args) {
        // Binary Strings Problem
        // Print all the binary strings of size N iwthout consecutive ones.

        printBinaryStrings(2, 0, "");
        
    }
    
}
