package L29_Greedy_Algorithms;

import java.util.Arrays;

public class T5_Indian_Coins {

    public static void indianCoins(int[] denomination, int V) {
        Arrays.sort(denomination);

        int amount = V;
        int idx = denomination.length-1;
        int countOfCoins = 0;
        while (amount != 0) {
            if (amount >= denomination[idx]) {
                amount -= denomination[idx];
                countOfCoins++;
            } else {
                idx--;
            }

        }
        System.out.println("Min No. of Coins/Notes to make Change for " + V + " is " + countOfCoins);

    }

    public static void main(String[] args) {
        // We are given an infinite supply of denominations
        // [1,2,5,10,20,50,100,500,2000]. Find the min no. of coins/ notes to make
        // change for a value V.

        int[] denomination = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int V = 700;
        int V1= 590;

        indianCoins(denomination, V);
        indianCoins(denomination, V1);

    }
}
