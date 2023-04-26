package L16_2D_Arrays.Assignment;

public class Q3 {

    public static int[][] transposeMatrix( int [][] arr) {
        int row= arr.length;
        int col= arr[0].length;
        int [][] transpose= new int [col] [row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i]= arr[i][j];
            }
        }
        return transpose;
    }

    public static void print2DArr(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // Q3 Write a program to Find Transpose of a Matrix.
        // What is Transpose? Transpose of a matrix is the process of swapping the rows to columns

        // int[][] arr = { {1,4,9},{11,4,3},{2,2,3} };
        int[][] arr = { {4,7,8},{8,8,7} };
        System.out.println("Before Transpose-:");
        print2DArr(arr);
        
        int [][] transpose= transposeMatrix(arr);
        System.out.println("After Transpose-:");
        print2DArr(transpose);
        
    }
}