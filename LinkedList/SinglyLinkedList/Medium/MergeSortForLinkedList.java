
/*

Merge Sort for Linked List
        MediumAccuracy: 74.76%Submissions: 63K+Points: 4
        Fast-Track your resumes to top tech companies and get the job you deserve! Register for hiring challenge exclusively for Freshers  

        banner
        Given Pointer/Reference to the head of the linked list, the task is to Sort the given linked list using Merge Sort.
        Note: If the length of linked list is odd, then the extra node should go in the first list while splitting.

        Example 1:
        Input:
        N = 5
        value[]  = {3,5,2,4,1}
        Output: 1 2 3 4 5
        Explanation: After sorting the given
        linked list, the resultant matrix
        will be 1->2->3->4->5.

        Example 2:
        Input:
        N = 3
        value[]  = {9,15,0}
        Output: 0 9 15
        Explanation: After sorting the given
        linked list , resultant will be
        0->9->15.

 */




package LinkedList.SinglyLinkedList.Medium;

import java.util.ArrayList;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

   
class AddTwoLinkedList {
   
    static Node insert(int data,Node head){
		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
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
		if(head == null){
			System.out.println("Linked List in empty...!");
		}

		else{
			Node node = head;
			while(node!=null){

				System.out.print(node.data+"--->");
				node = node.next;
			}
		}
	}

   static Node mergeSort(Node head)
    {
        ArrayList<Integer>ls = new ArrayList<>();
        Node temp = head;
        
        while(temp!=null){
            ls.add(temp.data);
            temp = temp.next;
        }
        
        int arr[] = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            arr[i] = ls.get(i);
        }
        
        mergeSort(arr,0,arr.length-1);
        
        head = null;
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
    
    static void mergeSort(int arr[],int low,int high){
        
        if(low<high){
            int mid = low + (high-low)/2;
            
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    
    
    static void merge(int []arr,int low,int mid,int high){
        
        int n1 = mid-low+1;
        int n2 = high - mid;
        
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        
        for(int i=0;i<n1;i++){
            arr1[i] = arr[low+i];
            
        }
        
        for(int i=0;i<n2;i++){
            arr2[i] = arr[mid+1+i];
        }
        
        int i=0,j=0,k=low;
        
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        
        while(i<n1){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        
        while(j<n2){
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
    
   public static void main(String[] args) {
        

    }
}


