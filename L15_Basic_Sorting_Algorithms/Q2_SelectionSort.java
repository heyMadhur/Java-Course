package L15_Basic_Sorting_Algorithms;

public class Q2_SelectionSort {

    public static void selectionSortAsc(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int smallest=i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            // Swap
            int temp= arr[i];
            arr[i]= arr[smallest];
            arr[smallest]= temp;
        }
    }

    public static void selectionSortDesc(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int largest=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[largest]<arr[j]){
                    largest=j;
                }
            }
            // Swap
            int temp= arr[largest];
            arr[largest]= arr[i];
            arr[i]= temp;
        }
    }

    public static void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Q2  Use the Insertion sort algorithm to sort an array in DESCENDING order and ASCENDING order 

        int arr[]={3,6,2,1,8,7,4,5,3,1};
        selectionSortAsc(arr);
        System.out.println("Ascending Order-:");
        printArr(arr);

        selectionSortDesc(arr);
        System.out.println("Descending Order-:");
        printArr(arr);
        
    }

    // Another MEthod- Dont know wheter It is insertion Sort or not BUT it brings the smallest element in front one by one.....
    public static void selectionSortAsc_Method2(int [] arr){
        int size= arr.length;
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]>arr[j]){
                    // Swap
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
                System.out.println();
                printArr(arr);
            }
            System.out.println();
        }
    }

    public static void selectionSortDesc_Mehtod2(int [] arr){
        int size=arr.length;
        for(int i=size-1; i>=0; i--){
            for (int j = i-1; j >=0; j--) {
                if(arr[i]>arr[j]){
                    // Swap
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                    
                }
            }
        }
    }



    
}
