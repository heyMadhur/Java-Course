package L34_Binary_Search_Tree_Part_2;

public class T1_sortedArray_to_Balanced_BST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    static class BinarySearchTree {

        // Assuming array is already Sorted
        // MY CODE
        // public Node buildBalancedBST(int[] arr) {
        //     Node root = new Node(Integer.MAX_VALUE);
        //     findMid(root, arr, 0, arr.length - 1);
        //     root = root.left;
        //     return root;
        // }

        // public void findMid(Node root, int[] arr, int start, int end) {
        //     if (start > end)
        //         return;

        //     int mid = (start + end) / 2;
        //     addData(root, arr[mid]);

        //     findMid(root, arr, start, mid - 1);
        //     findMid(root, arr, mid + 1, end);
        // }

        // public Node addData(Node root, int data) {
        //     if (root == null) {
        //         return new Node(data);
        //     }
        //     if (data > root.data) {
        //         root.right = addData(root.right, data);
        //     } else {
        //         root.left = addData(root.left, data);
        //     }
        //     return root;
        // }

        public Node buildBalancedBST(int[] arr, int start, int end) {   //O(n)
            if (start > end) {
                return null;
            }
            int mid = (start + end) / 2;
            Node root = new Node(arr[mid]);
            root.left = buildBalancedBST(arr, start, mid - 1);
            root.right = buildBalancedBST(arr, mid + 1, end);
            return root;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 3, 5, 6, 8, 10, 11, 12 };
        BinarySearchTree bst = new BinarySearchTree();
        Node root = bst.buildBalancedBST(arr, 0, arr.length - 1);
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.left.left.data);
        System.out.println(root.left.right.data);
        System.out.println(root.right.data);
        System.out.println(root.right.left.data);
        System.out.println(root.right.right.data);

    }

}
