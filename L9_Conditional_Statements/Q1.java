package L9_Conditional_Statements;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Q1 Write a Java program to get a number from the user and print whether it is positive or negative.

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        float num= sc.nextFloat();

        if(num==0) System.out.println("Neither Positive Nor Negative");

        else{
            String type= (num>0) ? "Positive" : "Negative";
            System.out.println(type);
        }
        
        sc.close();
    }
}
