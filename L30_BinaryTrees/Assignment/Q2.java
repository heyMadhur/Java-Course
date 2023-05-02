package L30_BinaryTrees.Assignment;

import java.util.*;

public class Q2 {
    
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node invertBinaryTree(Node root){
        if(root==null){
            return null;
        }

        Node left= invertBinaryTree(root.left);
        Node right= invertBinaryTree(root.right);
        
        // Swapping Nodes
        root.left= right;
        root.right= left;

        return root;
    }

    public static void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node temp = q.remove();
            if (temp == null) {
                if (!q.isEmpty())
                    q.add(null);
                System.out.println();
                continue;
            }
            if (temp.left != null)
                q.add(temp.left);

            if (temp.right != null)
                q.add(temp.right);
            System.out.print(temp.data + " ");

        }
    }

    public static void main(String[] args) {
        // Q2 Invert Binary Tree
        // Mirror of a Tree: Mirror of a Binary Tree T is another Binary Tree M(T) with left and right children of all non-leaf nodes interchanged.

        //      Tree                    Invert Binary Tree
        /*
                1                           1
               / \                         / \
              2   3             --->      3   2       
             / \ / \                     / \ / \ 
            4  5 6  7                   7  6 5  4
        */

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);
        
        invertBinaryTree(root1);
        levelOrderTraversal(root1);
        
        
    }
}
