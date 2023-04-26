package Imp_L27_Stacks;

public class T2_Stack_LinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node n = new Node(data);

            if (head == null) {
                head= n;
                return;
            }
            // System.out.println(top.next + " dsds");
            n.next = head;
            head = n;
        }

        public static int pop() {
            if (head == null)
                return -1;
                
                int val = head.data;
                head= head.next;
                return val;
            }
            
            public static int peek() {
                if (head == null)
                    return -1;
                return head.data;
            }
        }

    public static void main(String[] args) {
        Stack.push(5);
        Stack.push(4);
        Stack.push(3);
        Stack.push(2);
        Stack.push(1);
        Stack.push(0);

        System.out.println(Stack.peek());

        Stack.pop();

        System.out.println(Stack.peek());

    }

}
