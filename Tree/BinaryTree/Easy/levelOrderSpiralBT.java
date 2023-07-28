
/*
 
Level order traversal in spiral form
        EasyAccuracy: 36.43%Submissions: 167K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a binary tree and the task is to find the spiral order traversal of the tree.

        Spiral order Traversal mean: Starting from level 0 for root node, for all the even levels we print the node's value from right to left and for all the odd levels we print the node's value from left to right. 

        For below tree, function should return 1, 2, 3, 4, 5, 6, 7.


        Example 1:
        Input:
            1
            /   \
        3     2
        Output:1 3 2


        Example 2:
        Input:
                10
                /     \
                20     30
            /    \
            40     60
        Output: 10 20 30 60 40 


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

public class levelOrderSpiralBT {

    static ArrayList<Integer> findSpiral(Node root){
        ArrayList<Integer>ls = new ArrayList<>();
        if(root == null){
            return ls;
        }

        Queue<Node>queue = new LinkedList<>();
        queue.offer(root);
        int height = 1;

        while(!queue.isEmpty()){
            int queueSize = queue.size();
            ArrayList<Integer>subls = new ArrayList<>();
            for(int i=0;i<queueSize;i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }

                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }

                subls.add(queue.poll().data);

            }

            if(height%2==1){
                for(int i=subls.size()-1;i>=0;i--){
                    ls.add(subls.get(i));
                }
            }
            else{
                for(int i=0;i<subls.size();i++){
                    ls.add(subls.get(i));
                }
            }
            height++;
        }
        return ls;
    } 
  
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        ArrayList<Integer>ls = findSpiral(root);
        System.out.println(ls);
    }
}
