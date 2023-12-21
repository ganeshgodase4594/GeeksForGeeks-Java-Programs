

/*
 
Move Last Element to Front of a Linked List
        EasyAccuracy: 69.09%Submissions: 32K+Points: 2
        Fast-Track your resumes to top tech companies and get the job you deserve! Register for hiring challenge exclusively for Freshers  

        banner
        You are given the head of a Linked List. You have to move the last element to the front of the Linked List and return the list.

        Example 1:
        Input:
        N = 5
        List = {2,5,6,2,1}
        Output:
        {1,2,5,6,2}
        Explanation:
        In the given linked list, the last element is 1,
        after moving the last element to the front the
        linked list will be {1,2,5,6,2}.
        

        Example 2:
        Input:
        N = 1
        List = {2}
        Output:
        {2}
        Explanation:
        Here 2 is the only element so, the linked list
        will remain the same.


 */



package LinkedList.SinglyLinkedList.Basic;

import java.util.HashSet;
import java.util.LinkedHashSet;

class RemoveDuplicates
{

    static Node insert(Node head,int data){

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

    static Node moveToFront(Node head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        Node temp = head;
        Node prev = null;
        while(temp.next !=null){
            prev = temp;
            temp = temp.next;
        }
        
        temp.next = head;
        prev.next = null;
        head = temp;
        
        return head;
    }

 

    public static void main(String[] args) {
        
    }
}

