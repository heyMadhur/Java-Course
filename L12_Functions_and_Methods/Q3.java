package L12_Functions_and_Methods;

public class Q3 {

    public static boolean isPalindrome(int num){
        int origNum= num;
        int revNum=0;
        int pow=-1;
        while(num>0){
            pow++;
            num/=10;
        }
        num=origNum;
        while(num>0){
            int lastDigit= num%10;
            revNum+= lastDigit*Math.pow(10,pow);
            pow--;
            num/=10;
        }
        if(origNum==revNum) return true;
        else return false;
    }
    
    
    public static void main(String[] args) {

        // Q3 Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not)
        // A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a palindrome  because the reverse of 321 is 123, which is not equal to 321.
        

        System.out.println(isPalindrome(121));

        
    }
    
}
