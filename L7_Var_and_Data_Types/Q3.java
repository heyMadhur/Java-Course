package L7_Var_and_Data_Types;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        // Q1 Enter cost of 3 items from the user(using float datatype)-a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Cosat of Pencil: ");
        float pencil= sc.nextFloat(); 
        System.out.print("Enter Cosat of Pen: ");
        float pen= sc.nextFloat();
        System.out.print("Enter Cosat of Eraser: ");
        float eraser= sc.nextFloat();

        float totalCost= pencil+pen+eraser;
        float bill=totalCost + (totalCost*18/100);

        System.out.println("Bill (Before GST)= Rs."+ totalCost);
        System.out.println("Bill (After GST)= Rs."+ bill);

        sc.close();
    }
}
