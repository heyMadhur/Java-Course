package L33_Binary_Search_Tree_Part_1;

import java.util.ArrayList;

public class T2_Root_to_Leaf {

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

        ArrayList<Integer> path = new ArrayList<>();

        public void printPaths(Node root) {
            if (root == null) {
                return;
            }

            path.add(root.data);
            if (root.left == null && root.right == null) { // We have Reached Leaf Child
                System.out.println(path);
            }
            printPaths(root.left);
            printPaths(root.right);

            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        BinarySearchTree bst = new BinarySearchTree();
        Node root = bst.buildBST(nodes);
        System.out.println("Root to Leaf Paths");
        bst.printPaths(root);
    }

}
