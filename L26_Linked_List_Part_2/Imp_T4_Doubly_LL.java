package L26_Linked_List_Part_2;

public class Imp_T4_Doubly_LL {

    public static Node head=null;
    public static Node tail= null;
    public static int size=0;

    public class Node{
        int data;
        Node next;
        Node prev;

        // Constructor
        public Node(int data){
            this.data=data;
            this.next= null;
            this.prev= null;
            size++;
        }
    }

    public void addFirst(int data) {
        Node n= new Node(data);
        if(head==null){
            head=tail=n;
            return;
        }
        n.next= head;
        head.prev= n;
        head= n;
    }
    
    public void addLast(int data) {
        Node n= new Node(data);
        if(head==null){
            head=tail=n;
            return;
        }
        tail.next=n;
        n.prev=tail;
        tail=n;
    }

    public int removeFirst() {
        if(head==null){
            System.out.println("Linked List is Empty");
            return -1;
        }
        int val= head.data;
        size--;
        if(head==tail){
            head=tail=null;
            return val;
        }
        
        head=head.next;
        head.prev=null;
        return val;
    }
    
    public int removeLast() {
        if(head==null){
            System.out.println("Linked List is Empty");
            return -1;
        }
        int val= tail.data;
        size--;
        if(head==tail){
            head=tail=null;
            return val;
        }

        tail= tail.prev;
        tail.next= null;
        return val;
        
    }

    public Node reverseDLL(Node head) {
        Node prev= null;
        Node curr= head;
        Node next;
        while(curr!=null){
            next= curr.next;
            curr.next= prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        // System.out.println("Prev= "+ prev.data);
        tail=head;
        head=prev;
        return head;
    }
    
    public void printLinkedList(Node head) {
        if(head==null){
            System.out.println("Cannot Print!!, Linked List is Empty");
            return;
        }
        Node temp= head;
        System.out.print("null<->");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
            // if(temp.data==4)return;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Imp_T4_Doubly_LL ll= new Imp_T4_Doubly_LL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(0);
        ll.printLinkedList(head);
        // ll.removeFirst();
        // ll.removeLast();;
        
        head= ll.reverseDLL(head);
        
        ll.printLinkedList(head);

        
    }
    
}
