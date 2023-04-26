package L19_OOPS.Assignment;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        // Q1 Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user.

        Scanner sc= new Scanner(System.in);

        System.out.println("For First Complex No.");
        
        Complex c1= new Complex();
        System.out.print("Enter Real Part= ");
        c1.realPart= sc.nextInt();
        System.out.print("Enter Imaginary Part= ");
        c1.imaginaryPart= sc.nextInt();
        
        System.out.println("For Second Complex No.");
        
        Complex c2= new Complex();
        System.out.print("Enter Real Part= ");
        c2.realPart= sc.nextInt();
        System.out.print("Enter Imaginary Part= ");
        c2.imaginaryPart= sc.nextInt();
        

        while(true){

            System.out.print("\nComplex Numbers= ");
            c1.printComplex();
            System.out.print(" and ");
            c2.printComplex();

            System.out.println("\nOperations Available-:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");
            System.out.println("Enter your Choice: ");
            int choice= sc.nextInt();

            if(choice==1) c1.sumComplex(c1, c2);
            else if(choice==2) c1.differenceComplex(c1, c2);
            else if(choice==3) c1.multiplyComplex(c1, c2);
            else break;

        }
        sc.close();
    }
}

class Complex{
    protected int realPart;
    protected int imaginaryPart;

    public void printComplex(){
        if(imaginaryPart>0)
        System.out.print(realPart+" + "+imaginaryPart+"i");
        else 
        System.out.print(realPart+imaginaryPart+"i");
    }

    public void sumComplex(Complex c1, Complex c2){
        int sumRealPart= c1.realPart + c2.realPart;
        int sumImaginaryPart= c1.imaginaryPart + c2.imaginaryPart;

        System.out.println("Sum= "+sumRealPart+" + "+sumImaginaryPart+"i");
    }

    public void differenceComplex(Complex c1, Complex c2){
        int sumRealPart= c1.realPart - c2.realPart;
        int sumImaginaryPart= c1.imaginaryPart - c2.imaginaryPart;
        
        if(sumImaginaryPart>0)
        System.out.println("Difference= "+sumRealPart+" + "+sumImaginaryPart+"i");
        else 
        System.out.println("Difference= "+sumRealPart+sumImaginaryPart+"i");
    }
    
    public void multiplyComplex( Complex c1, Complex c2){
        int sumRealPart= (c1.realPart * c2.realPart)-(c1.imaginaryPart * c2.imaginaryPart);
        int sumImaginaryPart= (c1.realPart * c2.imaginaryPart) + (c1.imaginaryPart * c1.realPart);
        if(sumImaginaryPart>0)
        System.out.println("Product= "+sumRealPart+" + "+sumImaginaryPart+"i");
        else 
        System.out.println("Product= "+sumRealPart+sumImaginaryPart+"i");
        
    }
    
}
