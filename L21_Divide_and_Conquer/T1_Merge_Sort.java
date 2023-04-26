package L21_Divide_and_Conquer;

public class T1_Merge_Sort {

    public static void mergeSort(int [] arr, int start, int end){
        if(start>= end) return;

        int mid= start+(end-start)/2;
        // Divide
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        // Conquer
        Merge(arr, start, mid, end);
        
    }

    public static void Merge(int [] arr, int start, int mid, int end){
        int [] tempArr= new int [end-start+1];

        int idx1= start, idx2= mid+1, i=0;

        while(idx1 <= mid && idx2 <= end){
            if(arr[idx1]<arr[idx2]){
                tempArr[i++]= arr[idx1++];
            }
            else{
                tempArr[i++]= arr[idx2++];
            }
        }

        while(idx1 <= mid){
            tempArr[i++]= arr[idx1++];
        }
        while(idx2 <= end){
            tempArr[i++]= arr[idx2++];
        }

        i=0;
        for (int j=start; i < tempArr.length; i++, j++) {
            arr[j]= tempArr[i];
        }
        
    }

    public static void main(String[] args) {

        int [] arr= {21,4,345,465,546456,345,3254,345,456,54};
        mergeSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
