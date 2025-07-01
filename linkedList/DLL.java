package linkedList;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }
        public Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertAtStart(int val){
        Node node = new Node(val);
        node.prev = null;
        node.next = head;
        if(head != null){
            head.prev = node;
        }
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insertAtEnd(int val){
        Node node = new Node(val);
        tail.next = node;
        if(tail != null){
            node.prev = tail;
        }

        tail = node;

        if(head == null){
            head = tail;
        }

        size += 1;
    }

    public void deleteFromStart(){
        if(head != null){
            head.next.prev = null;
            Node temp = head.next;
            head.next = null;
            head = temp;

            size -= 1;
        }
    }

    public void deleteFromEnd(){
        if(tail != null){
            tail.prev.next = null;
            Node temp = tail.prev;
            tail.prev = null;
            tail = temp;

            size -= 1;
        }
    }

    public void searchNode(int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                System.out.println("Value Found!");
                return;
            }
            temp = temp.next;
        }
        System.out.println(val + " is not in the list.");
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty.");
        }
        else{
            display(head);
        }
    }

    private void display(Node temp){
        while(temp != null){
            if(temp.data == tail.data){
                System.out.print(temp.data);
                temp = temp.next;
            }
            else{
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
        }
        System.out.println();
        System.out.println("Size of List: " + size);
        System.out.println("Head of list: " + head.data);
        System.out.println("Tail of list: " + tail.data);
    }

    public DLL(){
        size = 0;
    }
}
