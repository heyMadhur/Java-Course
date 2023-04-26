package Imp_L27_Stacks;

import java.util.*;

public class T6_Stock_Span_Prob {

    public static void stockSpan_BruteForce(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        int[] span = new int[arr.length];
        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[stack.peek()] > arr[i]) {
                stack.push(i);
                span[i] = 1;
            } else {
                // int i;
                while (arr[stack.peek()] < arr[i]) {
                    stack.pop();
                }
                span[i] = i - stack.peek();
                if (arr[stack.peek()] == arr[i]) {
                    span[i]++;
                }
            }
        }

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }

    public static void stockSpan(int[] prices, int[] span) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < prices.length; i++) {
            int currPrice = prices[i];
            while (!stack.isEmpty() && prices[stack.peek()] <= currPrice) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = stack.peek();
                span[i] = i - prevHigh;
            }
            stack.push(i);
        }
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }

    }

    public static void main(String[] args) {

        // Ques Stock Span Problem
        int[] prices = new int[] { 100, 80, 60, 70, 60, 85, 100 };
        int[] span = new int[prices.length];
        stockSpan_BruteForce(prices);
        System.out.println();
        stockSpan(prices, span);

    }

}
