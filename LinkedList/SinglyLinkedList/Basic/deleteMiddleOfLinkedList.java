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

   
public class deleteMiddleOfLinkedList {
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

    static Node deleteMid(Node head) {
        Node node = head;

        int count=0;
        
        while(node!=null){
            count++;
            node= node.next;
        }

        if(count==1){
            head=null;
            return head;
        }

        int pos = count/2;

        Node newNode = head;
        int count1=0;
        Node prevNode =null;
        while(newNode!=null){
            count1++;

            if(count1==pos+1){
                prevNode.next = newNode.next;
            }
            prevNode = newNode;
            newNode = newNode.next;
        }
        return head;
    }

    

   public static void main(String[] args) {
        Node head = null;

		head = insert(10, head);
		head = insert(20, head);
		head = insert(30, head);
		head = insert(40, head);

        System.out.println("Linked-List before deletion..!");
        display(head);


        System.out.println("\nLinked List after deletion...!");
        head = deleteMid(head);
        display(head);




    }
}


