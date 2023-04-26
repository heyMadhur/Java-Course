package L24_ArrayLists;

import java.util.ArrayList;

public class Imp_T4_Container_with_Most_Water {

    public static void containerWithMostWater_BruteForce(ArrayList<Integer> arr) {
        int waterCountMax = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                // WaterLevel= Width* Height
                int currWater = (j - i) * Math.min(arr.get(i), arr.get(j));
                waterCountMax = Math.max(waterCountMax, currWater);
            }
        }
        System.out.println("MAX WATER (BruteForce)= " + waterCountMax);
    }

    public static void mostWater_2Pointer(ArrayList<Integer> height) {
        int l = 0, r = height.size() - 1;
        int maxWater = 0;
        while (l < r) {
            int currWater = (r - l) * Math.min(height.get(l), height.get(r));
            maxWater = Math.max(maxWater, currWater);

            if (height.get(l) < height.get(r))
                l++;
            else
                r--;
        }
        System.out.println("Max Water (Optimized)= " + maxWater);

    }

    public static void main(String[] args) {

        // int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        ArrayList <Integer> heightList= new ArrayList<>();
        heightList.add(1);
        heightList.add(8);
        heightList.add(6);
        heightList.add(2);
        heightList.add(5);
        heightList.add(4);
        heightList.add(8);
        heightList.add(3);
        heightList.add(7);

        
        containerWithMostWater_BruteForce(heightList);
        mostWater_2Pointer(heightList);

    }

}
