package L10_Loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //  Q2 Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        Scanner sc= new Scanner(System.in);

        System.out.print("How many integers you want to enter: ");
        int times= sc.nextInt();
        int sumEven=0, sumOdd=0;
        for(int i=0; i<times;i++){
            System.out.print("Enter num "+(i+1)+": ");
            int num= sc.nextInt();
            if(num%2==0){
                sumEven+=num;
            }
            else{
                sumOdd+=num;
            }
        }
        System.out.println("Sum of all even Integers Entered is: "+sumEven);
        System.out.println("Sum of all Odd Integers Entered is: "+sumOdd);

        
        sc.close();
    }
}
