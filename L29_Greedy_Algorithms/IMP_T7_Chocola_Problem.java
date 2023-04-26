package L29_Greedy_Algorithms;

import java.util.Arrays;
import java.util.Collections;

public class IMP_T7_Chocola_Problem {

    public static void chocolaProblem(Integer[] horCost, Integer[] verCost) {
        // Arranging Cost in Descending Order

        Arrays.sort(verCost, Collections.reverseOrder());
        Arrays.sort(horCost, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int totalCost = 0;

        while (h < horCost.length && v < verCost.length) {
            if (horCost[h] >= verCost[v]) {     // Horizontal Cut
                totalCost += (horCost[h] * vp);
                h++;
                hp++;
            } else {                            // Vertical Cut
                totalCost += (verCost[v] * hp);
                v++;
                vp++;
            }
        }
        while (h < horCost.length) {
            totalCost += (horCost[h] * vp);
            h++;
            hp++;
        }
        while (v < verCost.length) {
            totalCost += (verCost[v] * hp);
            v++;
            vp++;
        }

        System.out.println("Min Cost of Cuts= " + totalCost);

    }

    public static void main(String[] args) {
        // Another Name- Min Cost to cut boards into Squares

        // Imp- Hard Level Problem
        // We are given a bar of chocolate composed if mxn square pieces. One should
        // break the chocolate into single squares. Each break of a part of the
        // chocolate is charged a cost expressed by apositive integer. This cost does
        // not depend on the size of the part that is being broken but only depends on
        // the ne the break goes aling. Let us denote the vosts if breaking along
        // consecutive veertical lines with x1, x2, ..., x m-1 and the horixonatal lines
        // with y1, y2, ...., y n-1.
        // Compute the minimal cost if breaking the whole chocolate into single squares.

        // int n = 4, m = 6;
        Integer[] costVer = { 2, 1, 3, 1, 4 }; // m-1
        Integer[] costHor = { 4, 1, 2 }; // n-1

        chocolaProblem(costHor, costVer);

    }

}
