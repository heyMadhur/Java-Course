package L12_Functions_and_Methods;

public class Q4 {
    public static void main(String[] args) {

        // Q4 Search about(Google) & use the following methods of the Math class in Java:
        // a. Math.min( )
        // b. Math.max( )
        // c. Math.sqrt( )
        // d. Math.pow( )
        // e. Math.avg( )- Not Available
        // f. Math.abs( )
        
        int num1= 100;
        int num2= 200;
        int pow=4;
        int negNum= -1000;

        int min= Math.min(num1, num2);
        int max= Math.max(num1, num2);
        int sqrt= (int) Math.sqrt(num1);
        int powNum=(int) Math.pow(sqrt, pow);
        int abs= Math.abs(negNum);

        System.out.println("Min= "+min);
        System.out.println("Max= "+max);
        System.out.println("Square root of 100= "+sqrt);
        System.out.println("10 raise to power 4= "+powNum);
        System.out.println("Absolute of -1000= "+abs);

        
    }
}
