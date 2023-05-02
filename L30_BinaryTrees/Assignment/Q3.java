package L30_BinaryTrees.Assignment;

import java.util.*;

public class Q3 {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static Node deleteX(Node root, int x){
        if(root==null){
            return null;
        }

        root.left= deleteX(root.left, x);
        root.right= deleteX(root.right, x);


        if(root.left==null && root.right==null && root.data==x){
            return null;
        }

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
        // Q3 Delete leaf nodes with values as x
        // We have a binary tree and a target integer x, delete all the leaf nodes having value as x. Also, delete the newly formed leaves with the target value as x.
        
        //      Tree                    Deleted Binary Tree
        /*
                1                           1
               / \                         / \
              2   3             --->      2   3       
             / \ / \                      \  /  
            3  5 6  3                     5 6  
        */

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(3);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(3);        

        deleteX(root1, 3);
        levelOrderTraversal(root1);
        
        
        
    }
    
}
