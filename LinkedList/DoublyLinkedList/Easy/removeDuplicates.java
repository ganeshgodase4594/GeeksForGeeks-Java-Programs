
/*
Remove duplicates from a sorted doubly linked list
    BasicAccuracy: 52.63%Submissions: 6K+Points: 1
    Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

    Given a doubly linked list of n nodes sorted by values, the task is to remove duplicate nodes present in the linked list.

    Example 1:
    Input:
    n = 6
    1<->1<->1<->2<->3<->4
    Output:
    1<->2<->3<->4
    Explanation:
    Only the first occurance of node with value 1 is 
    retained, rest nodes with value = 1 are deleted.


    Example 2:
    Input:
    n = 7
    1<->2<->2<->3<->3<->4<->4
    Output:
    1<->2<->3<->4
    Explanation:
    Only the first occurance of nodes with values 2,3 and 4 are 
    retained, rest repeating nodes are deleted.

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


public class removeDuplicates {

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

    static Node removeDuplicatesNode(Node head){

        Node node = head;
        while(node.next!=null){
            if(node.data==node.next.data){
                if(node.prev==null){
                    node.next.prev = null;
                    head = node.next;
                }

                else{
                    node.prev.next = node.next;
                    node.next.prev = node.prev;
                }
            }
            node = node.next;
        }
        return head;
        
    }

    public static void main(String[] args) {

        Node head = null;

        head = insertAtTail(head, 1);
        head = insertAtTail(head, 2);
        head = insertAtTail(head, 3);
        head = insertAtTail(head, 3);
        head = insertAtTail(head, 4);
        head = insertAtTail(head, 4);

        display(head);

        head = removeDuplicatesNode(head);
        display(head);


    }
}




