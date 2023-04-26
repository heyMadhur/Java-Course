package L7_Var_and_Data_Types;

public class Q4 {
    public static void main(String[] args) {
        // Q4 What will be the type of result in thefollowing Java code?
        // Ans. double

        byte b=4;
        char c= 'a';
        short s= 512;
        int i= 1000;
        float f= 3.14f;
        double d= 99.9954;

        double result= (f*b) + (i%c) - (d*s);

        System.out.println(result);
        
        
        
    }
}
