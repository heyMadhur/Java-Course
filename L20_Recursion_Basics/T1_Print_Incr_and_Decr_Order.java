package L20_Recursion_Basics;

public class T1_Print_Incr_and_Decr_Order {

    public static void printIncreasing(int num) {
        // Base Condition
        if(num==0) return;

        printIncreasing(num-1);
        System.out.println(num);
    }

    public static void printDecreasing(int num) {
        // Base Condition
        if(num==0) return;
        
        System.out.println(num);
        printDecreasing(num-1);
    }

    public static void main(String[] args) {

        // Print numbers from 1 to n(Increasing Order) and n to 1(Decreasing Order)
        System.out.println("Increasing Order-:");
        printIncreasing(5);
        System.out.println("Decreasing Order-:");
        printDecreasing(5);
    }
    
}
