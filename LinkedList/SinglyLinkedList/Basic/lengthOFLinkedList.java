

/*
 
Count nodes of linked list
        BasicAccuracy: 85.99%Submissions: 132K+Points: 1
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.

        Example 1:
        Input:
        LinkedList: 1->2->3->4->5
        Output: 5
        Explanation: Count of nodes in the 
        linked list is 5, which is its length.


        Example 2:
        Input:
        LinkedList: 2->4->6->7->5->1->0
        Output: 7
        Explanation: Count of nodes in the
        linked list is 7. Hence, the output
        is 7.

 */





package LinkedList.SinglyLinkedList.Basic;

class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}

public class lengthOFLinkedList
{
    //Function to count nodes of a linked list.
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

        System.out.println("The number of Nodes in linked list are: "+getCount(head));


    }
}
  
