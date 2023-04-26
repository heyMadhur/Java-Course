package L28_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class T5_Stack_using_2Queue {

    public class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data) {
            if (isEmpty()) {
                q1.add(data);
                return;
            }
            if (q2.isEmpty()) {
                q2.add(data);
                while (!q1.isEmpty()) {
                    q2.add(q1.remove());
                }
                return;
            }
            if (q1.isEmpty()) {
                q1.add(data);
                while (!q2.isEmpty()) {
                    q1.add(q2.remove());
                }
            }
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Empty!!");
                return -1;
            }

            if (!q1.isEmpty()) {
                return q1.remove();
            } else {
                return q2.remove();
            }

        }

    }

    public static void main(String[] args) {

        T5_Stack_using_2Queue s = new T5_Stack_using_2Queue();

        Stack stack = s.new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

}
