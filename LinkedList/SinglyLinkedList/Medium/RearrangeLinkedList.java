package LinkedList.SinglyLinkedList.Medium;

import java.util.HashSet;
import java.util.LinkedHashSet;

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


class Rearrange{

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

            System.out.println("null");
		}

	}

    static Node rearrangeEvenOdd(Node head)
    {
        HashSet<Node>odd = new LinkedHashSet<>();
        HashSet<Node>even = new LinkedHashSet<>();
        
        Node temp = head;
        int  i =1;
        while(temp!=null){
            
            if(i % 2 == 0){
                even.add(temp);
            }
            
            else{
                odd.add(temp);
            }
            i++;
            temp = temp.next;
        }
        
        head = null;
        temp = head;
        
        for(Node node : odd){
            
            Node newNode = node;
            newNode.next = null;
            if(temp==null){
                temp = newNode;
                head = temp;
            }
            
            else{
                
                temp.next = newNode;
                temp = newNode;
            }
        }
        
        for(Node node : even){
            
            Node newNode = node;
            newNode.next = null;
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
        Node head = null;

		head = insert(1, head);
		head = insert(2, head);
		head = insert(3, head);
		head = insert(4, head);
		head = insert(5, head);

		System.out.println("\nLinked List before reversal ...!");
        display(head);

        head = rearrangeEvenOdd(head);

        display(head);

        
    }
}
