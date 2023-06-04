package L30_BinaryTrees.Assignment;

public class Q1 {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean checkUniValued(Node root){
        if(root==null){
            return true;
        }

        if(root.left!=null && root.data!=root.left.data)
            return false;

        if(root.right!=null && root.data!=root.right.data)
            return false;
        

        return checkUniValued(root.left) && checkUniValued(root.right);
    }

    public static void main(String[] args) {
        // Q1 Check if a Binary Tree is univalued or not
        // We have a binary tree, the task is to check if the binary tree is univalued or not. If found to be true,  then print “YES”. Otherwise, print “NO”.

                // Tree
        /*
                1           
               / \
              1   1         
             / \ / \ 
            1  1 1  1       
        */
        // Yes It is Univalued

        Node root1 = new Node(1);
        root1.left = new Node(1);
        root1.right = new Node(1);
        root1.left.left = new Node(1);
        root1.left.right = new Node(1);
        root1.right.left = new Node(1);
        root1.right.right = new Node(1);
        
        System.out.println(checkUniValued(root1));
        
    }
    
}
