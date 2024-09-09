package L30_BinaryTrees;

public class T2_Subtree_of_a_Tree {

    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static boolean isIdentical(Node root, Node subRoot){
        
        if(root==null && subRoot==null){
            return true;
        }

        if(root==null || subRoot==null || root.data!=subRoot.data  ){
            return false;
        }
        if( !isIdentical(root.left, subRoot.left)) return false;
        if(!isIdentical(root.right, subRoot.right)) return false;

        return true;        
    }

    public static boolean checkSubTree(Node root, Node subRoot){
        // Work of this Function is to find the Node where Root data and subRoot Data is equal
        if(root==null){
            return false;
        }

        if(root.data==subRoot.data){
            if (isIdentical(root, subRoot)){
                return true;
            }
        }

        return checkSubTree(root.left, subRoot) || checkSubTree(root.right, subRoot); 
    }




    public static void main(String[] args) {
        
        // Main Tree
        /*
                1
               / \
              2   3
             / \ / \ 
            4  5 6  7 
        */
        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(2);
        root.left.left.left= new Node(4);
        root.left.left.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);
        
        // Sub Tree
        /*
              2
             / \
            4   5
        */ 
        Node subRoot= new Node(2);
        subRoot.left= new Node(4);
        subRoot.right= new Node(5);

        System.out.println(checkSubTree(root, subRoot));
        
    }
    
}
