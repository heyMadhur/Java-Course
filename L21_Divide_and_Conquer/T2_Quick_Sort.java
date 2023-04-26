package L21_Divide_and_Conquer;

public class T2_Quick_Sort {

    public static void quickSort(int [] arr, int low, int high){
        if(low<high){
            int pivot_idx= Partition(arr,low,high);

            quickSort(arr, low, pivot_idx-1);
            quickSort(arr, pivot_idx+1, high);
        }
    }

    public static int Partition(int [] arr, int low, int high){
        int pivot= arr[high];
        int i= low-1;
        for (int j = low; j <  high; j++) {
            if(arr[j]<=pivot){
                i++;
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        i++;
        int temp= arr[i];
        arr[i]= arr[high];
        arr[high]= temp;
        return i;
        
    }

    public static void main(String[] args) {

        int [] arr= {9,8,7,6,5,4,3,2,1};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
