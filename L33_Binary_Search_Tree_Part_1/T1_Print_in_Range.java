package L33_Binary_Search_Tree_Part_1;

public class T1_Print_in_Range {

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

        public void printInRange(Node root, int k1, int k2) {
            if (root == null) {
                return;
            }
            if (root.data > k2) {
                printInRange(root.left, k1, k2);
            } else if (root.data < k1) {
                printInRange(root.right, k1, k2);
            }

            else if (root.data >= k1 && root.data <= k2) {
                printInRange(root.left, k1, k2);
                System.out.print(root.data + " ");
                printInRange(root.right, k1, k2);
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        BinarySearchTree bst = new BinarySearchTree();
        Node root = bst.buildBST(nodes);

        System.out.println("Print in Range");
        bst.printInRange(root, 1, 7);

    }

}
