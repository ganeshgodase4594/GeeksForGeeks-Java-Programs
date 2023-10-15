
/*

 Add 1 to a number represented as linked list
        MediumAccuracy: 31.91%Submissions: 173K+Points: 4
        You've Still got a chance to get on the Leaderboard! Register for GfG Weekly Coding Contest

        banner
        A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

        Example 1:
        Input:
        LinkedList: 4->5->6
        Output: 457
        Explanation: 4->5->6 represents 456 and when 1 is added it becomes 457. 

        Example 2:
        Input:
        LinkedList: 1->2->3
        Output: 124.


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

   
class AddOne {
   
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

    static Node addOne(Node head) 
    { 
        String str1 = "";

        while(head!=null){
            str1 +=head.data;
            head = head.next;
        }

        str1 = new StringBuffer(str1).reverse().toString();
        String str = "";
        int carry = 0;

        int s1 = (int)(str1.charAt(0)-48+1);
        str +=(s1%10);

        carry = s1/10;

        for(int i=1;i<str1.length();i++){

            int sum =(int)(str1.charAt(i)-48+carry);
            str +=(sum%10);
            carry = sum /10;

        }

        if(carry>0){
            str +=carry;
        }

        str = new StringBuffer(str).reverse().toString();
        
        // System.out.println(str);

        Node node = null;
        Node ptr = node;
        for(int i=0;i<str.length();i++){

            Node newNode = new Node(str.charAt(i)-48);
            if(node==null){
                node = newNode;
                ptr = newNode;
                newNode.next = null;
            }

            else{

                ptr.next = newNode;
                ptr = newNode;
                newNode.next = null;
            }
        }
        return node;
    }


   public static void main(String[] args) {
        Node head1 = null;

        head1 = insert(4, head1);
		head1 = insert(5, head1);
		head1 = insert(6, head1);

        Node head = addOne(head1);

        display(head);



    }
}

