package Imp_L27_Stacks;

import java.util.*;

public class Imp_T10_Max_Area_in_Histogram {

    public static void maxArea(int[] height) {
        int[] nextSmallerLeft = new int[height.length];
        int[] nextSmallerRight = new int[height.length];
        int maxArea = 0;

        Stack<Integer> stack = new Stack<>();

        // Next Smaller Left
        for (int i = 0; i < height.length; i++) {
            int curr = height[i];
            while (!stack.isEmpty() && height[stack.peek()] >= curr) {
                stack.pop();
            }
            if (stack.isEmpty())
                nextSmallerLeft[i] = -1;
            else
                nextSmallerLeft[i] = stack.peek();
            stack.push(i);
        }

        // Next Smaller Right
        stack = new Stack<>();
        for (int i = height.length - 1; i >= 0; i--) {
            int curr = height[i];
            while (!stack.isEmpty() && height[stack.peek()] >= curr) {
                stack.pop();
            }
            if (stack.isEmpty())
                nextSmallerRight[i] = height.length;
            else {
                nextSmallerRight[i] = stack.peek();
            }
            stack.push(i);
        }

        // Calculate Area: width= j-i-1= nextSmallerRight[i] - nextSmallerLeft[i] -1
        for (int i = 0; i < height.length; i++) {
            int h = height[i];
            int width = nextSmallerRight[i] - nextSmallerLeft[i] - 1;
            int currArea = h * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Max Area= " + maxArea);
    }

    public static void main(String[] args) {
        // Ques
        // Given an array of integer heights representing the histogram's bar height
        // where the width of each bar is 1, return the area of the largest rectangle in
        // the histogram.

        int[] height = { 2, 1, 5, 6, 2, 3 };
        maxArea(height);

    }

}
