package L30_BinaryTrees;

import java.util.ArrayList;

public class Imp_T5_Lowest_Common_Ancestor {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Approach-1
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null)
            return false;

        path.add(root);

        if (root.data == n)
            return true;

        boolean left = getPath(root.left, n, path);
        boolean right = getPath(root.right, n, path);

        // if (left == false && right == false) {
        // path.remove(path.size() - 1);
        // return false;
        // }
        // return true;

        // Or

        if (left || right)
            return true;

        path.remove(path.size() - 1);
        return false;

    }

    public static Node lca_app1(Node root, int n, int m) { // TC- O(n) SC- O(n)
        if (root == null) {
            return root;
        }

        ArrayList<Node> path_n = new ArrayList<>();
        ArrayList<Node> path_m = new ArrayList<>();

        getPath(root, n, path_n);
        getPath(root, m, path_m);

        Node lcaNode = null;

        int i = 0;
        while (i < path_n.size() && i < path_m.size()) {
            if (path_m.get(i) != path_n.get(i)) { // No more Common Ancestor can be found
                break;
            }
            i++;
        }

        lcaNode = path_m.get(i - 1); // Reason- (ith position is enequal, thats why prev pos was taken)

        return lcaNode;
    }

    public static Node lca_app2(Node root, int n, int m) { // TC- O(n) SC- O(1)
        if (root == null || root.data == n || root.data == m) {
            return root;
        }

        Node left = lca_app2(root.left, n, m);
        Node right = lca_app2(root.right, n, m);

        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        return root;

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
        // LCA for 4 and 6 will be 1
        // LCA for 4 and 5 will be 2

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);

        Node lca = lca_app1(root1, 4, 6);
        Node lca1 = lca_app1(root1, 4, 5);
        System.out.println("LCA for 4 and 6 will be " + lca.data);
        System.out.println("LCA for 4 and 5 will be " + lca1.data);

        System.out.println();

        Node lca2 = lca_app2(root1, 4, 6);
        Node lca3 = lca_app2(root1, 4, 5);
        System.out.println("LCA for 4 and 6 will be " + lca2.data);
        System.out.println("LCA for 4 and 5 will be " + lca3.data);
    }

}
