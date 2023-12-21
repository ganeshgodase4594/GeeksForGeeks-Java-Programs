

/*
 
Remove duplicate element from sorted Linked List
        EasyAccuracy: 49.37%Submissions: 262K+Points: 2
        Fast-Track your resumes to top tech companies and get the job you deserve! Register for hiring challenge exclusively for Freshers  

        banner
        Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).
        Note: Try not to use extra space. The nodes are arranged in a sorted way.

        Example 1:
        Input:
        LinkedList: 2->2->4->5
        Output: 2 4 5
        Explanation: In the given linked list 
        2 ->2 -> 4-> 5, only 2 occurs more 
        than 1 time. So we need to remove it once.

        Example 2:
        Input:
        LinkedList: 2->2->2->2->2
        Output: 2
        Explanation: In the given linked list 
        2 ->2 ->2 ->2 ->2, 2 is the only element
        and is repeated 5 times. So we need to remove
        any four 2.
 */




package LinkedList.SinglyLinkedList.Basic;

import java.util.HashSet;
import java.util.LinkedHashSet;

class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class RemoveDuplicates
{

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

    Node removeDuplicates(Node head)
    {
	    HashSet<Integer>hs = new LinkedHashSet<>();
	    
	    Node temp = head;
	    
	    while(temp!=null){
	        hs.add(temp.data);
	        temp = temp.next;
	    }
	    
	    temp = null;
	    head = temp;
	    
	    for(int data : hs){
	        
	        Node newNode = new Node(data);
	        if(temp==null){
	            temp = newNode;
	            head = temp;
	        }
	        
	        else{
	            temp.next = newNode;
	            temp = newNode;
	        }
	    }
	    
	    return head;
    }

    public static void main(String[] args) {
        
    }
}

