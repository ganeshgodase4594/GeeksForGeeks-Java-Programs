
/*
Finding middle element in a linked list
        EasyAccuracy: 57.93%Submissions: 263K+Points: 2
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given a singly linked list of N nodes.
        The task is to find the middle of the linked list. For example, if the linked list is
        1-> 2->3->4->5, then the middle node of the list is 3.
        If there are two middle nodes(in case, when N is even), print the second middle element.
        For example, if the linked list given is 1->2->3->4->5->6, then the middle node of the list is 4.

        Example 1:
        Input:
        LinkedList: 1->2->3->4->5
        Output: 3 
        Explanation: 
        Middle of linked list is 3.

        Example 2: 
        Input:
        LinkedList: 2->4->6->7->5->1
        Output: 7 
        Explanation: 
        Middle of linked list is 7.

 */




package LinkedList.DoublyLinkedList.Easy;



// class Node {

//     int data;
//     Node  next;
//     Node  prev;
//     Node(int x) {
//         data = x;
//         next = null;
//         prev = null;
//     }
// } 


public class getMiddle {

    static int getMiddle1(Node head){

        Node node = head;
        int count = 0;
        while(node!=null){
            count++;
            node = node.next;
        }

        int pos = count/2+1;


        int count1 = 1;
        Node node1 = head;
        while(node1!=null){

            if(count1 == pos){
                break;
            }
            count1++;
            node1 = node1.next;
        }
       
        return node1.data;
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
        head = insertAtTail(head, 50);

        display(head);

        System.out.println(getMiddle1(head));

    }
}



