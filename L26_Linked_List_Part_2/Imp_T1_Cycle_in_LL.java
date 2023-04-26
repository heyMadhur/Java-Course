package L26_Linked_List_Part_2;

public class Imp_T1_Cycle_in_LL {

    public static Node head = null;
    public static Node tail = null;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Detecting a cyclic Linked List
    public boolean checkCyclic() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Remove a cyclic Linked List
    public static void removeCyclic() {
        // 1- Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean isCyclic = false;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Jumps 1 time
            fast = fast.next.next; // Jumps 2 times

            if (slow == fast) {
                isCyclic = true;
                break;
            }
        }

        // 2- Find Meeting Point 
        if (isCyclic) {
            slow = head;
            Node prev = null;
            while (slow != fast) {
                prev = fast;
                slow = slow.next; // Jumps only 1 time
                fast = fast.next; // Jumps only 1 time
            }
            prev.next = null;
        } else {
            System.out.println("Not a Cyclic Linked ListS!!");
        }

    }

    public static void main(String[] args) {
        Imp_T1_Cycle_in_LL ll= new Imp_T1_Cycle_in_LL();
        head= ll.new Node(3);
        head.next= ll.new Node(5);
        head.next.next= ll.new Node(6);
        head.next.next.next= ll.new Node(8);
        head.next.next.next.next= ll.new Node(11);
        head.next.next.next.next.next= ll.new Node(3);
        head.next.next.next.next.next.next= ll.new Node(7);
        head.next.next.next.next.next.next.next= head.next;

        System.out.println(ll.checkCyclic());
        removeCyclic();
        System.out.println(ll.checkCyclic());



    }

}
