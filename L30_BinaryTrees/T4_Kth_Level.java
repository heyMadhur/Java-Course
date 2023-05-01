package L30_BinaryTrees;

import java.util.*;

public class T4_Kth_Level{

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Recursive Approach
    public static void printLevel_Recursive(Node root, int level, int K){
        if(root==null){
            return;
        }
        if(K==level){
            System.out.print(root.data+" ");
            return;
        }
        printLevel_Recursive(root.left, level+1, K );
        printLevel_Recursive(root.right, level+1, K );
    }

    // Iterative Approach

    static class Info{
        int level;
        Node node;
        public Info(Node node, int level){
            this.node= node;
            this.level= level;
        }
    }
    public static void printLevel_Iteratively(Node root, int K){

        Queue <Info> q= new LinkedList<>();
        q.add(new Info(root, 1));

        while(!q.isEmpty()){
            Info curr= q.remove();

            if(curr.level==K){
                System.out.print(curr.node.data+" ");
            }

            if(curr.node.left!=null)
                q.add(new Info(curr.node.left, curr.level+1));
            if(curr.node.right!=null)
                q.add(new Info(curr.node.right, curr.level+1));
        }
        

    }


    public static void main(String[] args) {
        // Tree
        /*
                1           -L1
               / \
              2   3         -L2
             / \ / \ 
            4  5 6  7       -L3
        */
        // K=3 
        // Output= {4,5,6,7}

        Node root1= new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);
        System.out.print("Recursive Approach= ");
        printLevel_Recursive(root1, 1, 3);
        System.out.println();
        System.out.print("Iterative Approach= ");
        printLevel_Iteratively(root1, 3);



        
    }
}



