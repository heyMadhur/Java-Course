package L30_BinaryTrees;

public class Imp_T7_Kth_Ancestor_Node {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static int kthAncestor(Node root, int n, int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }

        int leftDist= kthAncestor(root.left, n, k);
        int rightDist= kthAncestor(root.right, n, k);
        
        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        int max= Math.max(leftDist, rightDist);
        if(max+1==k){
            System.out.println(root.data);
        }

        return max+1;

        
    }


    public static void main(String[] args) {
        // Tree
        /*
                1           
               / \
              2   3         
             / \ / \ 
            4  5 6  7       
        */
        // 2nd Ancestor of 4 will be 1
        // 1st Ancestor of 6 will be 3        

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);
        
        kthAncestor(root1, 4, 2);

        
    }
    
}
