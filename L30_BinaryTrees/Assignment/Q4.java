package L30_BinaryTrees.Assignment;

public class Q4 {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    

    public static void main(String[] args) {
        // Q4 Find All Duplicate Subtrees
        // We have a binary tree, find all duplicate subtrees. For each duplicate subtree, we only need to return the root node of any one of them. Two trees are duplicates if they have the same structure with the same node values.
        
        // Tree
        /*
                1           
               / \
              4   3         
             /   / \ 
            3   4  3       
        */
        // LCA for 4 and 6 will be 1
        // LCA for 4 and 5 will be 2

        Node root1 = new Node(1);
        root1.left = new Node(4);
        root1.right = new Node(3);
        root1.left.left = new Node(3);
        root1.right.left = new Node(4);
        root1.right.right = new Node(3);        

    }
    
}
