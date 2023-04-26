package L28_Queues;
import java.util.*;

public class T8_Queue_Reversal {

    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s= new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
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
        reverseQueue(q);
        printQueue(q);
        
    }
    
}
