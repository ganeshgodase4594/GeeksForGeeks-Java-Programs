

/*
 Rotate a Linked List
        MediumAccuracy: 39.95%Submissions: 189K+Points: 4
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given a singly linked list of size N. The task is to left-shift the linked list by k nodes, where k is a given positive integer smaller than or equal to length of the linked list.

        Example 1:
        Input:
        N = 5
        value[] = {2, 4, 7, 8, 9}
        k = 3
        Output: 8 9 2 4 7
        Explanation:
        Rotate 1: 4 -> 7 -> 8 -> 9 -> 2
        Rotate 2: 7 -> 8 -> 9 -> 2 -> 4
        Rotate 3: 8 -> 9 -> 2 -> 4 -> 7

        Example 2:
        Input:
        N = 8
        value[] = {1, 2, 3, 4, 5, 6, 7, 8}
        k = 4
        Output: 5 6 7 8 1 2 3 4
 */







package LinkedList.SinglyLinkedList.Medium;

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

    static Node rotate(Node head, int k) {

        if(head==null || head.next==null){
            return head;
        }

        Node temp = head;
        int count=0;

        while(temp!=null){
            count++;
            temp = temp.next;
        }


        int itr = k % count;

        for(int i=1;i<=itr;i++){

            Node node = head;
            while(node.next!=null){
                node = node.next;
            }
    
            Node tempNode = head;
            node.next = tempNode;
            head = head.next;
            tempNode.next = null;
        }

        return head;
    }

   public static void main(String[] args) {
        Node head = null;

		head = insert(2, head);
		head = insert(4, head);
		head = insert(7, head);
		head = insert(8, head);
		head = insert(9, head);

		System.out.println("\nLinked List before reversal ...!");
        display(head);

        System.out.println("\nLinked List after reversal to Left by Kth places...!");
        head = rotate(head, 2);
        display(head);

    }
}

