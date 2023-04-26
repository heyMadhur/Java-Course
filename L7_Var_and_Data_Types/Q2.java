package L7_Var_and_Data_Types;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        // Q2 In a program, input the side of a square. You have to output the area of the square. (Hint : area of a square is (side x side))

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Side of square: ");
        double side= sc.nextFloat();

        double area= side*side;

        System.out.println("Area= "+area);

        sc.close();
    }
    
}
