package LinkedList.SinglyLinkedList.Medium;



import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

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

    static Node findUnion(Node head1,Node head2){
        Set<Integer>hs = new TreeSet<>();
        
        Node temp1 = head1;
        while(temp1!=null){
            hs.add(temp1.data);
            temp1 = temp1.next;
        }
        
        Node temp2 = head2;
        
        while(temp2!=null){
            hs.add(temp2.data);
            temp2 = temp2.next;
        }
        
        Node head = null;
       Node temp = head;
        
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


