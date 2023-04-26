package L16_2D_Arrays.Assignment;

public class Q1 {

    public static int countKeyInArr(int [][] arr, int key) {
        int freq=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(key==arr[i][j]) freq++;
            }            
        }
        return freq;
    }

    
    public static void main(String[] args) {
        // Q1 Print the number of 7’s that are in the 2d array
        int[][] arr = { {4,7,8},{8,8,7} };

        System.out.println("Key repeated= "+countKeyInArr(arr, 7));
        
        
    }
}
