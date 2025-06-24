import java.util.Scanner;

public class Basic {
    private static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    private Node root;

    public void buildTree(Scanner scanner){
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        buildTree(root, scanner);
    }
    private void buildTree(Node node,Scanner scanner){
        System.out.println("Do you want to enter value on left of: " + node.data);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value: ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            buildTree(node.left,scanner);
        }

        System.out.println("Do you want to enter value on right of: " + node.data);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value: ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            buildTree(node.right,scanner);
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