package L17_Strings;

public class T1_Check_Palindrome {

    public static void checkPalindrome(String str) {
        int size= str.length();
        for (int i = 0; i < size/2; i++) {
            if(str.charAt(i)!=str.charAt(size-1-i)){
                System.out.println("False");
                return;
            }    
        }
        System.out.println("True");
    }

    public static void main(String[] args) {

        String str="madam";
        checkPalindrome(str);
        
    }
    
}
