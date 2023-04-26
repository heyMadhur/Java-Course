package L26_Linked_List_Part_2;

public class Imp_T2_Merge_Sort_LL {

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

    public Node mergeSort(Node head) {
        // Base Case
        if (head == null || head.next == null) {
            return head;
        }

        // 1- Find Mid
        Node mid = findMid(head);

        // 2- Right and Left Merge Sort Call
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // 3- Merge
        return merge(newLeft, newRight);
    }

    // Slow Fast Approach
    private Node findMid(Node head) {
        Node s = head; // Slow
        Node f = head.next; // Fast

        while (f != null && f.next != null) {
            s = s.next; // Jumps 1 time----> Slow
            f = f.next.next; // Jumps 2 time----> Fast
        }
        return s;
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            } else {
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }
        while (head2 != null) {
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }

        return mergedLL.next;

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

        Imp_T2_Merge_Sort_LL ll = new Imp_T2_Merge_Sort_LL();
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(45);
        ll.addLast(671);
        ll.addLast(14);
        ll.printLinkedList();
        head=ll.mergeSort(head);
        ll.printLinkedList();

    }

}
