package L30_BinaryTrees;

public class T1_Diameter_Of_Tree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public int findHeight(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = findHeight(root.left);
            int rh = findHeight(root.right);

            return Math.max(lh, rh) + 1;
        }

        public int findDiameter_Approach1(Node root) { // O(n^2)
            if (root == null) {
                return 0;
            }

            int leftDiameter = findDiameter_Approach1(root.left);
            int rightDiameter = findDiameter_Approach1(root.right);

            int leftHeight = findHeight(root.left);
            int rightHeight = findHeight(root.right);

            int selfDiameter = leftHeight + rightHeight + 1;

            return Math.max(Math.max(leftDiameter, rightDiameter), selfDiameter);
        }

        static class Info {
            int diameter, height;

            Info(int diameter, int height) {
                this.diameter = diameter;
                this.height = height;
            }
        }

        public Info findDiameter(Node root) { // O(n)
            if (root == null) {
                return new Info(0, 0);
            }

            Info l = findDiameter(root.left);
            Info r = findDiameter(root.right);

            int selfDiameter = l.height + r.height + 1;

            int d = Math.max(Math.max(l.diameter, r.diameter), selfDiameter);
            int h = Math.max(l.height, r.height) + 1;

            return new Info(d, h);
        }

    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);

        System.out.println("Diameter (Approach 1)= " + bt.findDiameter_Approach1(root));
        System.out.println("Diameter (Approach 2)= " + bt.findDiameter(root).diameter);

    }
}
