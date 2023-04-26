package L12_Functions_and_Methods;

public class Q2 {

    public static boolean isEven(int num){

        if(num%2==0) return true;
        else return false;
    }
    
    
    public static void main(String[] args) {

        // Q2 Write a method named isEven that accepts an int argument.The method should return true if the argument is even, or false otherwise. Also write ap rogram to test your method.

        System.out.println(isEven(-268));
        
        
    }
}
