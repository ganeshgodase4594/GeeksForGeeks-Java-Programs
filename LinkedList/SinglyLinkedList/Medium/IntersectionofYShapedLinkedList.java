

/*

Intersection Point in Y Shaped Linked Lists
        MediumAccuracy: 44.67%Submissions: 248K+Points: 4
        Fast-Track your resumes to top tech companies and get the job you deserve! Register for hiring challenge exclusively for Freshers  

        banner
        Given two singly linked lists of size N and M, write a program to get the point where two linked lists intersect each other.

        

        Example 1:
        Input:
        LinkList1 = 3->6->9->common
        LinkList2 = 10->common
        common = 15->30->NULL
        Output: 15
        Explanation:
        Y ShapedLinked List.


        Example 2:
        Input: 
        Linked List 1 = 4->1->common
        Linked List 2 = 5->6->1->common
        common = 8->4->5->NULL
        Output: 8
        Explanation: 

        4              5
        |              |
        1              6
        \             /
        8   -----  1 
        |
        4
        |
        5
        |
        NULL.


 */





package LinkedList.SinglyLinkedList.Medium;

import java.util.HashSet;

class Intersect
{

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

    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
        Node temp1 = head1;
        
        HashSet<Node> hs = new HashSet<>();
        
        while(temp1!=null){
            hs.add(temp1);
            temp1 = temp1.next;
        }
        
        Node temp2 = head2;
        
        while(temp2!=null){
            if(hs.contains(temp2)){
                return temp2.data;
            }
            
            temp2 = temp2.next;
        }
        
        return -1;
	}

    public static void main(String[] args) {
        
    }
}

