package L24_ArrayLists;

import java.util.*;

public class T1_Operations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // 1. Add Operation
        list.add(2);
        list.add(4);
        list.add(1, 6);

        // 2. Get Element Operation
        System.out.println(list.get(1));

        // 3. Remove Element Operation
        list.remove(2);

        // 4. Set Element at Index Operation
        list.set(1,4);

        // 5. Contains Element Operation
        System.out.println(list.contains(6));
        System.out.println(list.contains(4));

        // 6. Size Method (Not an Operation)
        System.out.println(list.size());

        // 7. Sorting
        // Descending Order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order= "+list);
        // Ascending Order
        Collections.sort(list);
        System.out.println("Ascending Order= "+list);



    }

}
