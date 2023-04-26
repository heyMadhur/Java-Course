package L24_ArrayLists;

import java.util.ArrayList;

public class Imp_T6_Pair_Sum_Rotated_Array {

    public static boolean pairSumRotatedList_MyTry(ArrayList<Integer> list, int target) {
        int pivot = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1))
                pivot = i;
        }
        int l = pivot + 1, r = pivot;
        while (l > r) {
            if (list.get(l) + list.get(r) == target)
                return true;
            else if (list.get(l) + list.get(r) > target)
                r--;
            else
                l++;

            if (l == list.size()) {
                l = 0;
                break;
            }
            if (r == 0) {
                r = list.size() - 1;
                break;
            }
        }
        while (l < r) {
            if (list.get(l) + list.get(r) == target)
                return true;
            else if (list.get(l) + list.get(r) > target)
                r--;
            else
                l++;
        }

        return false;

    }

    public static boolean pairSum_2Pointer(ArrayList<Integer> arr, int target) {
        int n = arr.size();
        int pivot = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr.get(i) > arr.get(i + 1))
                pivot = i;
        }
        int l = pivot + 1, r = pivot;
        while (l != r) {
            if (arr.get(l) + arr.get(r) == target)
                return true;
            else if (arr.get(l) + arr.get(r) > target)
                r = (n + r - 1) % n;
            else
                l = (l + 1) % n;
        }
        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(pairSumRotatedList_MyTry(list, 14));

        System.out.println(pairSum_2Pointer(list, 14));
    }

}
