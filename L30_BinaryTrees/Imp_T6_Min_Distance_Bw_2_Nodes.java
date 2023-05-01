package L30_BinaryTrees;

public class Imp_T6_Min_Distance_Bw_2_Nodes {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca(Node root, int n, int m) {
        if (root == null || root.data == m || root.data == n)
            return root;

        Node left = lca(root.left, n, m);
        Node right = lca(root.right, n, m);

        if (left == null)
            return right;

        if (right == null)
            return left;

        return root;
    }

    public static int calcDist(Node root, int n) {
        if (root == null)
            return -1;

        if (root.data == n)
            return 0;

        int left = calcDist(root.left, n);
        int right = calcDist(root.right, n);

        if (left == -1)
            return right+1;

        if(right==-1)
            return left+1;

        return -1;
    }

    public static int minDist(Node root, int n, int m) {
        Node lca_node = lca(root, n, m);

        int dis1 = calcDist(lca_node, n);
        int dis2 = calcDist(lca_node, m);

        return dis1 + dis2;
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
        // Min Distance bw 4 and 6 will be 4
        // Min Distance bw 4 and 5 will be 2        

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);

        System.out.println(minDist(root1, 4, 6));
        System.out.println(minDist(root1, 4, 5));

    }

}
