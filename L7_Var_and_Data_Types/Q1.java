package L7_Var_and_Data_Types;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        // Q1: In a program, input 3 numbers: A, B and C.You have to output the average of these 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N)
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Num1: ");
        int a= sc.nextInt();
        System.out.print("Enter Num2: ");
        int b= sc.nextInt();
        System.out.print("Enter Num3: ");
        int c= sc.nextInt();

        int avg= (a+b+c)/3;

        System.out.println("Your average is "+ avg);

        sc.close();

        
    }
}
