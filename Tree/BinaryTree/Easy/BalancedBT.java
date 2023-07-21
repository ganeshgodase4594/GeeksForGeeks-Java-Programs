
/*
 
Check for Balanced Tree
        EasyAccuracy: 43.15%Submissions: 229K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a binary tree, find if it is height balanced or not. 
        A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree. 

        A height balanced tree
                1
            /     \
        10      39
        /
        5

        An unbalanced tree
                1
            /    
        10   
        /
        5


        Example 1:
        Input:
            1
            /
        2
            \
            3 
        Output: 0
        Explanation: The max difference in height
        of left subtree and right subtree is 2,
        which is greater than 1. Hence unbalanced

        Example 2:
        Input:
            10
            /   \
            20   30 
        /   \
        40   60
        Output: 1
        Explanation: The max difference in height
        of left subtree and right subtree is 1.
        Hence balanced.

 */


package Tree.BinaryTree.Easy;

import javax.print.FlavorException;
import javax.swing.JEditorPane;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class BalancedBT {

    static boolean isBalanced(Node root){
        if(root==null){
            return true;
        }

        int height = heightBT(root);
        if(height==-1){
            return false;
        }

        return true;
    }


    static int heightBT(Node root){
        if(root==null){
            return 0;
        }

        int left = heightBT(root.left);
        int right = heightBT(root.right);

        if(left==-1 || right ==-1){
            return -1;
        }

        if(Math.abs(left-right)>1){
            return -1;
        }

        return 1+Math.max(left,right);
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(10);
        root.left.left = new Node(35);

        System.out.println(isBalanced(root));
    }
}
