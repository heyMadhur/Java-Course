package L20_Recursion_Basics.Assignment;



public class Q2 {

    public static String [] arr= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public static void printNumName(int num) {
        // Base Condition
        if(num==0) return;

        int currNum= num%10;

        printNumName(num/10);
        System.out.print(arr[currNum]+" ");
        
    }
    
    public static void main(String[] args) {

        // Q2 You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  Use a recursive function to solve this problem.
        // NOTE- The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0.
        
        printNumName(1947);
    }
    
}
