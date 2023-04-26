package L29_Greedy_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class T1_Activity_Selection_Code {

    public static void activitySelection(int[] start, int[] end) {
        // Using end time Sort

        // Sorting on Basis of End time
        int[][] activities = new int[start.length][3];

        // Inserting Values in activities
        // Col-1: Index Value of Activity
        // Col-2: Start Time
        // Col-3: End Time

        for (int i = 0; i < activities.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Now Sorting this 2D Array on basis of end time (3rd coulmn)
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxActivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // For 1st Activity
        ans.add(0);
        maxActivity = 1;
        int lastEnd = activities[0][2];

        for (int i = 0; i < activities.length; i++) {
            if (activities[i][1] >= lastEnd) {
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
                maxActivity++;
            }

        }

        System.out.println("Max Activities That can be performed= " + maxActivity);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ ans.get(i)+" ");
        }

    }

    public static void main(String[] args) {
        // You are given n activities with their start and end times. Select the max no. of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time. 
        // HINT- Sort activities according to end time....

        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };

        activitySelection(start, end);

    }

}