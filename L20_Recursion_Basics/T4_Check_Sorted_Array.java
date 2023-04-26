package L20_Recursion_Basics;

public class T4_Check_Sorted_Array {

    public static boolean checkSortedArr(int [] arr, int idx) {
        if(idx==arr.length-1) return true;

        if(arr[idx]<arr[idx+1]) return checkSortedArr(arr, idx+1);
        else return false;
        
    }

    public static void main(String[] args) {

        int [] arr={12,34,45,67,78,89,90};
        System.out.println(checkSortedArr(arr, 0));
        
    }
    
}
