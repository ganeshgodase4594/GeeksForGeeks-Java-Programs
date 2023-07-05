

/*

 Delete all occurrences of a given key in a doubly linked list
        MediumAccuracy: 47.61%Submissions: 8K+Points: 4
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        You are given the head of a doubly Linked List and a Key. Your task is to delete all occurrences of the given key and return the new DLL.

        Example:
        Input: 
        2<->2<->10<->8<->4<->2<->5<->2
        2
        Output: 
        10<->8<->4<->5
        Explanation: 
        All Occurences of 2 have been deleted.

 */




package LinkedList.DoublyLinkedList.Medium;


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


public class findAllOccurance {

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
            System.out.print(node.data+" <--->");
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

    static Node deleteAllOccurOfX(Node head, int x) {
        Node node = head;
        while(node!=null){
            if(node.data==x){
                if(node.prev==null){
                    if(node.next==null){
                        return null;
                    }
                    else{
                        head = node.next;
                        node.next.prev = null;
                    }
                }
                
                else if(node.next==null){
                    Node prevNode = node.prev;
                    prevNode.next = null;
                }

                else{

                    Node prevNode = node.prev;
                    node.next.prev = prevNode;
                    prevNode.next = node.next;
                }
            }
            node = node.next;
        }
        return head;
    }
    public static void main(String[] args) {

        Node head = null;
        head = insertAtTail(head, 52);
        

        System.out.println("Before deletion");
        display(head);
        System.out.println("\nAfter Deletion...!");
        head = deleteAllOccurOfX(head, 52);
        display(head);

    }
}

