package L33_Binary_Search_Tree_Part_1;

public class Imp_T3_Validate_BST {

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

        public boolean validateBST(Node root, int min, int max) {
            if (root == null) {
                return true;
            }
            if (root.data >= max || root.data <= min) {
                return false;
            }
            return validateBST(root.left, min, root.data) && validateBST(root.right, root.data, max);
        }

        public boolean validateBST(Node root, Node min, Node max) {
            if (root == null) {
                return true;
            }

            if(min!=null && root.data <= min.data){
                return false;
            }

            if(max!=null && root.data >= max.data){
                return false;
            }

            return validateBST(root.left, min, root) && validateBST(root.right, root, max);

        }

        // Validate BST using Inorder Traversal
        public boolean validateBST(Node root){
            return inOrderTraversal(root, Integer.MIN_VALUE);
        }

        public boolean inOrderTraversal(Node root, int prev){
            if(root==null) return true;

            inOrderTraversal(root.left, prev);
            if(prev>root.data) return false;
            prev= root.data;
            inOrderTraversal(root.right, prev);
            return true;
        }

    }

    public static void main(String[] args) {
        int[] nodes = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        BinarySearchTree bst = new BinarySearchTree();
        Node root = bst.buildBST(nodes);

        // For this 1st Code, take help from https://www.youtube.com/watch?v=f-sj7I5oXEI
        System.out.println(bst.validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));    // Yt Code
        System.out.println(bst.validateBST(root, null, null));  // Apna College Code
        System.out.println(bst.validateBST(root));  // InOrder Code

    }

}
