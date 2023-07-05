
/*
 Delete node in Doubly Linked List
            BasicAccuracy: 42.98%Submissions: 66K+Points: 1
            Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

            Given a doubly linked list and a position. The task is to delete a node from given position in a doubly linked list.

            Example 1:
            Input:
            LinkedList = 1 <--> 3 <--> 4 
            x = 3
            Output: 1 3  
            Explanation: After deleting the node at
            position 3 (position starts from 1),
            the linked list will be now as 1->3.

            Example 2:
            Input:
            LinkedList = 1 <--> 5 <--> 2 <--> 9  
            x = 1
            Output: 5 2 9
 */





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

public class deleteAtPosition {

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

    static Node deleteNode(Node head,int x){
        Node node = head;

        if(head==null){
            return head;
        }

        int count=0;
        while(node!=null){
            if(count==x-1){
                break;
            }
            count++;
            node = node.next;
        }

        if(x==1){
            head = node.next;
            return head;
        }

        if(node.next == null){
            Node prevNode = node.prev;
            prevNode.next = null;
            return head;
        }

        Node prevNode = node.prev;
        node.next.prev = prevNode;
        prevNode.next = node.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtTail(head, 10);
        head = insertAtTail(head, 20);
        head = insertAtTail(head, 30);
        head = insertAtTail(head, 40);

        display(head);

        head = deleteNode(head, 2);
        display(head);
    }

}
