public class BST {
    private static class Node{
        int data;
        int height;
        Node left;
        Node right;

        public Node(int value){
            this.data = value;
        }
    }

    private Node root;

    public BST(){
        root = null;
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public void insert(int value){
        root = insert(value, root);
    }
    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(node.data > value){
            node.left = insert(value, node.left);
        }
        if(node.data < value){
            node.right = insert(value, node.right);
        }
        // while inserting each time height will get updated,so need to change always.
        node.height = Math.max(height(node.left), height(node.right));
        return node;
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }
    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.data);
        } else {
            System.out.println(node.data);
        }
        prettyDisplay(node.left, level + 1);
    }
}
