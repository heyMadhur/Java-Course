package L25_Linked_List_Part_1;

public class Imp_LL_Palindrome {

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

    // Slow Fast Approach
    public Node findMid() {
        Node s = head; // Slow
        Node f = head; // Fast

        while (f != null && f.next != null) {
            s = s.next; // Jumps 1 time----> Slow
            f = f.next.next; // Jumps 2 time----> Fast
        }
        return s;
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // 1- Find Mid
        Node mid = findMid();
        System.out.println();

        // 2- Reverse Linked List after mid
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 3- Check for Palindrome
        Node left = head;
        Node right = prev;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }

            right = right.next;
            left = left.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Imp_LL_Palindrome ll = new Imp_LL_Palindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(1);
        ll.addLast(1);
        ll.printLinkedList();
        System.out.println(ll.checkPalindrome());

    }

}
