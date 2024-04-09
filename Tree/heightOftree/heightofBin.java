public class heightofBin{
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }   
    }
    // height of tree
    public static int height(Node root){
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }

    // count tree 

    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int lc = countNode(root.left);
        int rc = countNode(root.right);
        return lc + rc +1;
    }

    // sum of nodes 

    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int ls = sum(root.left);
        int rs = sum(root.right);
        return ls + rs + root.data;
    }


    // max diameter 

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int ldiam = diameter(root.left);
        
        int leh = height(root.left);
        int rdiam = diameter(root.right);
        int rih = height(root.right);
        int selfdiam = leh + rih + 1;
        return Math.max(Math.max(rdiam, ldiam), selfdiam);
    }

    // optimised method in which time complexity will be O(n)

    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(5);
        root.right.right = new Node(5);
        System.out.println(height(root));
        System.out.println(countNode(root));
        System.out.println(sum(root));
        System.out.println(diameter(root));
        System.out.println(diameter2(root));

    }
}