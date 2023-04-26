package L22_Time_and_Space_Complexity;

public class Q5 {
    public static void main(String[] args) {

        // Q5 Find the time & space complexity of the following code:
        // Ans Space Complexity= O(1) and Time Complexity= O(n^2)
        
        int n=Integer.MAX_VALUE;
        int a=0;
        for(int i=0; i < n; ++i) {
            for(int j= n; j>i; --j) {
                a=a+i+j;
            }
        }
        
    }
}
