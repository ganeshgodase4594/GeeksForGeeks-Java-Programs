

/*
 Reverse a Doubly Linked List
        EasyAccuracy: 70.38%Submissions: 72K+Points: 2
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given a doubly linked list of n elements. The task is to reverse the doubly linked list.

        Example 1:
        Input:
        LinkedList: 3 <--> 4 <--> 5
        Output: 5 4 3

        Example 2:
        Input:
        LinkedList: 75 <--> 122 <--> 59 <--> 196
        Output: 196 59 122 75
 */


package LinkedList.DoublyLinkedList.Easy;

public class reverseLinkedList {

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

    static Node reverseDLL(Node  head){
        Node node = head;
        Node temp = null;
        while(node!=null){

            temp = node.prev;
            node.prev = node.next;
            node.next = temp;
            node = node.prev;
        }

        if(temp!=null){
            head = temp.prev;
        }

        return head;
    }

    public static void main(String[] args) {
        
        Node head = null;
        head = insertAtTail(head, 10);
        head = insertAtTail(head, 20);
        head = insertAtTail(head, 30);
        head = insertAtTail(head, 40);


        display(head);

        head =reverseDLL(head);
        display(head);
    } 
}
