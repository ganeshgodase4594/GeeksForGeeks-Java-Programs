

/*
Find the first node of loop in linked list
        EasyAccuracy: 55.49%Submissions: 39K+Points: 2
        Fast-Track your resumes to top tech companies and get the job you deserve! Register for hiring challenge exclusively for Freshers  

        banner
        Given a singly linked list of N nodes. Find the first node of the loop if the linked list has a loop. If a loop is present return the node data of the first node of the loop else return -1.

        Example 1:
        Input:

        Output: 3
        Explanation:
        We can see that there exists a loop 
        in the given linked list and the first
        node of the loop is 3.
        

        Example 2:
        Input:

        Output: -1
        Explanation: No loop exists in the above
        linked list.So the output is -1.
 */



package LinkedList.SinglyLinkedList.Basic;

import java.util.HashSet;

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

   
class LoopLinkedList {
    static Node deleteNode(Node head, int x)
    {
		if(head==null){
			return head;
		}

		if(x==1){
			Node node = head;
			head = node.next;
			return head;
		}


		Node node = head;
		int count=0;
		Node prev = null;
		while(node.next!=null){
			if(count==x-1){
				break;
			}

			prev = node;
			node = node.next;
			
			count++;
		}

		prev.next = node.next;
        return head;
    }

	

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

    static int findFirstNode(Node head){
        
        HashSet<Node>hs = new HashSet<>();
        
        Node temp = head;
        
        while(temp!=null){
            if(hs.contains(temp)){
                return temp.data;
            }
            
            hs.add(temp);
            
            temp = temp.next;
        }
        
        return -1;
    }

   public static void main(String[] args) {
        Node head = null;

		head = insert(10, head);
		head = insert(20, head);
		head = insert(30, head);
		head = insert(40, head);

		System.out.println("\nLinked List after insertion...!");
        display(head);
		System.out.println("\n");

		
		head = deleteNode(head, 1);
		display(head);

		System.out.println("ENd");

    }
}
