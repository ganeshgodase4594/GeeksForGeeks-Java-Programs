

/*
 Find length of Loop
        EasyAccuracy: 44.26%Submissions: 112K+Points: 2
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given a linked list of size N. The task is to complete the function countNodesinLoop() that checks whether a given Linked List contains a loop or not and if the loop is present then return the count of nodes in a loop or else return 0. C is the position of the node to which the last node is connected. If it is 0 then no loop.



        Example 1:
        Input:
        N = 10
        value[]={25,14,19,33,10,21,39,90,58,45}
        C = 4
        Output: 7
        Explanation: The loop is 45->33. So
        length of loop is 33->10->21->39->
        90->58->45 = 7. The number 33 is
        connected to the last node to form the
        loop because according to the input the
        4th node from the beginning(1 based
        index) will be connected to the last
        node for the loop.


        Example 2:
        Input:
        N = 2
        value[] = {1,0}
        C = 1
        Output: 2
        Explanation: The length of the loop
        is 2.
        
 */



package LinkedList.SinglyLinkedList.Basic;

import java.util.Enumeration;
import java.util.Hashtable;

class Node{

    int val;
    Node next;
    Node(int x){
        val = x;
        next = null;

  }

}

public class lengthOfLoop {

    static void display(Node head){
        Node node = head;

        while(node !=null){
            System.out.print(node.val+"-->");
            node = node.next;
        }

        // System.out.println("null");
    }

    static Node insertFirst(int data,Node head){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }

        else{

            newNode.next = head;
            head = newNode;
        }

        return head;
    }

    static Node insertLast(int data,Node head){
        Node node = head;
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }

        else{

            while(node.next!=null){
                node = node.next;
            }
    
            node.next = newNode;
            newNode.next=null;
        }
        return head;
    }

    static int countNodesinLoop(Node head){
        int count=0;
        Hashtable<Integer,Node> hm=new Hashtable<Integer,Node>();  
        Node node = head;

        int x = 0;
        int nodeCount=0;
        while(node!=null){
            if(!hm.containsValue(node)){
                hm.put(x, node);
                x++;
                nodeCount++;
            }
            else{

                Enumeration<Integer> e = hm.keys();

                while(e.hasMoreElements()){
                    int key = e.nextElement();

                    if(hm.get(key)==node){
                        return nodeCount-key+1;
                    }
                }
            }
            node = node.next;
        }

        return count;
        
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertFirst(40, head);
        display(head);
    }
}

