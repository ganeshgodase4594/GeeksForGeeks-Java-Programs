

/*
 Search in Linked List
        EasyAccuracy: 67.52%Submissions: 12K+Points: 2
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given a linked list of n nodes and a key , the task is to check if the key is present in the linked list or not.

        Example:
        Input:
        n = 4
        1->2->3->4
        Key = 3
        Output:
        True
        Explanation:
        3 is present in Linked List, so the function returns true.
 */



package LinkedList.SinglyLinkedList.Basic;

class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

public class searchElement {
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

    public static void main(String[] args) {
        Node head =  null;

        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);
        head = insert(head, 40);
        head = insert(head, 50);

        display(head);

        System.out.println("\n");

        System.out.println("The element present in the linked list: "+searchKey(5, head, 480));



    }
}
  
