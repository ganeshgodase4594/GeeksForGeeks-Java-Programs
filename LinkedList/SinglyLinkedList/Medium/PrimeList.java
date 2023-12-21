package LinkedList.SinglyLinkedList.Medium;


class Node
{
	int val;
	Node next;
	
	Node(int d)
	{
		val = d;
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

				System.out.print(node.val+"--->");
				node = node.next;
			}
		}
	}

    static Node primeList(Node head){
        
        Node temp = head;
        
        while(temp!=null){
            
            if(!isPrime(temp.val)){
                temp.val = nearrestPrime(temp.val);
            }
            
            temp = temp.next;
        }
        
        return head;
    }
    
    static int nearrestPrime(int num){
        
        if(num==1){
            return 2;
        }
        
        int forwardDistance = 0;
        int backwardDistance = 0;
        int n = num;
        while(!isPrime(num)){
            num++;
            forwardDistance++;
        }
        
        while(!isPrime(n)){
            n--;
            backwardDistance++;
        }
        
        if(backwardDistance<=forwardDistance){
            return n;
        }
        
        return num;
    }
    
    static boolean isPrime(int num){
        
        if(num == 1){
            return false;
        }
        
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i==0){
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        
    }
}