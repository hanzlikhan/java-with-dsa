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


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 2;
        klevel(root, 1, k);

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);
        // boolean isSubtree = isSubroot(root, subRoot);
        // System.out.println("Is subRoot a subtree of root? " + isSubtree);
    }
}
