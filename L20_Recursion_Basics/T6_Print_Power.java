package L20_Recursion_Basics;

public class T6_Print_Power {

    public static int printPower_BruteForce(int num, int pow) {
        if(pow==1) return num;

        return num * printPower_BruteForce(num, pow-1);
    }

    // Time Complexity= Log n
    public static int printPower_Optimized(int num, int pow) {
        if(pow==1) return num;

        if(pow%2==0)
            return printPower_Optimized(num, pow/2) * printPower_Optimized(num, pow/2);
            
        else
            return num* printPower_Optimized(num, pow/2) * printPower_Optimized(num, pow/2);
            
        
    }
    
    
    public static void main(String[] args) {
        System.out.println("Num=5, Power=5");
        System.out.println("Using Bruteforce= "+printPower_BruteForce(5, 5));
        System.out.println("Using OPtimized Method= "+printPower_Optimized(5, 5));

    }
    
}
