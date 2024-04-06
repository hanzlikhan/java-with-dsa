import java.util.*;
public class BinaryTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinTree {
        static int idx = -1;

        public Node buildBinary(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildBinary(nodes);
            newNode.right = buildBinary(nodes);
            return newNode;
        }

        // preorder
        public static void preorder(Node root){
            if(root==null){
               return;
            }   
            System.out.print(root.data +" ");
            preorder(root.left);
            preorder(root.right);
               
           }

        //    inorder
           public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data +" ");
            inorder(root.right);
           }

        //    postorder
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data +" ");
            
           }
           // level order traversal
           public static void Levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode==null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        return;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" "); 
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }if (currNode.right !=null) {
                        q.add(currNode.right);
                        
                    }
                }
            }
            
           }
    }
    

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinTree tree = new BinTree();
        Node root = tree.buildBinary(nodes);
        System.out.println("Inorder root: " + root.data);
        tree.Levelorder(root);
    }
    
}
