package L15_Basic_Sorting_Algorithms;

public class Q4_CountingSort {

    public static int maxInArr(int [] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }

    public static void countingSortAsc(int [] arr){
        int max= maxInArr(arr);

        // Counting No. of Frequencies
        int [] freq= new int [max+1];
        for (int i = 0; i < arr.length; i++) {
            int ele= arr[i];
            freq[ele]++;
        }
        
        int idx=0;
        // Adding elements in Orginal Array
        for (int i = 0; i < freq.length; i++) {
            while(freq[i]>0){
                arr[idx++]=i;
                freq[i]--;
            }
        }    
    }
    public static void countingSortDesc(int [] arr){
        int max= maxInArr(arr);

        // Counting No. of Frequencies
        int [] freq= new int [max+1];
        for (int i = 0; i < arr.length; i++) {
            int ele= arr[i];
            freq[ele]++;
        }
        
        int idx=0;
        // Adding elements in Orginal Array
        for (int i = freq.length-1; i >=0; i--) {
            while(freq[i]>0){
                arr[idx++]=i;
                freq[i]--;
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

        int arr[]={3,6,2,1,8,7,4,5,3,1};        
        countingSortAsc(arr);
        System.out.println("Ascending Order-:");
        printArr(arr);
        
        countingSortDesc(arr);
        System.out.println("Descending Order-:");
        printArr(arr);
        
    }
    
}
