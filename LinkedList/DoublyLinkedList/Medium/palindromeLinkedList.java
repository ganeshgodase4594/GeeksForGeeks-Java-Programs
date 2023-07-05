package LinkedList.DoublyLinkedList.Medium;

import java.util.ArrayList;
import java.util.List;

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


public class palindromeLinkedList {

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

    static boolean isPalindrome(Node head) 
    {
        Node node = head;
        List<Integer> ls=new ArrayList<Integer>();  
        while(node!=null){
            ls.add(node.data);
            node=node.next;

        }

       Integer arr[] = ls.toArray(new Integer[0]);

       int left = 0;
       int right = arr.length-1;

       while(left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
       }
       
        return true;
    } 

   
    public static void main(String[] args) {

        Node head = null;
        head = insertAtTail(head,1);
        head = insertAtTail(head,2);
        head = insertAtTail(head,1);
        
        display(head);

        System.out.println(isPalindrome(head));

    }
}


