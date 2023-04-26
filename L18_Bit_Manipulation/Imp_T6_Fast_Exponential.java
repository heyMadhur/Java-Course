package L18_Bit_Manipulation;

public class Imp_T6_Fast_Exponential {

    public static int fastExponential(int n, int pow) {
        int ans=1;

        // while(pow>0){
        //     int bit= 1 & pow;
        //     ans= (bit==1) ? ans*n : ans;
        //     n=n*n;
        //     pow= pow>>1;
        // }

        while(pow>0){
            if((1 & pow)==1) ans*=n;
            n*=n;       // n=n*n
            pow>>=1;    // pow= pow>>1
        }
        
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(fastExponential(5, 5));
        // System.out.println(Math.pow(5, 13));
        
    }
    
}
