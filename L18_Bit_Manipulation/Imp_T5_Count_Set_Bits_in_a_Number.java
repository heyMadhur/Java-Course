package L18_Bit_Manipulation;

public class Imp_T5_Count_Set_Bits_in_a_Number {

    public static int countSetBits(int num) {
        int count=0;
        while(num>0){
            if((num&1)==1) count++;
            num= num>>1;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countSetBits(7));
        
        
    }
    
}
