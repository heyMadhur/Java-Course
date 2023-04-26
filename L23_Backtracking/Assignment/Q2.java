package L23_Backtracking.Assignment;

public class Q2 {

    public static String [] map= {"", "","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public static void printKeypadCombinations(String num, String ans) {
        if(0==num.length()){
            System.out.println(ans);
            return;
        }

        char digit= num.charAt(0);
        num=num.substring(1);
        String str= map[digit-'0'];
        for (int i = 0; i < str.length(); i++) {
            char c= str.charAt(i);

            printKeypadCombinations(num, ans+c);

            
        }
    }


    public static void main(String[] args) {

        // Q2 Keypad Combinations
        // Given a string containing digits from 2-9 inclusive, print all possible letter combinations that the number could represent. You can print the answer in any order.
        // A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
        
        String digit= "23";
        printKeypadCombinations(digit, "");

    }
    
}
