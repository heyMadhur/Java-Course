package L14_Arrays.Assignment;

import java.util.HashSet;

public class Q1 {

    public static boolean checkRepeatition(int [] arr){
        HashSet <Integer> hset= new HashSet<>();

        for(int i=0; i<arr.length; i++){
            // System.out.println(i);
            if(!hset.add(arr[i])) return true;
        }
        return false;
        
        
    }


    public static void main(String[] args) {
        // Q1 Given an integer array nums, return true if any value appears at least twice in the array and return false if every element is distinct.

        int arr[]= {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(checkRepeatition(arr));
        
    }
}
