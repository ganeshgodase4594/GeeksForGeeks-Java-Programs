



package LinkedList.SinglyLinkedList.Basic;



class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class Sort012LinkedList
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

    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        int count0 =0,count1=0,count2=0;
        
        Node temp = head;
        
        while(temp!=null){
            
            if(temp.data == 0){
                count0++;
            }
            else if(temp.data == 1){
                count1++;
            }
            
            else{
                count2++;
            }
            
            temp = temp.next;
        }
        
        head = null;
        head = temp;
        
        while(count0!=0){
            Node newNode = new Node(0);
            if(temp == null){
                temp = newNode;
                head = temp;
            }
            else{
                temp.next = newNode;
                temp = newNode;
            }
            
            count0--;
        }
        
        while(count1!=0){
            Node newNode = new Node(1);
             if(temp == null){
                temp = newNode;
                head = temp;
            }
            else{
                
                temp.next = newNode;
                temp = newNode;
            }
            
            count1--;
            
        }
        
         while(count2!=0){
             
            Node newNode = new Node(2);
            
             if(temp == null){
                temp = newNode;
                head = temp;
            }
            else{
                temp.next = newNode;
                temp = newNode;
                
            }
            count2--;
            
        }
        
        return head;
    }

    public static void main(String[] args) {
        
    }
}

