package L18_Bit_Manipulation;

public class T4_Check_for_power_of_2 {

    public static boolean checkPowOf2_BruteForce(int num) {
        int tempNum=1;
        int i=1;
        while(tempNum<=num){
            // Check Whether numbers are equal or not
            if(tempNum==num) return true;
            tempNum=1<<i++;
        }
        return false;
    }

    public static boolean checkPowOf2(int num) {
        // if((num & num-1)==0) return true;
        // else return false;

        return (num & num-1)==0;

    }

    public static void main(String[] args) {
        System.out.println("Using BruteForce-:");
        System.out.println(checkPowOf2_BruteForce(64));
        System.out.println(checkPowOf2_BruteForce(60));
        System.out.println(checkPowOf2_BruteForce(256));
        System.out.println(checkPowOf2_BruteForce(250));

        System.out.println("Using Optimized Method-:");
        System.out.println(checkPowOf2(64));
        System.out.println(checkPowOf2(60));
        System.out.println(checkPowOf2(256));
        System.out.println(checkPowOf2(250));
    }
    
    
}
