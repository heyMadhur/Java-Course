package L18_Bit_Manipulation;

public class T2_Bit_Operations {

    public static int getBit(int num, int i) {
        int bitmask= 1<<i;
        if((bitmask & num) == 0) return 0;
        else return 1;
    }

    public static int setBit(int num, int i) {
        int bitmask= 1<<i;
        return bitmask | num;
    }

    public static int clearBit(int num, int i) {
        int bitmask= ~(1<<i);
        return bitmask & num;
    }
    public static int updateBit(int num, int i, int bit) {
        // Method-1
        // if(bit==0) return clearBit(num, i);
        // else return setBit(num, i);

        // Method-2
        num=clearBit(num, i);
        int bitMask= bit<<i;
        return num | bitMask;
        
    }

    public static int clearLastBits(int num, int i) {
        int bitmask= (~0)<<i;
        return num & bitmask;
    }

    public static int clearRangeOfBits(int num, int i, int j) {
        int startBitMask= (int) Math.pow(2, i)-1;       // (1<<i)-1
        int endBitMask= (~0)<<(j+1);

        int bitMask=  startBitMask | endBitMask;
        
        return num & bitMask;
    }



    public static void main(String[] args) {
        // Bit Operations 
        // 1. Get Bit
        // 2. Set Bit
        // 3. Clear Bit
        // 4. Update Bit
        // 5. Clear Last i'th Bits
        // 6. Clear Range of Bits
        
        
        // 1. Get Bit
        System.out.println(getBit(10, 1));
        
        // 2. Set Bit
        System.out.println(setBit(10, 2));
        
        // 3. Clear Bit
        System.out.println(clearBit(10, 1));
        
        // 4. Update Bit
        System.out.println(updateBit(10, 2, 1));
        
        // 5. Clear Last i'th Bits
        System.out.println(clearLastBits(15, 2));
        
        // 6. Clear Range of Bits
        System.out.println(clearRangeOfBits(10, 2, 4));

        System.out.println("2^8= "+ (1<<8));
        
        
    }
    
}
