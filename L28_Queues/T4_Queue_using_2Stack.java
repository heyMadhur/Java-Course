package L28_Queues;
import java.util.*;

public class T4_Queue_using_2Stack {

    public class Queue{
        Stack<Integer> s1= new Stack<>();
        Stack<Integer> s2= new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }

        public void enqueue(int val){
            if(s1.isEmpty()){
                s1.push(val);
                return;
            }

            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(val);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is Empty!!");
                return -1;
            }
            return s1.pop();
        }

        public int peek(){
            return s1.peek();
        }
    }
    


    public static void main(String[] args) {

        // Q We have to make a Queue using 2 Stacks

        T4_Queue_using_2Stack q= new T4_Queue_using_2Stack();
        Queue queue= q.new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }

        
    }
    
}
