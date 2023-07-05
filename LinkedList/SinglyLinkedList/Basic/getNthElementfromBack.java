
/*
 Nth node from end of linked list
        EasyAccuracy: 41.18%Submissions: 317K+Points: 2
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given a linked list consisting of L nodes and given a number N. The task is to find the Nth node from the end of the linked list.

        Example 1:

        Input:
        N = 2
        LinkedList: 1->2->3->4->5->6->7->8->9
        Output: 8
        Explanation: In the first example, there
        are 9 nodes in linked list and we need
        to find 2nd node from end. 2nd node
        from end is 8.
        
        
        Example 2:
        Input:
        N = 5
        LinkedList: 10->5->100->5
        Output: -1
        Explanation: In the second example, there
        are 4 nodes in the linked list and we
        need to find 5th from the end. Since 'n'
        is more than the number of nodes in the
        linked list, the output is -1.
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

   
public class getNthElementfromBack {
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

    static int getNthFromLast(Node head, int n)
    {
    	int count=0;
        Node node = head;

        while(node!=null){
            count++;
            node = node.next;
        }

        if(n>count){
            return -1;
        }

        if(count==1 && n==1){
            return head.data;
        }

        Node newnode = head;
        int count1=0;
        Node prevNode = null;
        while(newnode!=null){

            count1++;

            if(count1==count-n+1){

                if(count-n==0){
                    head = newnode.next;
                    return newnode.data;
                }
                else{

                    prevNode.next = newnode.next;
                    return newnode.data;
                }
            }
            prevNode = newnode;
            newnode = newnode.next;
            
        }
        return head.data;	
    }

   public static void main(String[] args) {
        Node head = null;

		head = insert(10, head);
		head = insert(20, head);
		head = insert(30, head);
		head = insert(40, head);

        display(head);

        System.out.println("\nThe Nth element from back is: ");

        System.out.println(getNthFromLast(head, 3));


    }
}

