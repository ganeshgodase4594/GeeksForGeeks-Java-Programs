package LinkedList.SinglyLinkedList.Basic;


class Node{

    int val;
    Node next;
    Node(int x){
        val = x;
        next = null;

  }

}

public class InsertNode {

    static void display(Node head){
        Node node = head;

        while(node !=null){
            System.out.print(node.val+"-->");
            node = node.next;
        }

        // System.out.println("null");
    }

    static Node insertFirst(int data,Node head){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }

        else{

            newNode.next = head;
            head = newNode;
        }

        return head;
    }

    static Node insertLast(int data,Node head){
        Node node = head;
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }

        else{

            while(node.next!=null){
                node = node.next;
            }
    
            node.next = newNode;
            newNode.next=null;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertFirst(40, head);
        head = insertFirst(30, head);
        head = insertFirst(20, head);
        head = insertFirst(10, head);
        System.out.println("LinkedList before inserting 0 at beginning : ");
        display(head);
        head = insertFirst(0, head);
        System.out.println("LinkedList after inserting 0 at beginning : ");
        display(head);

        head = insertLast(50, head);
        System.out.println("LinkedList after inserting 50 at Last : ");
        display(head);
    }
}
