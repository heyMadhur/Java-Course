package L29_Greedy_Algorithms;

import java.util.Arrays;

public class T3_Min_Sum_Abs_Diff_Pairs {

    public static void minAbsoluteDifferencePairs(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int minDif = 0;
        for (int i = 0; i < A.length; i++) {
            minDif += Math.abs(A[i] - B[i]);
        }

        System.out.println("Min Difference= " + minDif);
    }

    public static void main(String[] args) {
        // Given two Arrays A and B of equal length n. Pair each element of array A to
        // an element in array B, such that sum S of absolute dfifferences of all the
        // pairs is minimum.

        int[] A= {1,2,3};
        int[] B= {2,1,3};

        minAbsoluteDifferencePairs(A, B);

    }

}
