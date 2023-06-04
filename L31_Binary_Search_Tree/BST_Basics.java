package L31_Binary_Search_Tree;

public class BST_Basics {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static class BinarySearchTree {

        public Node addData(Node root, int value) {
            if (root == null) {
                return new Node(value);
            }
            if (value < root.data) {
                root.left = addData(root.left, value);

            } else {
                root.right = addData(root.right, value);
            }
            return root;
        }

        // public void addData(Node root, int value) {
        //     if (value < root.data) {
        //         if (root.left != null)
        //             addData(root.left, value);
        //         else {
        //             root.left = new Node(value);
        //             return;
        //         }

        //     } else {
        //         if (root.right != null)
        //             addData(root.right, value);
        //         else {
        //             root.right = new Node(value);
        //             return;
        //         }
        //     }
        // }

        public Node buildTree(int[] nodes) {
            Node root = new Node(nodes[0]);
            for (int i = 1; i < nodes.length; i++) {
                addData(root, nodes[i]);
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

    }

    public static void main(String[] args) {

        int[] nodes = { 5, 1, 3, 4, 2, 7 };
        BinarySearchTree bst = new BinarySearchTree();
        Node root = bst.buildTree(nodes);
        System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.right.data);

        bst.printInOrder(root);

    }
}
