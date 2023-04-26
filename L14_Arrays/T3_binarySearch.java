package L14_Arrays;

public class T3_binarySearch {
    public static int binarySearch(int [] arr, int key) {
        int start=0, end= arr.length-1;
        while(start<=end){
            int mid= start+end-start/2;
            if(key==arr[mid]) return mid;
            else if(key>arr[mid]) start= mid+1;
            else end=mid-1;
        }
        return -1;
        
    }

    public static void main(String[] args) {

        int arr[]= {21,43,56,87,90};
       System.out.println(binarySearch(arr, 67));
       System.out.println(binarySearch(arr, 56));


        
    }
    
}
