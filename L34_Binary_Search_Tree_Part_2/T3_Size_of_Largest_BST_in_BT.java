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
        private class Info{
            int size, max, min;
            boolean isBST;
            public Info(int size, int min, int max, boolean isBST){
                this.isBST= isBST;
                this.size= size;
                this.min= min;
                this.max= max;
            }
        }
        private int maxSize=0;
        public Info largestBST(Node root){
            if(root==null){
                return new Info(0, Integer.MAX_VALUE, Integer.MIN_VALUE, true);
            }
            Info left= largestBST(root.left);
            Info right= largestBST(root.right);

            int size= left.size + right.size +1;
            int max= Math.max(root.data, Math.max(left.max, right.max));
            int min= Math.min(root.data, Math.min(left.min, right.min));

            if(root.data<=left.max || root.data>=right.min){
                return new Info(size, min, max, false);
            }
            if(left.isBST && right.isBST){
                maxSize= Math.max(maxSize, size);
                return new Info(size, min, max, true);
            }
            
            return new Info(size, min, max, false);
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
        bst.largestBST(root);
        System.out.println(bst.maxSize);
        
    }
    
}
