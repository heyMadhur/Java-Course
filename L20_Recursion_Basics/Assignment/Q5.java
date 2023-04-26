package L20_Recursion_Basics.Assignment;

public class Q5 {

    public static void towerOfHanoi(int disk, String s, String h, String d) {
        // Base Condition
        if(disk==0){
            return;
        }
        
        // Transfer n-1 disk from Source to Helper using Destination
        towerOfHanoi(disk-1, s, d, h); 
        
        System.out.println("Transfer disk "+disk+" from "+s+" to "+d);

        towerOfHanoi(disk-1, h, s, d);
        
    }


    public static void main(String[] args) {
        // Q5 You have 3 towers and N disks of different sizes which can slide on to any tower. The puzzle starts with disks sorted in ascending order of size from top to bottom(i.e., each disks its on top of an even larger one).
        // You have the following constraints:
        // (1) Only one disk can be moved at a time.
        // (2) A disk is slid off the top of one tower onto another tower.
        // (3) A disk cannot be placed on top of a smaller disk. Write a program to move the disks from the first tower to the last using Stacks.
        
        towerOfHanoi(3, "Source", "Helper", "Destination");
        
    }
    
}
