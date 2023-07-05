package LinkedList.DoublyLinkedList.Easy;



class Node {

    int data;
    Node  next;
    Node  prev;
    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
} 


public class Insertion {

    static Node insertAtTail(Node head, int data) {

        Node  newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node node = head;
        while (node . next != null) {
            node = node . next;
        }
        node . next = newNode;
        newNode . prev = node;
        return head;
    }

    static void display(Node head){
        Node node = head;

        while(node!=null){
            System.out.print(node.data+" -->");
            node = node.next;
        }
    }

    static Node insertAthead(Node head,int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return head;
        }

            Node node = head;
            node.prev = newNode;
            newNode.next = node;
            head = newNode;
            return head;
        
    }
    public static void main(String[] args) {

        Node head = null;
        head = insertAtTail(head, 10);
        head = insertAtTail(head, 20);
        head = insertAtTail(head, 30);
        head = insertAtTail(head, 40);

        head = insertAthead(head, 00);

        display(head);

    }
}
