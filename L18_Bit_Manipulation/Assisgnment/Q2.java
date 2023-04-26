package L18_Bit_Manipulation.Assisgnment;

public class Q2 {

    public static void main(String[] args) {

        // Q2 Swap two numbers without using any third variable.
        int a=10;
        int b=20;

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("a= "+a);
        System.out.println("b= "+b);
        
        
    }
    
}
