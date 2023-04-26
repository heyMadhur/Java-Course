package L25_Linked_List_Part_1;

public class LinkedList {

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

    public void addFirst(int data) {
        Node n = new Node(data);

        // Adding 1st Element to the Linked List
        if (head == null && tail == null) {
            head = tail = n;
            System.out.println(data + " added!!");
            return;
        }

        n.next = head;
        head = n;
        System.out.println(data + " added!!");
    }

    public void addLast(int data) {
        Node n = new Node(data);

        // Adding 1st Element to the Linked List
        if (head == null && tail == null) {
            head = tail = n;
            System.out.println(data + " added!!");
            return;
        }
        tail.next = n;
        tail = n;
        System.out.println(data + " added!!");
    }

    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        if (idx == size) {
            addLast(data);
            return;
        }

        Node n = new Node(data);

        Node temp = head;
        while (temp != null && idx - 1 > 0) {
            temp = temp.next;
            idx--;
        }
        n.next = temp.next;
        temp.next = n;
        System.out.println(data + " added!!");
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("Cannot Delete, Linked List is empty!!");
            return Integer.MIN_VALUE;
        }
        size--;
        int val = head.data;
        if (head.next == null) {
            head = tail = null;
            System.out.println(val + " Deleted");
            return val;
        }
        head = head.next;
        System.out.println(val + " Deleted");
        return val;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("Cannot Delete, Linked List is empty!!");
            return Integer.MIN_VALUE;
        }
        size--;
        int val = tail.data;
        if (head.next == null) {
            head = tail = null;
            System.out.println(val + " Deleted");
            return val;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        System.out.println(val + " Deleted");
        return val;
    }

    public int iterativeSearch(int val) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == val) {
                System.out.println(val + " present at index= " + idx);
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public int recursiveSearch(Node temp, int idx, int val) {
        // Base Case
        if (temp == null)
            return -1;
        else if (temp.data == val) {
            System.out.println(val + " present at index= " + idx);
            return idx;
        }
        return recursiveSearch(temp.next, idx + 1, val);

    }

    public void removeNthEnd(int n) {
        // from 0 to size-n
        int idx = 0;
        if (head == null) {
            System.out.println("Linked List Empty");
            return;
        }
        if (n > size) {
            System.out.println("More than size limit");
            return;
        } else if (size - n == 0) {
            removeFirst();
            return;
        } else if (n == 1) {
            removeLast();
            return;
        }

        // n=3, size= 5, idx=2;

        Node temp = head;
        while (idx < size - n - 1) {
            temp = temp.next;
            idx++;
        }
        temp.next = temp.next.next;
        size--;

    }

    // Time Complexity= O(n^2)
    // public void reverseLinkedList() {
    // if (head == null) {
    // System.out.println("Linked is Empty!!");
    // return;
    // }
    // if (head.next == null) {
    // return;
    // }

    // for (int idx = size - 1; idx > 0; idx--) {
    // int val = removeFirst();
    // addMiddle(idx, val);
    // }
    // }

    public void reverseLinkedList() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tail = head;
        head = prev;
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

        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(4, 5);
        ll.addMiddle(5, 6);
        // System.out.println("Before Reversing-:");
        ll.printLinkedList();
        // System.out.println("After Reversing-:");
        // ll.reverseLinkedList();
        // ll.printLinkedList();
        ll.removeNthEnd(3);
        ll.printLinkedList();
        // System.out.println("HEad= "+head.data);
        // System.out.println("Tail= "+tail.data);

        // ll.iterativeSearch(10);
        // ll.recursiveSearch(head, 0, 10);

        // System.out.println(size);

    }

}
