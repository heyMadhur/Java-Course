package L15_Basic_Sorting_Algorithms;

public class Q3_InsertionSort {
    
    public static void insertionSortAsc(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int curr= arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>curr ){
                arr[j+1]=arr[j];
                j--;
                printArr(arr);
            }
            arr[j+1]=curr;
        }
    }

    public static void insertionSortDesc(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int curr= arr[i];
            int j=i-1;

            while(j>=0 && arr[j]<curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= curr;   
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

        // int arr[]={3,6,2,1,8,7,4,5,3,1};
        int arr[]={5,4,1,3,2,6};

        insertionSortAsc(arr);
        System.out.println("Ascending Order-:");
        printArr(arr);

        insertionSortDesc(arr);
        System.out.println("Descending Order-:");
        printArr(arr);
        
    }

    public static void insertionSort_other(int arr[]){
        for(int i=1; i<arr.length; i++){
            for (int j = i-1; j >= 0; j--) {
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
         
                }
                else break;
            }
        }
    }
    
}
