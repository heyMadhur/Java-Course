package L28_Queues;

public class T2_CircularQueues_Array {

    public class Queue{
        int [] arr;
        int rear, front;
        int size;

        Queue(int size){
            this.arr= new int[size];
            rear=-1;
            front=-1;
            this.size=size;
        }

        public boolean isEmpty(){
            return front==-1;
        }

        public boolean isFull(){
            return (rear+1)%size==front;
        }

        public void enqueue(int val){
            if(isFull()){
                System.out.println("Queue Full!");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear= (rear+1)%size;
            arr[rear]= val;
        }

        public int dequeue(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            int val=arr[front];
            if(front==rear){
                front=-1;
                rear=-1;
                return val;
            }
            front=(front+1)%size;
            return val;    
        }



    }


    public static void main(String[] args) {
        T2_CircularQueues_Array q= new T2_CircularQueues_Array();

        Queue queue= q.new Queue(6);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        
        
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
        System.out.println(queue.front);
        System.out.println(queue.rear);
        
    }
    
}
