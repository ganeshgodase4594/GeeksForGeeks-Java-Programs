

/*
 237. Delete Node in a Linked List
		Medium
		3.2K
		935
		Companies
		There is a singly-linked list head and we want to delete a node node in it.

		You are given the node to be deleted node. You will not be given access to the first node of head.

		All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.

		Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:

		The value of the given node should not exist in the linked list.
		The number of nodes in the linked list should decrease by one.
		All the values before node should be in the same order.
		All the values after node should be in the same order.
		Custom testing:

		For the input, you should provide the entire linked list head and the node to be given node. node should not be the last node of the list and should be an actual node in the list.
		We will build the linked list and pass the node to your function.
		The output will be the entire list after calling your function.
		

		Example 1:
		Input: head = [4,5,1,9], node = 5
		Output: [4,1,9]
		Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.


		Example 2:
		Input: head = [4,5,1,9], node = 1
		Output: [4,5,9]
		Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.

 */





package LinkedList.SinglyLinkedList.Basic;

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

   
class DeleteNode {
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
