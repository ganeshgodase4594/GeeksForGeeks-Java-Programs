

/*

 Left View of Binary Tree
        EasyAccuracy: 33.74%Submissions: 404K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a Binary Tree, return Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument.

        Left view of following tree is 1 2 4 8.

                1
            /     \
            2        3
        /     \    /    \
        4     5   6    7
        \
            8   

        Example 1:
        Input:
        1
        /  \
        3    2
        Output: 1 3

        Example 2:
        Input:

        Output: 10 20 40


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

public class leftSideView {

    static ArrayList<Integer> leftView(Node root){
        ArrayList<Integer>ls = new ArrayList<>();
        leftSideViews(root, ls, 0);
        return ls;
    }

    static void leftSideViews(Node root, ArrayList<Integer>ls,int level){
        if(root == null){
            return;
        }

        if(ls.size()==level){
            ls.add(root.data);
        }

        if(root.left!=null){
            leftSideViews(root.left, ls, level+1);
        }

        if(root.right!=null){
            leftSideViews(root.right, ls, level+1);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.right = new Node(8);

        ArrayList<Integer>ls = leftView(root);
        System.out.println(ls);
    }
}
