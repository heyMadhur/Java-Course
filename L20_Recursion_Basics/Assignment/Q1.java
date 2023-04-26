package L20_Recursion_Basics.Assignment;

public class Q1 {

    public static void findAllOccurences(int [] arr, int idx, int key){
        // Base Condition
        if(idx== arr.length) return;

        if(arr[idx]==key) System.out.print(idx+" ");

        findAllOccurences(arr, idx+1, key);

        
    }

    public static void main(String[] args) {

        // Q1 For a given integer array of size N. You have to find all the occurrences(indices)of a given element(Key) and print them. Use a recursive function to solve this problem.
        
        int [] arr={3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key=2;
        findAllOccurences(arr, 0, key);
        
    }
    
}
