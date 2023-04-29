package L30_BinaryTrees;

import java.util.*;

public class T3_Top_View_of_Tree {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        int hd; // Horizontal Distance
        Node node;

        public Info(Node node, int hd) {
            this.hd = hd;
            this.node = node;
        }
    }

    public static void printTopView(Node root) {
        if (root == null) {
            return;
        }
        
        HashMap<Integer, Node> map = new HashMap<>();
        Queue<Info> q = new LinkedList<>();
        int max = 0, min = 0;

        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }

            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd-1));
                min = Math.min(min, curr.hd-1);
            }
            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd+1));
                max = Math.max(max, curr.hd+1);
            }
        }
        // Printing Top View
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // For Tree
        /*
              1
             / \
            2   3
             \
              4
               \
                5
                 \
                  6
        */
        // Top View= {2,1,3,6}
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        
        printTopView(root);
        
        // For Tree
        /*
                1
               / \
              2   3
             / \ / \ 
            4  5 6  7
        */
        // Top View= {4,2,1,3,7}

        Node root1= new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);
        printTopView(root1);        

    }

}
