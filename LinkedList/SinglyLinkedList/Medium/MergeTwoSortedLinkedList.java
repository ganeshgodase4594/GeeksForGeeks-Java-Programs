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

   
class SortedMerge {
   
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

    static Node sortedMerge(Node head1, Node head2){
        Node head = null;
        Node ptr = head;
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1!=null && temp2!=null){

            if(head==null && temp1.data<=temp2.data){
                Node newNode = new Node(temp1.data);
                head = newNode;
                ptr = newNode;
                newNode.next = null;
                temp1 = temp1.next;
            }
            else if(head==null && temp1.data>=temp2.data){
                Node newNode = new Node(temp2.data);
                head = newNode;
                ptr = newNode;
                newNode.next = null;
                temp2 = temp2.next;
            }

            else if(temp1.data<=temp2.data){

                Node node = ptr;

                // while(node.next!=null){
                //     node = node.next;
                // }

                Node newNode = new Node(temp1.data);
                node.next = newNode;
                ptr = newNode;
                newNode.next = null;

                temp1 = temp1.next;
                    
            }
            else{

                Node node = ptr;

                // while(node.next!=null){
                //     node = node.next;
                // }

                Node newNode = new Node(temp2.data);
                node.next = newNode;
                ptr = newNode;
                newNode.next = null;
                
                temp2 = temp2.next;
            }
        }

        while(temp1!=null){
           Node node = ptr;

        //    while(node.next!=null){
        //         node = node.next;
        //    }

           Node newNode = new Node(temp1.data);
           node.next = newNode;
           ptr = newNode;
           newNode.next = null;

           temp1 = temp1.next;

        }

        while(temp2!=null){

            Node node = ptr;

            // while(node.next !=null){
            //     node = node.next;
            // }

            Node newNode = new Node(temp2.data);
            node.next = newNode;
            ptr = newNode;
            newNode.next = null;

            temp2 = temp2.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node head1 = null;

        head1 = insert(2, head1);
		head1 = insert(15, head1);
		head1 = insert(24, head1);
		head1 = insert(41, head1);
		head1 = insert(73, head1);

        Node head2 = null;
		head2 = insert(2, head2);
		head2 = insert(6, head2);
		head2 = insert(7, head2);
		head2 = insert(7, head2);
		head2 = insert(18, head2);
		head2 = insert(23, head2);
		head2 = insert(31, head2);
		head2 = insert(45, head2);
		head2 = insert(62, head2);
		head2 = insert(68, head2);

        
        Node head = sortedMerge(head1, head2);
        display(head);

    }
}
