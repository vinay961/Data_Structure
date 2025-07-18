package linkedList;


public class Main {
    public static void main(String[] args) {
        // SLL singleLinkedList = new SLL();
        // singleLinkedList.insertNodeAtStart(1);
        // singleLinkedList.insertNodeAtStart(2);
        // singleLinkedList.insertNodeAtStart(3);
        // singleLinkedList.insertNodeAtStart(4);
        // singleLinkedList.insertNodeAtLast(5);
        // singleLinkedList.insertNodeAtLast(6);
        // singleLinkedList.insertNodeAnywhere(7, 3);
        // singleLinkedList.deleteNodeByValue(3);

        // singleLinkedList.display();

        DLL doublyLinkedList = new DLL();
        doublyLinkedList.insertAtStart(10);
        doublyLinkedList.insertAtStart(20);
        doublyLinkedList.insertAtStart(30);
        doublyLinkedList.insertAtEnd(40);
        doublyLinkedList.deleteFromStart();
        doublyLinkedList.deleteFromEnd();
        doublyLinkedList.searchNode(30);
        doublyLinkedList.display();
    }
}
