
/*


Detect Loop in linked list
        EasyAccuracy: 43.49%Submissions: 357K+Points: 2
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given a linked list of N nodes. The task is to check if the linked list has a loop. Linked list can contain self loop.

        Example 1:
        Input:
        N = 3
        value[] = {1,3,4}
        x(position at which tail is connected) = 2
        Output: True
        Explanation: In above test case N = 3.
        The linked list with nodes N = 3 is
        given. Then value of x=2 is given which
        means last node is connected with xth
        node of linked list. Therefore, there
        exists a loop.


        Example 2:
        Input:
        N = 4
        value[] = {1,8,3,4}
        x = 0
        Output: False
        Explanation: For N = 4 ,x = 0 means
        then lastNode->next = NULL, then
        the Linked list does not contains
        any loop.

 */


package LinkedList.SinglyLinkedList.Basic;

import java.util.Hashtable;

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

   
public class detectLoopInLinkedList {
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

    static boolean detectLoop(Node head){
        Hashtable<Integer,Node> hm=new Hashtable<Integer,Node>();  
        Node node = head;

        int x = 1;
        while(node!=null){
            if(!hm.containsValue(node)){
                hm.put(x, node);
                x++;
            }
            else{
                return true;
            }
            node = node.next;
        }
        return false;
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

