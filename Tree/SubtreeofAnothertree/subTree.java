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
    
}