
/*
 
Ceil in BST
        MediumAccuracy: 62.73%Submissions: 57K+Points: 4
        Fast-Track your resumes to top tech companies and get the job you deserve! Register for hiring challenge exclusively for Freshers  

        banner
        Given a BST and a number X, find Ceil of X.
        Note: Ceil(X) is a number that is either equal to X or is immediately greater than X.

        If Ceil could not be found, return -1.

        Example 1:
        Input:
            5
            /   \
        1     7
            \
            2 
            \
            3
        X = 3
        Output: 3
        Explanation: We find 3 in BST, so ceil
        of 3 is 3.

        Example 2:
        Input:
            10
            /  \
        5    11
        / \ 
        4   7
            \
            8
        X = 6
        Output: 7
        Explanation: We find 7 in BST, so ceil
        of 6 is 7.


 */




package Tree.BST.Medium;


class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


class Tree {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        
        if (root == null) return -1;
        
        int ceil = -1;
        
        while(root!=null){
            
            if(root.data == key){
                return root.data;
            }
            
            if(root.data<key){
                root = root.right;
            }
            
            else{
                ceil = root.data;
                root = root.left;
            }
        }
        return ceil;
    }

    public static void main(String[] args) {
        
    }
}