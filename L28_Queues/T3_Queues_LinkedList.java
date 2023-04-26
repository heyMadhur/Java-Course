package L28_Queues;

public class T3_Queues_LinkedList {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }        
    }

    public class Queue{
        public static Node head;
        public static Node tail;

        public boolean isEmpty(){
            return head==null;
        }


        public void enqueue(int data) {
            Node n = new Node(data);
    
            // Adding 1st Element to the Linked List
            if (head == null && tail == null) {
                head = tail = n;
                return;
            }
            tail.next = n;
            tail = n;
        }
        public int dequeue() {
            if (head == null) {
                System.out.println("Queue Empty!!");
                return Integer.MIN_VALUE;
            }
            int val = head.data;
            if (head.next == null) {
                head = tail = null;
                return val;
            }
            head = head.next;
            return val;
        }
    }

    public static void main(String[] args) {

        T3_Queues_LinkedList q= new T3_Queues_LinkedList();

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
