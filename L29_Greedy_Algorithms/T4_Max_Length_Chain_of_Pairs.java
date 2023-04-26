package L29_Greedy_Algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class T4_Max_Length_Chain_of_Pairs {

    public static void maxLengthChainofPairs(int [][] pairs){ // O(nlogn)
        // Sorting on basis of 2nd item in pair
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));

        int chainLen=1;
        int second= pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if(pairs[i][0] > second){
                chainLen++;
                second= pairs[i][1];
            }
        }
        System.out.println("Max No. of Pairs= "+ chainLen);
        
    }


    public static void main(String[] args) {
        // You are given n pairs of numbers. In every pair, the first number is always smaller than the second number. A pair (c,d) can come after pair (a,b) if b<c.
        // Find the longest chain which can be formed from a given set of pairs.

        // Note that this problem is similar to Activity Selection Problem
        
        int [][] pairs= {{5,24}, {39,60}, {5,38}, {27,40}, {50,90}};

        maxLengthChainofPairs(pairs);
        
        
        
    }
    
}
