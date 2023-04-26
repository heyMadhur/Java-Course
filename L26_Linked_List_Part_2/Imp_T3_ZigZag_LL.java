package L26_Linked_List_Part_2;

public class Imp_T3_ZigZag_LL {

    public static Node head = null;
    public static Node tail = null;
    public static int size = 0;

    public static class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;
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

    public void ZigZagLL() {

        // Find Mid
        Node mid = findMid();

        // Split Left and Right
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;

        }
    }

    public Node findMid() {
        Node s = head;
        Node f = head.next;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;

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

        // ZigZag Linked List
        // Like input= 1->2->3->4->5
        // Output= 1->5->2->4->3 (Starting 1st-> Ending 1st-> Starting 2nd-> Ending 2nd
        // .......so on )

        Imp_T3_ZigZag_LL ll = new Imp_T3_ZigZag_LL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.ZigZagLL();
        ll.printLinkedList();

    }

}
