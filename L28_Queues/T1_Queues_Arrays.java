package L28_Queues;

public class T1_Queues_Arrays{

    class Queue{
        int [] arr;
        int rear=-1;

        Queue(int size){
            this.arr= new int[size];
        }

        public boolean isEmpty(){
            return rear==-1;
        } 

        public boolean isFull(){
            return rear== arr.length-1;
        }

        public void enqueue(int val){
            if(isFull()){
                System.out.println("Queue Full!!");
                return;
            }
            arr[++rear]= val;
        }

        public int dequeue(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            
            // Front Value
            int val=arr[0];
            
            // Shifting all elements to left by 1 place
            for (int i = 0; i < rear; i++) {
                arr[i]=arr[i+1];
            }
            rear--;
            return val;
        }
        
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }

            return arr[0];
            
        }

    }
    

    public static void main(String[] args) {

        T1_Queues_Arrays q= new T1_Queues_Arrays();

        Queue queue= q.new Queue(4);

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);           // Will not be able to add it

        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }


        
    }
    
}