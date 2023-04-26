package L15_Basic_Sorting_Algorithms;

public class Q1_BubbleSort {
    
    public static void bubbleSortAsc(int [] arr){
        int size= arr.length;
        for(int i=0; i<size; i++){
            for(int j=0; j<size-i-1; j++){
                if(arr[j]>arr[j+1]){
                    // Swap
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }

    public static void bubbleSortDesc(int [] arr){
        int size=arr.length;
        for(int i=0; i<size; i++){
            for (int j = 0; j <size-i-1; j++) {
                if(arr[j]<arr[j+1]){
                    // Swap
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }
        }
    }

    public static void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Q1  Use the Bubble sort algorithm to sort an array in DESCENDING order and ASCENDING order 

        int arr[]={3,6,2,1,8,7,4,5,3,1};
        // int arr[]={1,2,3,4,5,6,7,8,9,0};
        bubbleSortAsc(arr);
        System.out.println("Ascending Order-:");
        printArr(arr);

        bubbleSortDesc(arr);
        System.out.println("Descending Order-:");
        printArr(arr);

        
        
    }
    
}
