package L34_Binary_Search_Tree_Part_2;

public class T3_Size_of_Largest_BST_in_BT {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    static class BinarySearchTree{
        int countLargestBST=0;
        public boolean largestBST(Node root, int min, int max){
            if(root==null){
                countLargestBST++;
                System.out.println(countLargestBST);
                return true;
            }
            if(root.data<min || root.data>max){
                countLargestBST=0;
                System.out.println(countLargestBST);
                return false;
            }
            return largestBST(root.left, min, root.data) && largestBST(root.right, root.data, max);
        }
    }

    public static void main(String[] args) {
        Node root= new Node(50);
        root.left= new Node(30);
        root.left.left= new Node(5);
        root.left.right= new Node(20);
        
        root.right= new Node(60);
        root.right.left= new Node(45);
        root.right.right= new Node(70);
        root.right.right.left= new Node(65);
        root.right.right.right= new Node(80);

        BinarySearchTree bst= new BinarySearchTree();
        bst.largestBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(bst.countLargestBST);
        
    }
    
}
