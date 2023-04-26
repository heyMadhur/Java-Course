package L24_ArrayLists.Assignment;

import java.util.ArrayList;

public class Q2 {

    public static ArrayList<Integer> checkLonelyNums(ArrayList<Integer> list) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            list.remove(i);
            if (!list.contains(num + 1) && !list.contains(num - 1) && !list.contains(num)) {
                ans.add(num);
            }
            list.add(i, num);
        }

        return ans;
    }

    public static void main(String[] args) {

        // Q2 Lonely Numbers in ArrayList
        // You are given an integer arraylist nums. A number x is lonely when it appears
        // only once, and no adjacent numbers (i.e. x + 1 and x - 1) appear in the
        // arraylist.
        // Return all lonely numbers in nums. You may return the answer in any order.

        // Input-1
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(checkLonelyNums(list));

        // Input-2
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(3);
        System.out.println(checkLonelyNums(list1));

    }

}
