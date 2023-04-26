package L29_Greedy_Algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class T2_Fractional_Knapsack {

    public static void fractionalKnapSack(int[] weight, int[] value, int totalWeight) {
        double[][] ratio = new double[weight.length][2];
        // Col1- Index
        // Col2- Ratio
        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (value[i] / (double) weight[i]);
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = totalWeight;
        int maxValue = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                capacity -= weight[idx];
                maxValue += value[idx];
            } else {
                maxValue += (capacity * ratio[i][1]);
                capacity = 0;
                break;
            }
        }
        System.out.println("Max Value is " + maxValue);
    }

    public static void main(String[] args) {
        // Given the weights anf values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
        // Ans= 240
        
        int[] weight = { 10, 20, 30 };
        int[] value = { 60, 100, 120 };
        int totalWeight = 50;

        fractionalKnapSack(weight, value, totalWeight);
    }
}
