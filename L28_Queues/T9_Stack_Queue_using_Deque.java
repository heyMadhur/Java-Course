package L28_Queues;

import java.util.*;

public class T9_Stack_Queue_using_Deque {

    class Stack{
        Deque <Integer> dq= new LinkedList<>();

        public boolean isEmpty(){
            return dq.size()==0;
        }
        
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack Empty!!");
                return -1;
            }
            return dq.getLast();
        }
        
        public void push(int data){
            dq.addLast(data);
        }
        
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack Empty!!");
                return -1;
            }
            
            return dq.removeLast();
        }
        
    }

    class Queue{
        Deque <Integer> dq= new LinkedList<>();

        public boolean isEmpty(){
            return dq.size()==0;
        }
        
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack Empty!!");
                return -1;
            }
            return dq.getFirst();
        }

        public void enqueue(int data){
            dq.addLast(data);
        }

        public int dequeue(){
            if(isEmpty()){
                System.out.println("Stack Empty!!");
                return -1;
            }
            return dq.removeFirst();
        }
    }



    public static void main(String[] args) {
        
    }
    
}
