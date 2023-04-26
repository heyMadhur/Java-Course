package L21_Divide_and_Conquer.Assignment;

import java.util.Arrays;

public class Imp_Q2 {

    // public static int majorityElement(int[] arr) {
    //     // Find Max
    //     int max = Integer.MIN_VALUE;
    //     for (int i = 0; i < arr.length; i++)
    //         max = Math.max(max, arr[i]);

    //     int[] freq = new int[max + 1];
    //     for (int i = 0; i < arr.length; i++)
    //         freq[arr[i]]++;

    //     max = 0;
    //     for (int i = 0; i < freq.length; i++)
    //         if (freq[i] > (arr.length / 2))
    //             if (freq[i] > freq[max])
    //                 max = i;

    //     return max;
    // }

    public static int majorityElement(int[] arr) {
        Arrays.sort(arr);
        int max=arr[0], maxFreq=1, freq=1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                freq++;
                // System.out.println("for "+arr[i]+", freq= "+freq);
            }
            else{
                if( freq> maxFreq){
                    maxFreq= freq;
                    max= arr[i];
                }
                freq=1;
                // System.out.println("for "+arr[i]+", freq= "+freq);
            }
        }
        if( freq> maxFreq){
            maxFreq= freq;
            max= arr[arr.length-1];
        }

        return max;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        // Q2 Given an array nums of size n, return the majority element. (MEDIUM)
        // The majority element is the element that appears more than [n/2] times.You
        // may assume that the majority element always exists in the array.

        // Input-1
        int[] arr = { 3, 2, 3 }; // Output must be 3
        System.out.println(majorityElement(arr));

        // Input-2
        int[] arr1 = { 2, 2, 1, 1, 1, 2, 2 }; // Output must be 2
        System.out.println(majorityElement(arr1));

    }

}
