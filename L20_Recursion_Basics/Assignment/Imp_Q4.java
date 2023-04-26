package L20_Recursion_Basics.Assignment;

public class Imp_Q4 {

    public static void Bruteforce(String str){
        int count=0;
        int size= str.length();
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            
        }
        System.out.println(count);
    }


    public static void main(String[] args) {

        // Q4 We are given a string S, we need to find the count of all contiguous substrings starting and ending with the same character.

        Bruteforce("abcab");


        // Nahi hua solve ab tak
        
        
    }
    
}
