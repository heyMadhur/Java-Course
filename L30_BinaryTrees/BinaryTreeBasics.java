package L30_BinaryTrees;

import java.util.*;

public class BinaryTreeBasics {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }

        // Tree Traversal
        public void preOrderTraversal(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }

            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        public void inOrderTraversal(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }

            preOrderTraversal(root.left);
            System.out.print(root.data + " ");
            preOrderTraversal(root.right);
        }

        public void postOrderTraversal(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }

            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
            System.out.print(root.data + " ");
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

        public int findHeight(Node root) {
            if (root == null) {
                return 0;
            }

            int rightHeight = findHeight(root.right);
            int leftHeight = findHeight(root.left);
            int h = Math.max(leftHeight, rightHeight) + 1;

            return h;
        }

        public int countNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftNodes = countNodes(root.left);
            int rightNodes = countNodes(root.right);

            return leftNodes + rightNodes + 1;
        }

        public int sumNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSum = sumNodes(root.left);
            int rightSum = sumNodes(root.right);

            return leftSum + rightSum + root.data;

        }

    }

    public static void main(String[] args) {

        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);
        // System.out.println(root.data);
        System.out.print("Pre Order Traversal= ");
        bt.preOrderTraversal(root);
        System.out.println();
        System.out.print("In Order Traversal= ");
        bt.inOrderTraversal(root);
        System.out.println();
        System.out.print("Post Order Traversal= ");
        bt.postOrderTraversal(root);
        System.out.println();
        System.out.println("Level Order Traversal-: ");
        bt.levelOrderTraversal(root);
        System.out.print("Height= " + bt.findHeight(root));
        System.out.println();
        System.out.print("Total Nodes= " + bt.countNodes(root));
        System.out.println();
        System.out.print("Sum Nodes= " + bt.sumNodes(root));

    }

}
