

/*
 Preorder Traversal
        BasicAccuracy: 62.73%Submissions: 132K+Points: 1
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a binary tree, find its preorder traversal.

        Example 1:
        Input:
                1      
            /          
            4    
        /    \   
        4       2
        Output: 1 4 4 2 


        Example 2:
        Input:
            6
            /   \
            3     2
            \   / 
            1 2
        Output: 6 3 1 2 2

 */



package Tree.BinaryTree.Easy;

import java.util.ArrayList;
import java.util.Stack;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class BTPreOrderTraversal{

    
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer>ls = new ArrayList<>();

        preorderTraversal(root, ls);

        return ls;
    }

    static void preorderTraversal(Node root,ArrayList<Integer>ls){
        if(root==null){
            return;
        }

        ls.add(root.data);
        preorderTraversal(root.left,ls);
        preorderTraversal(root.right,ls);
    }

    // Using Stack

    static ArrayList<Integer> preTraversal(Node root){
        ArrayList<Integer>ls = new ArrayList<>();

        if(root==null){
            return ls;
        }

        Stack<Node>st = new  Stack<>();
        Node node = root;
        st.push(node);

        while(!st.isEmpty()){
            node = st.pop();

            ls.add(node.data);
            if(node.right!=null){
                st.push(node.right);
            }

            if(node.left!=null){
                st.push(node.left);
            }
        }

        return ls;
        
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);

        // ArrayList<Integer>ls = preorder(root);
        ArrayList<Integer>ls = preTraversal(root);

        System.out.println(ls);
    }

}
