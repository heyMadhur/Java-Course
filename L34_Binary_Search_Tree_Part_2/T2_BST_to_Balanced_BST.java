package L34_Binary_Search_Tree_Part_2;

import java.util.ArrayList;

public class T2_BST_to_Balanced_BST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    static class BinarySearchTree{
        public Node bstToBalancedBST(Node root){
            // 1. Inorder Sequence in ArrayList
            // 2. Sorted ArrayList -> Balanced BST

            inOrder(root);
            System.out.println(arr);
            root=buildBalancedBST(0, arr.size()-1);

            return root;
            
        }
        ArrayList <Integer> arr= new ArrayList<>();
        public void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            arr.add(root.data);
            inOrder(root.right);
        }
        public Node buildBalancedBST(int start, int end){
            if(start>end){
                return null;
            }
            int mid= (start+end)/2;
            Node root= new Node(arr.get(mid));
            root.left=buildBalancedBST(start, mid-1);
            root.right=buildBalancedBST(mid+1, end);

            return root;
        }

    }

    public static void main(String[] args) {
        Node root= new Node(8);
        root.left= new Node(6);
        root.left.left= new Node(5);
        root.left.left.left= new Node(3);

        root.right= new Node(10);
        root.right.right= new Node(11);
        root.right.right.right= new Node(12);

        BinarySearchTree bst= new BinarySearchTree();
        root=bst.bstToBalancedBST(root);

        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.left.left.data);
        System.out.println(root.left.right.data);
        System.out.println(root.right.data);
        System.out.println(root.right.left.data);
        System.out.println(root.right.right.data);
        
    }
}
