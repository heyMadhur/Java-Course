package L24_ArrayLists.Assignment;

import java.util.ArrayList;

public class Q1 {

    public static boolean checkMonotonicArraylist(ArrayList<Integer> list) {
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i)<list.get(i+1)){
                while(i<list.size()-1){
                    if(list.get(i)>list.get(i+1)){
                        
                        return false;
                    }
                    i++;
                }
                return true;
            }
            else if(list.get(i)>list.get(i+1)){
                while(i<list.size()-1){
                    if(list.get(i)<list.get(i+1)){
                        return false;
                    }
                    i++;
                }
                return true;
            }
        }

        return true;
    }

    // public static boolean checkInCreasing(ArrayList<Integer> list, int idx) {
    //     for (int i = idx; i < list.size()-1; i++) {
    //         if(list.get())
            
    //     }
        
    // }
    

    public static void main(String[] args) {

        // Q1 Monotonic ArrayList
        // An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
        // An Arraylist nums is monotone increasing if for all i<=j, nums.get(i)<=nums.get(j).An Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j). Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
        
        // Input-1
        ArrayList <Integer> list= new ArrayList<>();
        list.add(1); list.add(2); list.add(2); list.add(3); 
        System.out.print(list+"= ");
        System.out.println(checkMonotonicArraylist(list)+"\n");

        // Input-2
        ArrayList <Integer> list1= new ArrayList<>();
        list1.add(6); list1.add(5); list1.add(4); list1.add(4); 
        System.out.print(list1+"= ");
        System.out.println(checkMonotonicArraylist(list1)+"\n");
        
        // Input-3
        ArrayList <Integer> list2= new ArrayList<>();
        list2.add(1); list2.add(3); list2.add(2); 
        System.out.print(list2+"= ");
        System.out.println(checkMonotonicArraylist(list2)+"\n");


        
        
    }
}
