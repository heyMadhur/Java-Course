package L34_Binary_Search_Tree_Part_2;

import java.util.ArrayList;

public class T4_Merge_2_BST {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void inOrder(Node root, ArrayList<Integer> arr){
        if(root==null){
            return;
        }

        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);
        
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> ll1, ArrayList<Integer> ll2){
        int i=0, j=0;
        while(i<ll1.size() && j<ll2.size()){
            if(ll1.get(i)<ll2.get(j)){
                i++;
            } else {
                ll1.add(i, ll2.get(j));
                i++;
                j++;
            }
        }

        while(j<ll2.size()) {
            ll1.add(ll2.get(j));
            j++;
        }
        return ll1;
    }

    public static Node toBST(ArrayList<Integer> list, int st, int end){
        if(st>end) return null;

        int mid= (st+end)/2;

        Node root= new Node(list.get(mid));

        root.left= toBST(list, st, mid-1);
        root.right= toBST(list, mid+1, end);

        return root;
    }

    public  static Node merge2BST(Node head1, Node head2){

        ArrayList<Integer> ll1= new ArrayList<>();
        ArrayList<Integer> ll2= new ArrayList<>();

        inOrder(head1, ll1);
        inOrder(head2, ll2);

        ll1= merge(ll1, ll2);

        return toBST(ll1, 0, ll1.size()-1);
    }

    public static void preOrder(Node root){
        if(root==null) return;

        preOrder(root.left);
        System.out.println(root.data);
        preOrder(root.right);
    }

    public static void main(String[] args) {

        Node root1= new Node(20);
        root1.left= new Node(10);
        root1.right= new Node(30);

        Node root2= new Node(15);
        root2.left= new Node(5);
        root2.right= new Node(25);

        Node root3= merge2BST(root1, root2);

        preOrder(root3);
        
    }
    
}
