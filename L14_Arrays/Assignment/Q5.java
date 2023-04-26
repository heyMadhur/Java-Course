package L14_Arrays.Assignment;

import java.util.Arrays;
import java.util.HashSet;

public class Q5 {

    public static void printTriplets(int [] arr){
        HashSet <Integer> hSet= new HashSet<Integer>();

        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k]==0 && i!=j && j!=k && k!=i){

                        int [] temp= new int[3];
                        temp[0]=arr[i]; temp[1]=arr[j]; temp[2]=arr[k];
                        Arrays.sort(temp);
                        int num= temp[0]*100+temp[1]*10+temp[2];

                        if(hSet.add(num))
                            System.out.print("["+arr[i]+","+arr[j]+","+arr[k]+"] ");
                    }
                }
                
            }
            
        }
        System.out.println("]");
        
    }


    public static void main(String[] args) {
        // Q5 Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets.
        // Example 1:Input:nums = [-1, 0,  1, 2, -1, -4]   Output:   [ [-1, -1, 2] , [-1, 0, 1] ]

        int nums[]= {-1, 0,  1, 2, -1, -4};
        printTriplets(nums);
        
    }
}
