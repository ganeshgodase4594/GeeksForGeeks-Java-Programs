package LinkedList.SinglyLinkedList.Medium;

import java.util.ArrayList;

class Node{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class LinkedList{
    //Function to sort the given doubly linked list using Merge Sort.
    static Node sortDoubly(Node head)
    {
        Node temp = head;
        ArrayList<Integer>ls = new ArrayList<>();
        while(temp!=null){
            ls.add(temp.data);
            temp = temp.next;
        }
        
        int arr[] = new int[ls.size()];
        
        for(int i=0;i<arr.length;i++){
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
                newNode.prev= temp;
                temp = newNode;
            }
        }
        
        return head;
    }
    
    static void mergeSort(int[] arr,int low,int high){
        
        if(low<high){
            
            int mid = low + (high - low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    
    static void merge(int arr[],int low,int mid,int high){
        
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
            
            if(arr1[i]<arr2[j]){
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
