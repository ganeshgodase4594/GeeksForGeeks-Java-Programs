package LinkedList.SinglyLinkedList.Medium;

import java.util.ArrayList;

class SwapKthNode{

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

    static Node swapkthnode(Node head, int num, int K){
        if(K>num){
            return head;
        }
        
        ArrayList<Integer>ls = new ArrayList<>();
        Node temp = head;
        
        while(temp!=null){
            ls.add(temp.data);
            temp = temp.next;
        }
        
        int left =0;
        int right = ls.size()-1;
        
        while(left!=ls.size()){
            if(left+1 == K){
                int temp1 = ls.get(left);
                ls.set(left,ls.get(right));
                ls.set(right,temp1);
                break;
            }
            
            left++;
            right--;
        }
        
        head = null;
        temp = head;
        
        for(int data : ls){
            
            Node newNode = new Node(data);
            
            if(head == null){
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

    static int getCount(Node head)
    {

        int count =0;

        if(head==null){
            return count;
        }
        Node node = head;

        while(node!=null){
            node = node.next;
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        Node head = null;

		head = insert(10, head);
		head = insert(20, head);
		head = insert(30, head);
		head = insert(40, head);
		head = insert(50, head);

		System.out.println("\nLinked List after insertions...!");
        display(head);
		System.out.println("\n");

        int K= 2;
        int num = getCount(head);

        head = swapkthnode(head, num, K);

        display(head);
    }
}
