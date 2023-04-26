package Imp_L27_Stacks.Assignment;

import java.util.*;

public class Q1 {
    public static int size=0;
    static class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public static boolean isPalindrome(Node head) {
        Stack<Character> stack= new Stack<>();
        
        // Find Mid
        Node slow=head, fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node mid= slow;
        while(slow!=null){
            stack.push(slow.data);
            slow= slow.next;
        }

        slow=head;
        while(slow!=mid && !stack.isEmpty()){
            if(slow.data!= stack.pop()) return false;
            slow= slow.next;
        }
        return true;
    }

    public static void main(String[] args) {

        // Q1 Palindrome Linked Ques
        // We have a singly linked list of characters, write a function that returns
        // true if the given list is a palindrome, else false.

        Node a = new Node('a');
        Node b = new Node('b');
        Node c = new Node('c');
        Node d = new Node('d');
        Node e = new Node('e');

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(isPalindrome(a));

    }

}
