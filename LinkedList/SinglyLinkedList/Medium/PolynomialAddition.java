

/*

Polynomial Addition
        MediumAccuracy: 55.38%Submissions: 24K+Points: 4
        Fast-Track your resumes to top tech companies and get the job you deserve! Register for hiring challenge exclusively for Freshers  

        banner
        Given two polynomial numbers represented by a linked list. The task is to complete the function addPolynomial() that adds these lists meaning adds the coefficients who have the same variable powers.
        Note:  Given polynomials are sorted in decreasing order of power.

        Example 1:
        Input:
        LinkedList1:  (1,x2) 
        LinkedList2:  (1,x3)
        Output:
        1x^3 + 1x^2
        Explanation: Since, x2 and x3 both have
        different powers as 2 and 3. So, their
        coefficient can't be added up.

        Example 2:
        Input:
        LinkedList1:  (1,x3) -> (2,x2)
        LinkedList2:  (3,x3) -> (4,x2)
        Output:
        4x^3 + 6x^2
        Explanation: Since, x3 has two different
        coefficients as 3 and 1. Adding them up
        will lead to 4x3. Also, x2 has two
        coefficients as 4 and 2. So, adding them
        up will give 6x2.


 */





package LinkedList.SinglyLinkedList.Medium;

class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}


class PolynomialAddition{

    public static Node addPolynomial(Node p1,Node p2)
    {
        Node temp1 = p1;
        Node temp2 = p2;
        
        Node head = null;
        Node temp = head;
        
        while(temp1!=null && temp2!=null){
        
            if(head == null){
                
                if(temp1.pow > temp2.pow){
                    Node newNode = new Node(temp1.coeff,temp1.pow);
                    temp = newNode;
                    head = temp;
                    
                    temp1 = temp1.next;
                }
                
                else if(temp1.pow == temp2.pow){
                    Node newNode = new Node(temp1.coeff+temp2.coeff,temp1.pow);
                    temp = newNode;
                    head = temp;
                    
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }
                else{
                    Node newNode = new Node(temp2.coeff,temp2.pow);
                    temp = newNode;
                    head = temp;
                    
                    temp2 = temp2.next;
                }
            }
            
            else{
                  if(temp1.pow > temp2.pow){
                    Node newNode = new Node(temp1.coeff,temp1.pow);
                    temp.next = newNode;
                    temp = newNode;
                    temp1 = temp1.next;
                }
                
                else if(temp1.pow == temp2.pow){
                    Node newNode = new Node(temp1.coeff+temp2.coeff,temp1.pow);
                    temp.next = newNode;
                    temp = newNode;
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }
                else{
                    Node newNode = new Node(temp2.coeff,temp2.pow);
                    temp.next = newNode;
                    temp = newNode;
                    temp2 = temp2.next;
                }
                
                
            }
        }
        
        while(temp1!=null){
            
            Node newNode = new Node(temp1.coeff,temp1.pow);
             
            if(temp == null){
                temp = newNode;
                head = temp;
            }
            
            else{
                
                temp.next = newNode;
                temp = newNode;
            }
            
            temp1 = temp1.next;
        }
        
        while(temp2!=null){
            
            Node newNode = new Node(temp2.coeff,temp2.pow);
             
            if(temp == null){
                temp = newNode;
                head = temp;
            }
            
            else{
                
                temp.next = newNode;
                temp = newNode;
            }
            
            temp2 = temp2.next;
        }
        
        return head;
    }
}