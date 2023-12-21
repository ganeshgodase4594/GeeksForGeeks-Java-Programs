

/*

Insertion Sort for Singly Linked List
        MediumAccuracy: 83.44%Submissions: 6K+Points: 4
        Fast-Track your resumes to top tech companies and get the job you deserve! Register for hiring challenge exclusively for Freshers  

        banner
        Given a singly linked list, sort the list (in ascending order) using insertion sort algorithm.

        Example 1:
        Input:
        N = 10
        Linked List = 30->23->28->30->11->14->
                    19->16->21->25 
        Output : 11 14 16 19 21 23 25 28 30 30 
        Explanation :
        The resultant linked list is sorted.

        Example 2:
        Input : 
        N = 7
        Linked List=19->20->16->24->12->29->30 
        Output : 12 16 19 20 24 29 30 
        Explanation : 
        The resultant linked list is sorted.

 */



package LinkedList.SinglyLinkedList.Medium;

import java.util.ArrayList;

class Node{
	int data;
	Node next;
	
	Node(int d){
		data = d;
		next = null;
	}
}


class InsertionSort
{
    public static Node insertionSort(Node head_ref)
    {
        ArrayList<Integer>ls = new ArrayList<>();
        
        Node temp = head_ref;
        
        while(temp!=null){
            ls.add(temp.data);
            temp = temp.next;
        }
        
        int arr[] = new int[ls.size()];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = ls.get(i);
        }
        
        insertionsort(arr);
        
        Node head = null;
        temp = head;
        
        for(int i=0;i<arr.length;i++){
            
            Node newNode = new Node(arr[i]);
            
            if(temp == null){
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
    
    static void insertionsort(int arr[]){
         
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        
    }
}
