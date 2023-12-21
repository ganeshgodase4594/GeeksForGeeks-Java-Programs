

/*

Delete nodes having greater value on right
        EasyAccuracy: 35.51%Submissions: 130K+Points: 2
        Fast-Track your resumes to top tech companies and get the job you deserve! Register for hiring challenge exclusively for Freshers  

        banner
        Given a singly linked list, remove all the nodes in the list which have any node on their right whose value is greater. (Not just immediate Right , but entire List on the Right)

        Example 1:
        Input:
        LinkedList = 12->15->10->11->5->6->2->3
        Output: 15 11 6 3
        Explanation: Since, 12, 10, 5 and 2 are
        the elements which have greater elements
        on the following nodes. So, after deleting
        them, the linked list would like be 15,
        11, 6, 3.

        Example 2:
        Input:
        LinkedList = 10->20->30->40->50->60
        Output: 60
        Explanation: All the nodes except the last
        node has a greater value node on its right,
        so all the nodes except the last node must
        be removed.


 */

package LinkedList.SinglyLinkedList.Basic;
import java.util.*;


class Delete{

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

    static Node compute(Node head){

       List<Integer>ls1 = new ArrayList<>();
        
        Node temp = head;
        
        while(temp!=null){
            ls1.add(temp.data);
            temp = temp.next;
        }

        List<Integer>ls = new ArrayList<>();
        
        int max = Integer.MIN_VALUE;
        
        head = null;
        temp = head;
        
        for(int i=ls1.size()-1;i>=0;i--){

            if(ls1.get(i)>=max){
                max = ls1.get(i);
                ls.add(ls1.get(i));
            }
            else{
                continue;
            }
        }

        head = null;
        temp = head;
        for(int i=ls.size()-1;i>=0;i--){

            Node newNode = new Node(ls.get(i));
            if(temp == null){
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

    public static void main(String[] args){
        Node head = null;

		head = insert(12, head);
		head = insert(15, head);
		head = insert(10, head);
		head = insert(11, head);
		head = insert(5, head);
		head = insert(6, head);
		head = insert(2, head);
		head = insert(3, head);

		System.out.println("\nLinked List after insertion...!");
        display(head);
		System.out.println("\n");

        head = compute(head);

        display(head);

    }
}