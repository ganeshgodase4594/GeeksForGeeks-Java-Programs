

/*

Remove all occurences of duplicates in a linked list
        MediumAccuracy: 49.82%Submissions: 11K+Points: 4
        Fast-Track your resumes to top tech companies and get the job you deserve! Register for hiring challenge exclusively for Freshers  

        banner
        Given a sorted linked list, delete all nodes that have duplicate numbers (all occurrences), leaving only numbers that appear once in the original list. 

        Example 1:
        Input: 
        N = 8
        Linked List = 23->28->28->35->49->49->53->53
        Output: 
        23 35
        Explanation:
        The duplicate numbers are 28, 49 and 53 which 
        are removed from the list.

        Example 2:
        Input:
        N = 6
        Linked List = 11->11->11->11->75->75
        Output: 
        Empty list
        Explanation:
        All the nodes in the linked list have 
        duplicates. Hence the resultant list 
        would be empty.


 */




package LinkedList.SinglyLinkedList.Medium;

import java.util.LinkedHashSet;
import java.util.Set;

class RemoveDuplicates{

     
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
    public static Node removeAllDuplicates(Node head)
    {
        Set<Integer>hs1 = new LinkedHashSet<>();
        Set<Integer>hs2 = new LinkedHashSet<>();
        
        Node temp = head;
        
        while(temp!=null){
            
            if(hs2.contains(temp.data)){
                if(hs1.contains(temp.data)){
                    hs1.remove(temp.data);
                }
            }
            else{
                    hs1.add(temp.data);
                    hs2.add(temp.data);
                }
            temp = temp.next;
        }
        
        head = null;
        temp = head;
        
        for(int data : hs1){
            
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