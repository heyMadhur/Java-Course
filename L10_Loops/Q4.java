package L10_Loops;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Q4 Write a program to print the multiplication table of a number N, entered by the user.

        Scanner sc= new Scanner(System.in);

        int num= sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(num+" * "+i+" = "+ (num*i));
        }
        
        
        sc.close();
    }
}
