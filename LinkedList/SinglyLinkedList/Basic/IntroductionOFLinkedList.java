package LinkedList.SinglyLinkedList.Basic;



class Node { 
    int data; 
    Node next; 

    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
} 

public class IntroductionOFLinkedList {
    static Node constructLL(int arr[]) {
        Node head = null;
        
        for(int i=arr.length-1;i>=0;i--){

            if(head==null){
                Node newNode = new Node(arr[i]);
                head = newNode;
            }

            else{
                Node newNode = new Node(arr[i]);
                newNode.next = head;
                head= newNode;
            }
        }
        
        return head;
    }

    static void display(Node head){
        Node node = head;

        while(node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        Node head = constructLL(arr);
        display(head);
    }
}
