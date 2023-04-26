package L16_2D_Arrays.Assignment;

public class Q2 {

    public static int sumOfSecRow(int [][] arr) {
        int sum=0;
        for (int i = 0; i < arr[0].length; i++) {
            sum+= arr[1][i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        // Q2 Print out the sum of the numbers in the second row of the “nums” array
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };

        System.out.println("Sum of 2nd Row elements= "+sumOfSecRow(nums));
        
    }
    
}
