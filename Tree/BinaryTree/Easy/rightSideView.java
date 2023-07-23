

/*
 
Right View of Binary Tree
        EasyAccuracy: 65.18%Submissions: 126K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a Binary Tree, find Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side.

        Right view of following tree is 1 3 7 8.

                1
            /     \
            2        3
        /   \      /    \
        4     5   6    7
            \
            8

        Example 1:
        Input:
            1
            /    \
        3      2
        Output: 1 2


        Example 2:
        Input:
            10
            /   \
        20     30
        /   \
        40  60 
        Output: 10 30 60


 */



package Tree.BinaryTree.Easy;

import java.util.ArrayList;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


public class rightSideView {

    static ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer>ls = new ArrayList<>();
        rightSide(node, ls, 0);
        return ls;

    }

    static void rightSide(Node root, ArrayList<Integer>ls , int line){
        if(root == null){
            return;
        }

        if(line == ls.size()){
            ls.add(root.data);
        }

        if(root.right!=null){
            rightSide(root.right, ls, line+1);
        }

        if(root.left!=null){
            rightSide(root.left, ls, line+1);
        }
    }


    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        ArrayList<Integer>ls = rightView(root);

        System.out.println(ls);
    }
}
