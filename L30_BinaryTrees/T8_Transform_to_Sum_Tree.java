package L30_BinaryTrees;

public class T8_Transform_to_Sum_Tree {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int sumTree(Node root){
        if(root==null){
            return 0;
        }

        int left= sumTree(root.left);
        int right= sumTree(root.right);
        
        int data= root.data;
        root.data= left+right;

        return data + root.data;
    }

    public static void main(String[] args) {
        //      Tree                    Sum Tree
        /*
                1                           27
               / \                         / \
              2   3             --->      9  13       
             / \ / \                     / \ / \ 
            4  5 6  7                   0  0 0  0
        */
        // Min Distance bw 4 and 6 will be 4
        // Min Distance bw 4 and 5 will be 2        

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);

        sumTree(root1);
        System.out.println(root1.data);
        
        
    }
}
