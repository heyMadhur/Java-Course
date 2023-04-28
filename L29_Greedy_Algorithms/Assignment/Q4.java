package L29_Greedy_Algorithms.Assignment;

public class Q4 {

    public static void stockRecommendation(int[] prices) {

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        System.out.println("Max Profit= " + maxProfit);
    }

    public static void main(String[] args) {

        // Q4 Best Time to Buy and Sell Stock
        // Given an array prices[] of length N, representing the prices of the stocks
        // ond if different days, the task is to find the maximum profit possible for
        // buying and selling the stocks on different days using transactions where at
        // most one transaction is allowed. Note: Stock must be bought before being
        // sold.

        int[] prices = { 7, 1, 5, 3, 6, 4 };
        stockRecommendation(prices);

    }

}
