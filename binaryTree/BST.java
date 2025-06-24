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

    public void isBalanced(){
        if(isBalanced(root)){
            System.out.println("Tree is balanced.");
        }
        else{
            System.out.println("Tree is not balanced.");
        }
    }
    private boolean isBalanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right)) <= 1 && (isBalanced(node.left) && isBalanced(node.right));
    }

    public void search(int value){
        search(root,value);
    }
    private void search(Node node, int value){
        if(node == null){
            System.out.println("Value not found!");
            return;
        }
        if(node.data == value){
            System.out.println("Value found!!");
        }
        if(node.data > value){
            search(node.left, value);
        }
        if(node.data < value){
            search(node.right, value);
        }
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
