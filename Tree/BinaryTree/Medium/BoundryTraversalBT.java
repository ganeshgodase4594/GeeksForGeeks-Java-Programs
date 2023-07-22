

/*

        Boundary Traversal of binary tree
        MediumAccuracy: 23.33%Submissions: 283K+Points: 4
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a Binary Tree, find its Boundary Traversal. The traversal should be in the following order: 

        Left boundary nodes: defined as the path from the root to the left-most node ie- the leaf node you could reach when you always travel preferring the left subtree over the right subtree. 
        Leaf nodes: All the leaf nodes except for the ones that are part of left or right boundary.
        Reverse right boundary nodes: defined as the path from the right-most node to the root. The right-most node is the leaf node you could reach when you always travel preferring the right subtree over the left subtree. Exclude the root from this as it was already included in the traversal of left boundary nodes.
        Note: If the root doesn't have a left subtree or right subtree, then the root itself is the left or right boundary. 

        Example 1:

        Input:
                1 
            /   \
            2     3  
            / \   / \ 
        4   5 6   7
            / \
            8   9
        
        Output: 1 2 4 8 9 6 7 3
        Explanation:


        

        Example 2:

        Input:
                    1
                /
                2
                /  \
            4    9
            /  \    \
            6    5    3
                    /  \
                    7     8

        Output: 1 2 4 6 5 7 8
        Explanation:
        As you can see we have not taken the right subtree. 

 */




package Tree.BinaryTree.Medium;

import java.util.ArrayList;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class BoundryTraversalBT {

    static ArrayList <Integer> boundary(Node node)
	{
        ArrayList<Integer>ls = new ArrayList<>();
        if(node == null){
            return ls;
        }

        if(node.left==null && node.right!=null){
            ls.add(node.data);
        }
        if(node.left!=null){
            addLeftBoundry(node, ls);
        }

        addLeaves(node, ls);

        if(node.right!=null){
            addRightBoundry(node, ls);
        }

        return ls;
	    
	}

    static boolean isLeaf(Node root){
        if(root.left==null && root.right == null){
            return true;
        }
        return false;
    }

    static void addLeftBoundry(Node root,ArrayList<Integer>ls){
        Node node = root;
        while(node!=null){
            if(!isLeaf(node)){
                ls.add(node.data);
            }

            if(node.left!=null){
                node = node.left;
            }

            else{
                node = node.right;
            }
        }
    }

    static void addLeaves(Node root,ArrayList<Integer>ls){
        if(isLeaf(root)){
            ls.add(root.data);
        }

        if(root.left!=null){
            addLeaves(root.left, ls);
        }

        if(root.right!=null){
            addLeaves(root.right, ls);
        }
    }

    static void addRightBoundry(Node root,ArrayList<Integer>ls){
        ArrayList<Integer>subLs = new ArrayList<>();
        Node node = root.right;
        while(node!=null){
            if(!isLeaf(node)){
                subLs.add(node.data);
            }
            if(node.right!=null){
                node = node.right;
            }
            else{
                node = node.left;
            }
        }


        for(int i=subLs.size()-1;i>=0;i--){
            ls.add(subLs.get(i));
        }
    }

    public static void main(String[] args) {
        Node root = new Node(17);
        // root.right = new Node(1);
        // root.right.right = new Node(9);
        // root.right.right.right =new Node(2);
        // root.right.right.right.right =new Node(11);
        // root.right.right.right.right.right = new Node(16);

        ArrayList<Integer>ls = boundary(root);

        System.out.println(ls);

    }
}
