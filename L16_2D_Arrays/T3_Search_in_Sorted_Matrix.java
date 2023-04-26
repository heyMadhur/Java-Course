package L16_2D_Arrays;

public class T3_Search_in_Sorted_Matrix {

    public static void searchMatrix_Bruteforce(int [][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(key==arr[i][j]){
                    System.out.println("Yes, Key found at ("+i+","+j+") using BruteForce");
                    return;
                }
            }
        }
        System.out.println("Key Not Found");
    }

    public static void searchSortedMatrix_StaircaseSearch(int [][] arr, int key){
        int i=arr.length-1, j=0;
        while(i>=0 && j<arr[0].length){
            if(arr[i][j]==key){
                System.out.println("Yes, Key found at ("+i+","+j+") using Optimized Code");
                return;
            }
            else if(arr[i][j]<key) j++;
            else if(arr[i][j]>key) i--;
        }
        System.out.println("Key Not Found");
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

        searchMatrix_Bruteforce(matrix, 0);
        searchSortedMatrix_StaircaseSearch(matrix, 0);
     
        System.out.println(matrix[0][0]);
    }
    
}
