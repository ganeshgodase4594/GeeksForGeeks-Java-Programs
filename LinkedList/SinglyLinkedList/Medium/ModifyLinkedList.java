

/*

Modify Linked List-1
        MediumAccuracy: 72.39%Submissions: 21K+Points: 4
        Fast-Track your resumes to top tech companies and get the job you deserve! Register for hiring challenge exclusively for Freshers  

        banner
        Given a singly linked list containing N nodes. Modify the Linked list as follows:

        1. Modify the value of the first half nodes such that 1st node's new value is equal to the value of the last node minus the first node's current value, 2nd node's new value is equal to the second last nodes value minus 2nd nodes current value, likewise for first half nodes.
        2. Replace the second half of nodes with the initial values of the first half nodes(values before modifying the nodes).
        3. If N is odd then the value of the middle node remains unchanged.

        Example 1:
        Input:
        N = 5
        linked list = 10 -> 4 -> 5 -> 3 -> 6
        Output:
        -4 -1 5 4 10
        Explanation:
        For first half nodes modified list will be:
        -4 -> -1 -> 5 -> 3 -> 6
        For second half nodes modified list will be:
        -4 -> -1 -> 5 -> 4 -> 10.

        Example 2:
        Input:
        N = 6
        linked list = 2 -> 9 -> 8 -> 12 -> 7 -> 10
        Output:
        8 -2 4 8 9 2
        Explanation:
        After modifying the linked list as required,
        we have a new linked list containing the elements as
        8 -> -2 -> 4 -> 8 -> 9 -> 2.


 */



package LinkedList.SinglyLinkedList.Medium;

import java.util.ArrayList;

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


class PrimeList{

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

    static Node modifyTheList(Node head){
        Node temp = head;
        
        ArrayList<Integer>ls = new ArrayList<>();
        
        while(temp!=null){
            ls.add(temp.data);
            temp = temp.next;
        }
        
        int left = 0;
        int right = ls.size()-1;
        
        while(left<right){
            int temp1 = ls.get(left);
            ls.set(left,ls.get(right)-temp1);
            ls.set(right, temp1);
            left++;
            right--;
        }
        
        head = null;
        temp = head;
        
        for(int data : ls){
            Node newNode = new Node(data);
            
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

   
    
 

    public static void main(String[] args) {
        
    }
}