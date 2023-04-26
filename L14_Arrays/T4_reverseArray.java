package L14_Arrays;

public class T4_reverseArray {

    public static void reverseArr(int [] arr) {
        int size= arr.length;
        for(int i=0; i<=size/2; i++){
            // Swapping
            arr[i]= arr[i]+arr[size-i-1];
            arr[size-i-1]= arr[i]-arr[size-i-1];
            arr[i]= arr[i]-arr[size-i-1];
        }
    }


    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6,7,8,9,0};
        reverseArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
