package L24_ArrayLists;

import java.util.ArrayList;

public class T3_Multi_Dimensional_Array {


    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();

        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            list1.add(2*i);
            list2.add(3*i);
        }

        mainList.add(list1);
        mainList.add(list2);

        // Printing Whole 2-D List
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList= mainList.get(i); 
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }

        // For Accessing a PArticular Element
        mainList.get(1).get(2);
        // mainList.get(i).get(j) equivalent to mainList[i][j]
        
        
    }
    
}
