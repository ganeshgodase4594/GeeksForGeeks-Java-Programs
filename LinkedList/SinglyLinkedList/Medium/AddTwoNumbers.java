
/*
 
Add two numbers represented by linked lists
        MediumAccuracy: 34.52%Submissions: 213K+Points: 4
        You've Still got a chance to get on the Leaderboard! Register for GfG Weekly Coding Contest

        banner
        Given two decimal numbers represented by two linked lists of size N and M respectively. The task is to return a linked list that represents the sum of these two numbers.

        For example, the number 190 will be represented by the linked list, 1->9->0->null, similarly 25 by 2->5->null. Sum of these two numbers is 190 + 25 = 215, which will be represented by 2->1->5->null. You are required to return the head of the linked list 2->1->5->null.

        Example 1:
        Input:
        N = 2
        valueN[] = {4,5}
        M = 3
        valueM[] = {3,4,5}
        Output: 3 9 0  
        Explanation: For the given two linked
        list (4 5) and (3 4 5), after adding
        the two linked list resultant linked
        list will be (3 9 0).

        Example 2:
        Input:
        N = 2
        valueN[] = {6,3}
        M = 1
        valueM[] = {7}
        Output: 7 0
        Explanation: For the given two linked
        list (6 3) and (7), after adding the
        two linked list resultant linked list
        will be (7 0).

        
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

    static Node addTwoLists(Node first, Node second){
        String str1 = "";
        String str2 = "";

        while(first!=null){
            str1 += first.data;
            first = first.next;
        }

        while(second!=null){
            str2 += second.data;
            second = second.next;
        }

        

        if(str1.length()>str2.length()){
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        str1 = new StringBuffer(str1).reverse().toString();
        str2 = new StringBuffer(str2).reverse().toString();


        String str = "";
        int carry = 0;
        for(int i=0;i<str1.length();i++){
            int sum = (int)(str1.charAt(i)-48 + str2.charAt(i)-48+carry);
            str +=(sum%10);
            carry = sum /10;

        }

        for(int i=str1.length();i<str2.length();i++){
            int sum = (int)(str2.charAt(i)-48+carry);
            str +=(sum%10);
            carry = sum /10;
        }

        if(carry>0){
            str +=carry;
        }

        str = new StringBuffer(str).reverse().toString();

        Node head = null;

        for(int i=0;i<str.length();i++){
            Node newNode = new Node(str.charAt(i)-48);

            if(head == null){
                head = newNode;
            }

            else{
                
                Node temp = head;

                while(temp.next!=null){
                    temp = temp.next;
                }

                temp.next = newNode;
                newNode.next = null;
            }
        }


        return head;
    }

    
   public static void main(String[] args) {
        Node head1 = null;

        // head1 = insert(3, head1);
		head1 = insert(4, head1);
		head1 = insert(5, head1);

        Node head2 = null;
		head2 = insert(3, head2);
		head2 = insert(4, head2);
		head2 = insert(5, head2);

		// System.out.println("\nLinked List before adding ...!");
        // display(head);

        Node f1 = addTwoLists(head1, head2);
        display(f1);


    }
}
