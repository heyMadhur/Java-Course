package L22_Time_and_Space_Complexity;

public class Q4 {

    public static int floorSqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int i = 1, result = 1;
        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }

    public static void main(String[] args) {

        // Q4 Find the time & space complexity of floor Sqrt function in the following code to calculate square root of a number :
        // Ans Space Complexity= O(1) and Time COmplexity= O(x)

        int x= 11;
        System.out.println(floorSqrt(x));
        
    }
}
