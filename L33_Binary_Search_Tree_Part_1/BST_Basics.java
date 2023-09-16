package L33_Binary_Search_Tree_Part_1;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
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

    public Node searchBST(Node root, int key) { // O(H)
        if (root == null || root.data == key) {
            return root;
        }
        if (key > root.data) {
            return searchBST(root.right, key);
        } else {
            return searchBST(root.left, key);
        }

    }

    public Node deleteNode(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key == root.data) {
            // Case 1: Deleted Node is a Leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: Deleted Node contains Single Child only
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 3: Deleted Node contains 2 Children
            // Find InOrder Successor: It will be Leftmost Child of Deleted Node's right
            // SubTree
            Node temp = root.right;
            while (temp.left != null) {
                temp = temp.left;
            }
            root.data = temp.data;
            root.right = deleteNode(root.right, temp.data);
        }
        return root;
    }

    // public boolean validateBST(Node root, int min, int max){
    //     if(root==null){
    //         return true;
    //     }
    //     if(root)
        
        
    // }
    
    
}

public class BST_Basics {

    public static void main(String[] args) {

        int[] nodes = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        System.out.println("Build BST");
        BinarySearchTree bst = new BinarySearchTree();
        Node root = bst.buildBST(nodes);
        bst.printInOrder(root);
        System.out.println("\n");

        System.out.println("BST Search");
        Node search = bst.searchBST(root, 4);
        if (search == null) {
        System.out.println("Not Found!!");
        } else {
        System.out.println(search.data + " found at " + search);
        }
        System.out.println();

        System.out.println("BST Delete");
        bst.deleteNode(root, 55);
        bst.printInOrder(root);
        System.out.println("\n");



        // System.out.println(bst.path);

    }
}
