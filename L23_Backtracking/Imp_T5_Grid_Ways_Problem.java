package L23_Backtracking;

public class Imp_T5_Grid_Ways_Problem {
    
    public static int count=0;

    public static void gridWays(char [] [] arr, int row, int col) {
        // Base Condition
        if(row==arr.length-1 && col==arr[0].length-1){
            count++;
            return;
        }
        // Right
        if(col<arr[0].length){
            gridWays(arr, row, col+1);
        }
        // Down
        if(row<arr.length){
            gridWays(arr, row+1, col);
        }
    }
    
    public static void main(String[] args) {

        // Question Grid Ways-:
        // Find the number of ways to reach from (0,0) to (n-1, m-1) in a NxM Grid.
        // Allowed Moves- right or down

        char [][] arr= new char [3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = '.';
            }
        }

        gridWays(arr, 0, 0);
        System.out.println(count);

    }
}
