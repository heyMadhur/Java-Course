package L33_Binary_Search_Tree_Part_1;

import java.util.*;

public class T3_Mirror_a_BST {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinarySearchTree {

        public Node buildBST(int[] arr) {
            Node root = new Node(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                addData(root, arr[i]);
            }
            return root;
        }

        public Node addData(Node root, int data) {

            if (root == null) {
                return new Node(data);
            }

            if (data > root.data) {
                root.right = addData(root.right, data);
            } else {
                root.left = addData(root.left, data);
            }
            return root;
        }

        public void printInOrder(Node root) {
            if (root == null) {
                return;
            }
    
            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);
    
        }
        public void levelOrderTraversal(Node root) {
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

        // public void mirrorBST(Node root) {
        //     if (root == null) {
        //         return;
        //     }
        //     mirrorBST(root.left);
        //     mirrorBST(root.right);
        //     Node temp = root.left;
        //     root.left = root.right;
        //     root.right = temp;
        // }
        public Node mirrorBST(Node root) {  // O(n)
            if (root == null) {
                return null;
            }
            Node ls= mirrorBST(root.left);  // Left Subtree Mirror Image
            Node rs= mirrorBST(root.right); // Right Subtree Mirror Image

            root.left = rs;
            root.right = ls;
            return root;
        }

    }

    public static void main(String[] args) {
        int[] nodes = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        BinarySearchTree bst = new BinarySearchTree();
        Node root = bst.buildBST(nodes);

        System.out.println("Before Mirror");
        bst.levelOrderTraversal(root);
        bst.mirrorBST(root);
        System.out.println("\nAfter Mirror");
        bst.levelOrderTraversal(root);
        
    }

}
