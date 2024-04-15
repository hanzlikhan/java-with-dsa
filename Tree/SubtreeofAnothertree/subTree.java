import java.util.ArrayList;

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
    public static Node lca(node root,int n1,int n2){
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

        int n1 = 4,n2 = 5;
        System.out.println(lca(root, n1, n2));

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);
        // boolean isSubtree = isSubroot(root, subRoot);
        // System.out.println("Is subRoot a subtree of root? " + isSubtree);
    }
}
