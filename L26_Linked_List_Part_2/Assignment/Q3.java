package L26_Linked_List_Part_2.Assignment;

public class Q3 {

    public static Node head;
    public static Node tail;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data) {
        Node n = new Node(data);

        // Adding 1st Element to the Linked List
        if (head == null && tail == null) {
            head = tail = n;
            // System.out.println(data + " added!!");
            return;
        }
        tail.next = n;
        tail = n;
        // System.out.println(data + " added!!");
    }

    public void swap(int idx1, int idx2) {
        Node temp1 = head, temp2 = head;
        Node t1Prev= null, t2Prev= null;
        int i1 = 1, i2 = 1;

        while (temp1 != null && temp2 != null) {
            // System.out.println('i');
            if (i1 < idx1){
                // System.out.println(1);
                t1Prev= temp1;
                temp1 = temp1.next;
                i1++;
            }
            if (i2 <= idx2){
                // System.out.println(2);
                t2Prev= temp2;
                temp2 = temp2.next;
                i2++;
                if(i2==idx2) break;
            }
        }

        System.out.println("T1= "+temp1.data+" T2= "+temp2.data);

        Node t1Next= temp1.next;

        temp1.next= temp2.next;
        temp2.next= t1Next;

        t1Prev.next= temp2;
        t2Prev.next= temp1;
        // System.out.println("Done Swapping");

    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("Linked List Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {

        // Q3 Swapping Nodes in a Linked List
        // We have a linked list and two keys in it, swap nodes for two given keys.
        // Nodes should be swapped by changing links. Swapping data of nodes may be
        // expensive in many situations when data contains many fields. It may be
        // assumed that all keys in the linked list are distinct.

        // ( Dhang se Nahi kra abhi )

        Q3 ll= new Q3();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.printLinkedList();
        
        ll.swap(1, 4);
        
        ll.printLinkedList();
        
    }

}
