package L18_Bit_Manipulation;

public class T3_Odd_or_Even {

    public static int getBit(int num,int i){
        int bitmask= 1<<i;
        
        return bitmask & num;

    }

    public static void checkOddEven(int num) {
        if(getBit(num, 0)==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        
    }

    public static void main(String[] args) {
        checkOddEven(11);
        checkOddEven(45);
        checkOddEven(567);
        checkOddEven(364872);
        
    }
    
}
