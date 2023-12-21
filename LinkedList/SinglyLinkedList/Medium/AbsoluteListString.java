

/*

Absolute List Sorting
        MediumAccuracy: 62.03%Submissions: 34K+Points: 4
        Fast-Track your resumes to top tech companies and get the job you deserve! Register for hiring challenge exclusively for Freshers  

        banner
        Given a linked list of N nodes, sorted in ascending order based on the absolute values of its data,i.e. negative values are considered as positive ones. Sort the linked list in ascending order according to the actual values, and consider negative numbers as negative and positive numbers as positive.


        Example 1:
        Input: 
        List: 1, -2, -3, 4, -5
        Output: 
        List: -5, -3, -2, 1, 4
        Explanation: 
        Actual sorted order of {1, -2, -3, 4, -5}
        is {-5, -3, -2, 1, 4}
        

        Example 2:
        Input: 
        List: 5, -10
        Output: 
        List: -10, 5
        Explanation:
        Actual sorted order of {5, -10}
        is {-10, 5}.


 */



package LinkedList.SinglyLinkedList.Medium;


import java.util.*;

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

   
class AddTwoLinkedList {
   
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

    static Node sortList(Node head) {
		
		List<Integer> ts = new ArrayList<>();
		
		Node temp = head;
		
		while(temp!=null){
		    ts.add(temp.data);
		    temp = temp.next;
		}
		
		Collections.sort(ts);
		
		head = null;
		temp = head;
		for(int data : ts){
		    
		    Node newNode = new Node(data);

            if(temp==null){
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


