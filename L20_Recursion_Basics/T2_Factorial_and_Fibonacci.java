package L20_Recursion_Basics;

public class T2_Factorial_and_Fibonacci {
    public static int Factorial(int num) {
        if(num==1) return 1;

        return num*Factorial(num-1);
    }

    public static void printFibonacci(int a, int b, int num){
        if(num==0) return;

        System.out.print(a+" ");

        printFibonacci(b, a+b, num-1);
        
    }

    public static void main(String[] args) {

        System.out.println("Factorial of 5= "+Factorial(5));
        System.out.println("Fibonacci till 8 terms-:");
        printFibonacci(0,1,8);
        
    }
    
    
}
