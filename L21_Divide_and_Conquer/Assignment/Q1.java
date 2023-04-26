package L21_Divide_and_Conquer.Assignment;

public class Q1 {

    public static void mergeSort(String [] arr, int start, int end) {
        if(start>=end) return;

        int mid= start+(end-start)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        Merge(arr, start, mid, end);
        
    }
    
    public static void Merge(String [] arr, int start, int mid, int end) {
        String [] mergedArr= new String [end-start+1];
        int idx1= start, idx2= mid+1, i=0;

        while(idx1<=mid && idx2<=end){
            if(arr[idx1].compareTo(arr[idx2])<=0){
                mergedArr[i++]= arr[idx1++];
            }
            else{
                mergedArr[i++]= arr[idx2++];
            }
        }
        while(idx1<=mid){
            mergedArr[i++]= arr[idx1++];
        }
        while(idx2<=end){
            mergedArr[i++]= arr[idx2++];
        }

        int j;
        for (j = start, i=0; i < mergedArr.length; j++, i++) {
            arr[j]= mergedArr[i];
        }
        
    }

    public static void printArr(String [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Q1 Apply Merge sort to sort an array of Strings.(Assume that all the characters in all the Strings are in lowercase). (EASY)

        String [] arr= { "sun", "earth", "mars", "mercury"};
        // System.out.println(arr.length);
        mergeSort(arr, 0, arr.length-1);

        printArr(arr);

        // System.out.println("sun".compareTo("earth"));
        
    }
    
}
