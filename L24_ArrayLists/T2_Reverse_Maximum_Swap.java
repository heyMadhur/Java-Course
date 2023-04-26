package L24_ArrayLists;

import java.util.*;

public class T2_Reverse_Maximum_Swap {

    public static void printReverse(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void printMax(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max= " + max);
    }

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp= list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {

        ArrayList <Integer> list= new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }

        printReverse(list);
        printMax(list);
        swap(list, 0, 5);
        System.out.println(list);
        

    }

}
