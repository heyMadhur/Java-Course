package L28_Queues;

import java.util.*;

public class Imp_T7_Interleave_2_Halves_Queue {

    public static void interleaveQueue(Queue<Integer> q){
        int size= q.size()/2;

        Queue<Integer> temp= new LinkedList<>();

        for (int i = 0; i < size; i++) {
            temp.add(q.remove());
        }
        for (int i = 0; i < size; i++) {
            int num= q.remove();
            q.add(temp.remove());
            q.add(num);
        }
    }

    public static void printQueue(Queue<Integer> q){
        Queue<Integer> temp= q;
        int size= q.size();

        for (int i = 0; i < size; i++) {
            System.out.print(temp.remove()+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        
        Queue<Integer> q= new LinkedList<>();
        
        for ( int i = 1; i < 11; i++) {
            q.add(i);
        }

        interleaveQueue(q);
        printQueue(q);

        
        
        
    }
    
}
