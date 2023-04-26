package L24_ArrayLists;

import java.util.ArrayList;

public class Imp_T5_Pair_Sum {

    public static boolean pairSum_BruteForce(ArrayList<Integer> arr, int target) {

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == target)
                    return true;
            }
        }
        return false;
    }

    public static boolean pairSum_2Pointer(ArrayList<Integer> arr, int target) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            if (arr.get(l) + arr.get(r) == target)
                return true;
            else if(arr.get(l) + arr.get(r) > target) r--;
            else l++;
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // list.set(, 8);
        System.out.println(list);
        System.out.println(pairSum_2Pointer(list, 9));
        System.out.println(pairSum_BruteForce(list, 9));

        
        
    }

}
