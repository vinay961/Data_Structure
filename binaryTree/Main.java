import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Basic basic = new Basic();
        // basic.buildTree(scanner);
        // basic.prettyDisplay();

        BST bst = new BST();
        bst.insert(20);
        bst.insert(10);
        bst.insert(15);
        bst.insert(25);
        bst.insert(23);
        bst.prettyDisplay();
    }
}