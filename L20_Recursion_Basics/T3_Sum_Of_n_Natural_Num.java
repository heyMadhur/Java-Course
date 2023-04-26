package L20_Recursion_Basics;

public class T3_Sum_Of_n_Natural_Num {

    public static int sumOfNaturalNum(int n) {
        // Base Condition
        if(n==1) return 1;

        return n+sumOfNaturalNum(n-1);
        
    }

    public static void main(String[] args) {
        System.out.println("Sum of Natural no till 10: "+sumOfNaturalNum(10));
    }
    
}
