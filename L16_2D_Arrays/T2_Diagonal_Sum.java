package L16_2D_Arrays;

public class T2_Diagonal_Sum {
    
    public static void diagonalSum_Bruteforce(int [][] arr){
        int size=arr.length;
        int sum=0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==j) sum+=arr[i][j];
                else if(i+j==size-1) sum+=arr[i][j];
            }
        }
        System.out.println("Diagonal Sum= "+sum);
        
    }

    public static int diagonalSum(int [][] arr){
        int size=arr.length;
        int sum=0;
        for (int i = 0; i < size; i++) {
            sum+=arr[i][i];
            
            if(size%2!=0 && i==size/2) continue;
            sum+=arr[i][size-i-1];
        }
        return sum;
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

        int [] [] matrix= new int [4] [4];
        fillMatrix(matrix);
        diagonalSum_Bruteforce(matrix);
        System.out.println("Diagonal Sum= "+diagonalSum(matrix));
        
    }
    
}
