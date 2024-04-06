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
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinTree tree = new BinTree();
        Node root = tree.buildBinary(nodes);
        System.out.println("Inorder root: " + root.data);
    }
}
