package L21_Divide_and_Conquer.Assignment;

public class Imp_Q3 {

    public static int countInversion_Bruteforce(int [] arr) {
        int inversions=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if( arr[j]<arr[i]) inversions++;
            }
        }
        
        return inversions;
    }

    public static int countInversion(int [] arr, int start, int end){
        // Base Condition
        if(start>=end) return 0;


        int mid= start+ (end-start)/2;
        int inversionCount= countInversion( arr, start ,mid);
        inversionCount+= countInversion(arr, mid+1, end);

        inversionCount+= merge( arr, start, mid, end);
        return inversionCount;
    }

    public static int merge(int [] arr, int start, int mid, int end) {
        int [] temp= new int [end-start+1];
        int idx1= start, idx2= mid+1, i=0;
        int inversionCount=0;

        while(idx1<= mid && idx2<= end){
            if(arr[idx1]<= arr[idx2]){
                temp[i++]=arr[idx1++];
            }
            else{
                inversionCount+= (mid-start);
                temp[i++]= arr[idx2++];
            }
        }
        while(idx1<= mid){
            temp[i++]=arr[idx1++];
        }
        while(idx2<= end){
            temp[i++]= arr[idx2++];
        }

        int j;
        for(i=0, j=start; j< temp.length; i++, j++){
            arr[j]= temp[i];
        }
        return inversionCount;
    }
    

    public static void main(String[] args) {

        // Q3 Given an array of integers. Find theInversion Countin the array. (HARD)
        // Inversion Count: For an array,inversion count indicates how far (or close)
        // the array is from being sorted. If the array is already sorted then the
        // inversion count is 0. If an array is sorted in the reverse order then the
        // inversion count is the maximum. Formally, two elements a[i] and a[j] form an
        // inversion if a[i] > a[j] and i < j

        // Input-1
        int[] arr = { 2, 4, 1, 3, 5 }; // Output must be 3
        System.out.println(countInversion(arr, 0, arr.length-1));

        // Input-2
        int[] arr1 = { 2, 3, 4, 5, 6 }; // Output must be 0
        System.out.println(countInversion(arr1,0 , arr1.length-1));

        // Input-3
        int[] arr2 = { 5, 5, 5 }; // Output must be 0
        System.out.println(countInversion(arr2, 0, arr2.length-1));

    }

}
