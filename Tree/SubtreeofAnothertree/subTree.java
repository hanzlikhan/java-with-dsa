import java.util.ArrayList;

import org.w3c.dom.Node;

public class subTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null; // Corrected initialization
            this.right = null; // Corrected initialization
        }
    }

    public static boolean isSubroot(Node root, Node subroot) {
        if (root == null)
            return false;
        if (root.data == subroot.data) {
            if (isIdentical(root, subroot))
                return true;
        }
        return isSubroot(root.left, subroot) || isSubroot(root.right, subroot);
    }

    public static boolean isIdentical(Node n1, Node n2) {
        if (n1 == null && n2 == null) {
            return true;
        } else if (n1 == null || n2 == null || n1.data != n2.data) {
            return false;
        }
        return isIdentical(n1.left, n2.left) && isIdentical(n1.right, n2.right);
    }

    // kth level of a tree
    public static void klevel(Node root,int level,int k){
        if(root == null){
            return;
        }
        if(level == k ){
            System.out.println(root.data);
            return;  // we dont need to go to subtree if we find the kth level
        }
        klevel(root.left, level+1, k);
        klevel(root.right, level+1, k);
    }

    // Lowest commmon ancestor of a tree
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getpath(root,n1,path1);
        getpath(root,n2,path2);
        int i = 0;
        for(;i<path1.size()&& i<path2.size();i++){
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;
    }

    // is subtree of another tree getpath function is a function lowest common ancestor
    public static boolean getpath(Node root,int n, ArrayList<Node>path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean fleft = getpath(root.left, n, path);
        boolean fright = getpath(root.right, n, path);
        if(fleft || fright){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }


    // lowest common ancestor of a tree approach2 

    public static Node lca2(Node root,int n1,int n2){
        // base case 
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftlca = lca2(root.left,n1,n2);
        Node rightlca = lca2(root.right,n1,n2);

        if(leftlca == null){
            return root.right;
        }
        if(rightlca == null){
            return root.left;
        }
        return root;
    }

    // distance between two nodes in a tree
    public static int minDist(Node root,int n1,int n2){
        Node Lca = lca2(root, n1, n2);
        int dis1 = lcaDist(Lca,n1);
        int dis2 = lcaDist(Lca,n1);
        return dis1 + dis2;
    }
    public static int lcaDist(Node root,int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftdis = lcaDist(root.left, n);
        int rightdis = lcaDist(root.right, n);
        if(leftdis == -1 && rightdis == -1){
            return -1;
        }
        else if(leftdis == -1) {
            return rightdis++;
        }else{
            return leftdis++;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // int k = 2;
        // klevel(root, 1, k);

        int n1 = 4,n2 = 7;
        System.out.println(minDist(root, n1, n2));

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);
        // boolean isSubtree = isSubroot(root, subRoot);
        // System.out.println("Is subRoot a subtree of root? " + isSubtree);
    }
}
