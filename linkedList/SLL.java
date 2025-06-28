package linkedList;
import java.util.LinkedList;

public class SLL {
    private int size;
    private Node head;
    private Node tail;

    private class Node {
        private int value;
        private Node next;

        public Node(int val){
            this.value = val;
        }
        public Node(int val,Node next){
            this.value = val;
            this.next = next;
        }
    }

    public SLL(){
        size = 0;
    }

    public void createList(int[] arr){
        
    }

    public void insertNodeAtStart(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void display(){
        if(head == null){
            System.out.println("LinledList does't exist.");
        }
        display(head);
    }
    private void display(Node head){
        Node temp = head;
        while(temp != null){
            if(temp.value == tail.value){
                System.out.print(temp.value);
            }
            else{
                System.out.print(temp.value + "->");
            }
            temp = temp.next;
        }
        System.out.println();
        System.out.println("head of LL: " + head.value);
        System.out.println("tail of LL: " + tail.value);
        System.out.println("Size of LL: " + size);
    }

    public void insertNodeAtLast(int value){
        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size += 1;
    }

    public void insertNodeAnywhere(int val, int pos){
        Node node = new Node(val);
        Node temp = head;
        if(pos <= size){
            int count = 1;
            while(count < pos-1){
                temp = temp.next;
                count++;
            }
            node.next = temp.next;
            temp.next = node;

            size += 1;
        }
        else{
            System.out.println("Position is out of reach!!");
        }
    }

    public void deleteNodeByValue(int val){
        if(head.value == val){
            head = head.next;
            return;
        }

        Node prev = head;
        Node curr = head.next;
        while(curr != null){
            if(curr.value == val){
                prev.next = curr.next;
            }
        }
        size -= 1;
        System.out.println("Node with value " + val + "is deleted sucessfully.");
    }
    public void deleteNodeByIndex(int pos){
        Node prev = head;
        Node curr = head.next;
        int count = 1;
        if(pos < count || pos > size){
            System.out.println("Given position is out of range.");
            return;
        }
        while(count < pos-1){
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = curr.next;

        size -= 1;
        System.out.println("Node at position " + pos + "is deleted sucessfully.");
    }
}