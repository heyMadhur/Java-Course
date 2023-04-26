package L9_Conditional_Statements;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        // Q5 Write a Java program that takes a year from the user and print whether that year is a leap year or not.

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter year: ");
        int year= sc.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap Year");
                }    
                else{
                    System.out.println("Not a Leap Year");
                }
            }
            else{
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("Not a Leap Year");
        }
        
        sc.close();
    }
}
