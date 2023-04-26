package L22_Time_and_Space_Complexity;

public class Q1 {
    public static void main(String[] args) {

        // Q1 Find the Time Complexity of the following:
        // Ans O(n*logn)

        int n=Integer.MAX_VALUE;
        int i,j,k= 0;
        for(i= n /2; i<= n; i++) {
            for(j=2; j<= n; j=j*2) {
                k=k+ n /2;
            }
        }
        
        
    }
}
