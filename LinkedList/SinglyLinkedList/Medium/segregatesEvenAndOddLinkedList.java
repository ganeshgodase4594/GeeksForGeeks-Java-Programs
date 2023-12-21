package LinkedList.SinglyLinkedList.Medium;
import java.util.*;

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


class Solution{

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

    static Node divide(int N, Node head){
        
        ArrayList<Integer>ls1 = new ArrayList<>();
        ArrayList<Integer>ls2 = new ArrayList<>();
        
        Node temp = head;
        
        while(temp!=null){
            
            if(temp.data%2==0)
                ls1.add(temp.data);
                
            else{
                ls2.add(temp.data);
            }
            
            temp = temp.next;
        }
        
        head = null;
        temp= head;
        
        for(int data : ls1){
            Node newNode = new Node(data);
            
            if(head == null){
                temp = newNode;
                head = temp;
            }
            else{
                temp.next = newNode;
                temp = newNode;
            }
            
        }
        
        for(int data : ls2){
            Node newNode = new Node(data);
            
            if(head == null){
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