package L26_Linked_List_Part_2.Assignment;

public class Q1 {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node findIntersection(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null) {
            temp2 = head2;
            while (temp2 != null) {
                if (temp1 == temp2) {
                    return temp1;
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return null;
    }

    public static void main(String[] args) {

        // Q1 Intersection of Two Linked Lists
        // In a system there are two singly linked list. By some programming error, the
        // end node of one of the linked lists got linked to the second list, forming an
        // inverted Y-shaped list. Write a program to get the point where two linked
        // lists merge.
        // We have to find the intersection part in this system.

        Q1 ll = new Q1();
        Node head1, head2;

        head1 = ll.new Node(10);
        head2 = ll.new Node(3);

        Node newNode = ll.new Node(6);
        head2.next = newNode;
        newNode = ll.new Node(9);
        head2.next.next = newNode;

        newNode = ll.new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = ll.new Node(30);

        head1.next.next = newNode;
        head1.next.next.next = null;

        Node check = ll.findIntersection(head1, head2);
        if (check != null) {
            System.out.println("Intersection at= " + check.data);
        } else {
            System.out.println("No Intersection");
        }

    }

}
