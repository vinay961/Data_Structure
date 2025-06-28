package linkedList;


public class Main {
    public static void main(String[] args) {
        SLL singleLinkedList = new SLL();
        singleLinkedList.insertNodeAtStart(1);
        singleLinkedList.insertNodeAtStart(2);
        singleLinkedList.insertNodeAtStart(3);
        singleLinkedList.insertNodeAtStart(4);
        singleLinkedList.insertNodeAtLast(5);
        singleLinkedList.insertNodeAtLast(6);
        singleLinkedList.insertNodeAnywhere(7, 3);
        singleLinkedList.deleteNodeByValue(3);

        singleLinkedList.display();
    }
}
