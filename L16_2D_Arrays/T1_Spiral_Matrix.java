package L16_2D_Arrays;

public class T1_Spiral_Matrix {

    public static void printSpiral(int [][] arr) {
        int left= 0, right= arr[0].length-1;
        int top= 0, bottom=arr.length-1;
        // System.out.println(right+" "+bottom);

        int i=0, j=0;
        while(left<=right && top<=bottom){
            i= top;

            // Left to Right
            for (j = left; j <= right; j++) {
                System.out.print(arr[top][j]+" ");
            }
            top++;
            
            // Top to Bottom
            for (i = top; i <= bottom; i++) {
                System.out.print(arr[i][right]+" ");
            }
            right--;
            
            // Right to Left
            for (j = right; j >= left; j--) {
                System.out.print(arr[bottom][j]+" ");
            }
            bottom--;
            
            // Bottom to Top
            for (i = bottom; i >= top; i--) {
                System.out.print(arr[i][left]+" ");
            }
            left++;

        }
        
    }

    public static void fillMatrix(int [] [] matrix){
        int counter=1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=counter++;
            }
        }
    }
    
    public static void main(String[] args) {

        int [] [] matrix= new int [5] [5];
        fillMatrix(matrix);
        printSpiral(matrix);
        
    }
    
}
