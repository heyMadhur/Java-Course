package L26_Linked_List_Part_2.Assignment;

public class Q2 {

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

    public void skipM_removeN(int m, int n) {
        Node temp;
        Node curr = head;

        while (curr != null) {
            for (int i = 1; i < m && curr!=null; i++) {
                curr = curr.next;
            }
            if (curr == null)
                return;

            temp = curr.next;

            for (int i = 1; i <= n && temp != null; i++) {
                temp = temp.next;
            }
            curr.next = temp;
            curr= temp;
        }
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

        // Q2 Delete N Nodes After M Nodes of a Linked List
        // We have a linked list and two integers M and N. Traverse the linked list such
        // that you retain M nodes then delete next N nodes, continue the same till end
        // of the linked list.DifficultyLevel:Rookie.

        Q2 ll = new Q2();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        // ll.addLast(9);
        // ll.addLast(10);
        ll.skipM_removeN(2, 2);
        ll.printLinkedList();

        
        

    }

}
