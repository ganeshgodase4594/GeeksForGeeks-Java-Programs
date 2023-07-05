

/*
 
Doubly linked list Insertion at given position
        BasicAccuracy: 47.13%Submissions: 60K+Points: 1
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given a doubly-linked list, a position p, and an integer x. The task is to add a new node with value x at the position just after pth node in the doubly linked list.

        Example 1:
        Input:
        LinkedList: 2<->4<->5
        p = 2, x = 6 
        Output: 2 4 5 6
        Explanation: p = 2, and x = 6. So, 6 is
        inserted after p, i.e, at position 3
        (0-based indexing).


        Example 2:
        Input:
        LinkedList: 1<->2<->3<->4
        p = 0, x = 44
        Output: 1 44 2 3 4
        Explanation: p = 0, and x = 44 . So, 44
        is inserted after p, i.e, at position 1
        (0-based indexing).


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

public class InsertAtPosition {

    static void addNode(Node head_ref, int pos, int data)
	{   
        Node  newNode = new Node(data);
		Node node = head_ref;
        if(head_ref==null){
            head_ref = newNode;
        } 

        else{
            int count =0 ;
            while(node.next !=null){
                if(count==pos){
                    break;
                }
                count++;
                node = node.next;
            }

            Node nextNode = null;
            if(node.next ==null){
                node.next = newNode;
                newNode.prev = node;
            }
            else{

                nextNode = node.next;
                nextNode.prev = newNode;
                newNode.next = nextNode;
                node.next = newNode;
                newNode.prev  =node;
            }

        }

	}

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
    public static void main(String[] args) {
        Node head = null;
        head = insertAtTail(head, 10);
        head = insertAtTail(head, 20);
        head = insertAtTail(head, 30);
        head = insertAtTail(head, 40);

        addNode(head, 2, 35);

        display(head);
    }
}
