package L10_Loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Q3 Write a program to find the factorial of any number entered by the user.

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        int fac=1;

        for(int i=1; i<=num; i++){
            fac*=i;
        }
        System.out.println("Factorial= "+ fac);
        
        sc.close();
        
    }
}
