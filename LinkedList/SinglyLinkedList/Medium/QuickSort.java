package LinkedList.SinglyLinkedList.Medium;

import java.util.ArrayList;

class QuickSort{

    static Node quickSort(Node node){
        ArrayList<Integer>ls = new ArrayList<>();
        Node temp = node;
        
        while(temp!=null){
            ls.add(temp.data);
            temp = temp.next;
        }
        
        int arr[] = new int[ls.size()];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = ls.get(i);
        }
        
        quickSort(arr,0,arr.length-1);
        
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
    
    static int partition(int arr[],int start,int end){

        int pivot = arr[end];
        int i = start-1;

        for(int j= start;j<end;j++){

            if(arr[j]<pivot){

                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;
    }


    static void quickSort(int arr[],int start,int end){

        if(start<end){

            int partition = partition(arr,start,end);
            quickSort(arr, start, partition-1);
            quickSort(arr, partition+1, end);

        }
    }
    
    
}