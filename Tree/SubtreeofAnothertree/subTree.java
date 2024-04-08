public class subTree{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            Node left = null;
            Node right = null;
        }
    }
    public static boolean isSubroot(Node root,Node subroot){
        if (root.data == subroot.data) {
            if(isIdentical(root,subroot)) return true;
        }
        // boolean leftans = isSubroot(root.left , subroot);
        // boolean rightans = isSubroot(root.right , subroot);
        // return leftans || rightans;
        return isSubroot(root.left , subroot) || isSubroot(root.right , subroot);
    }
    public static boolean isIdentical(Node n1, Node n2)  {
        /* both empty */
        if (n1==null && n2 ==  null) {
            return true;
        }else if (n1 == null || n2 == null || n1.data != n2.data) {
            return false;
        }
        if (!isIdentical(n1.left, n2)) {
            return false;
        }
        if(!isIdentical(n1.right, n2)){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.left = new Node(5);
    isSubroot(root, subRoot);
    }
}