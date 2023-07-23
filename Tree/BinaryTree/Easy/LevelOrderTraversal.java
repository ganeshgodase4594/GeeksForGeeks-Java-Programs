
/*
 Level order traversal
        EasyAccuracy: 70.31%Submissions: 151K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a binary tree, find its level order traversal.
        Level order traversal of a tree is breadth-first traversal for the tree.


        Example 1:
        Input:
            1
        /   \ 
        3     2
        Output:1 3 2


        Example 2:
        Input:
                10
            /      \
            20       30
        /   \
        40   60
        Output:10 20 30 40 60

        Your Task:
        You don't have to take any input. Complete the function levelOrder() that takes the root node as input parameter and returns a list of integers containing the level order traversal of the given Binary Tree.

 */



package Tree.BinaryTree.Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class LevelOrderTraversal {

    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer>ls = new ArrayList<>();
        if(node==null){
            return ls;
        }

        Queue<Node>queue = new LinkedList<>();
        queue.offer(node);

        while(!queue.isEmpty()){
           int queueSize = queue.size();
           for(int i=0;i<queueSize;i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }

                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }

                ls.add(queue.poll().data);
           }
        }

        return ls;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        ArrayList<Integer>ls = levelOrder(root);
        System.out.println(ls);
    }
}
