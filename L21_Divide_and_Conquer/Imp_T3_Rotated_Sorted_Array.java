package L21_Divide_and_Conquer;

public class Imp_T3_Rotated_Sorted_Array {

    public static int advanceBinarySearch(int [] arr, int key){
        int start=0, end= arr.length-1;

        while(start<=end){
            int mid= start+(end-start)/2;
            
            if(key==arr[mid]) return mid;

            else if( arr[start]<arr[mid]){
                if(key>= arr[start] && key < arr[mid]){
                    end= mid-1;
                }
                else{
                    start= mid+1;
                }
            }
            else{
                if(key>arr[mid] && key<=arr[end]){
                    start= mid+1;
                }
                else{
                    end= mid-1;
                }
            }
            
        }


        return -1;
    }

    
    public static void main(String[] args) {

        // Search in Rotated Sorted Array
        // For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2]

        int [] arr= {4,  5, 6, 7, 0, 1, 2};
        System.out.println(advanceBinarySearch(arr, 0));
        
    }
    
}
