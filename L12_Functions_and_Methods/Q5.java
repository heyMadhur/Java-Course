package L12_Functions_and_Methods;

public class Q5 {

    public static int sumOfDigits(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        
        // Q5 Write a Java method to compute the sum of the digits in an integer.
        System.out.println(sumOfDigits(12345));
    
    }   
}
