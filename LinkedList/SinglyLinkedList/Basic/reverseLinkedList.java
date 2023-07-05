

/*
 
Reverse a linked list
        EasyAccuracy: 73.11%Submissions: 248K+Points: 2
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given a linked list of N nodes. The task is to reverse this list.

        Example 1:
        Input:
        LinkedList: 1->2->3->4->5->6
        Output: 6 5 4 3 2 1
        Explanation: After reversing the list, 
        elements are 6->5->4->3->2->1.


        Example 2:
        Input:
        LinkedList: 2->7->8->9->10
        Output: 10 9 8 7 2
        Explanation: After reversing the list,
        elements are 10->9->8->7->2.

 */





package LinkedList.SinglyLinkedList.Basic;

  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

public class reverseLinkedList {
    static boolean searchKey(int n, Node head, int key) {

        Node node = head;

        while(node!=null){
            if(node.data == key){
                return true;
            }
            node = node.next;
        }
        return false;
    }
    public static int getCount(Node head)
    {

        int count =0;

        if(head==null){
            return count;
        }
        Node node = head;

        while(node!=null){
            node = node.next;
            count++;
        }
        return count;
    }

    public static Node insert(Node head,int data){

        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
        }


        else{
            Node node = head;
            while(node.next!=null){
                node = node.next;
            }

            node.next = newNode;
            newNode.next = null;
        }

        return head;
    }

    static void display(Node head){
        Node node = head;

        while(node!=null){
            System.out.print(node.data+"-->");
            node = node.next;
        }
    }

     static Node reverseList(Node head){

        Node node = head;
        Node prev = null;
        while(node.next!=null){
            Node temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }
        node.next = prev;
        head = node;
        return head;
    }


    public static void main(String[] args) {
        Node head =  null;

        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);
        head = insert(head, 40);
        head = insert(head, 50);

        System.out.println("Linked List before reversal: ");
        display(head);
        System.out.println("\n");

        
        System.out.println("Linked List after reversal: ");
        head = reverseList(head);
        display(head);



    }
}
  

