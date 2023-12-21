

/*
k-th smallest element in BST
    MediumAccuracy: 43.53%Submissions: 106K+Points: 4
    Fast-Track your resumes to top tech companies and get the job you deserve! Register for hiring challenge exclusively for Freshers  

    banner
    Given a BST and an integer K. Find the Kth Smallest element in the BST using O(1) extra space. 

    Example 1:
    Input:
        2
        /   \
    1     3
    K = 2
    Output: 2
    Explanation: 2 is the 2nd smallest element in the BST

    Example 2:
    Input:
            2
        /  \
        1    3
    K = 5
    Output: -1
    Explanation: There is no 5th smallest element in the BST as the size of BST is 3
    
 */




package Tree.BST.Medium;

import java.util.ArrayList;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


class KthSmallestElement {
    
    static int KthSmallestElements(Node root, int K) {
        ArrayList<Integer>ls = new ArrayList<>();
        
        inorderTraversal(root,ls);
        
        if(K>ls.size()){
            return -1;
        }
        
        else{
            return ls.get(K-1);
        }
    }
    
    static void inorderTraversal(Node root,ArrayList<Integer>ls){
        if(root == null){
            return;
        }
        inorderTraversal(root.left,ls);
        ls.add(root.data);
        inorderTraversal(root.right,ls);
    }

    public static void main(String[] args) {
        
    }
}

