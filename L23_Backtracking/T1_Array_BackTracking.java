package L23_Backtracking;

public class T1_Array_BackTracking {
    
    public static void arrBackTrack(int [] arr, int idx){
        // Base Case
        if(idx==arr.length){ 
            printArr(arr);
            return;
        }

        arr[idx]=idx+1;
        arrBackTrack(arr, idx+1);       // Function Calling Step
        arr[idx]-=2;                    // BackTracking Step

    }

    public static void printArr(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr= new int[5];
        
        arrBackTrack(arr, 0);
        printArr(arr);


        
    }
}
