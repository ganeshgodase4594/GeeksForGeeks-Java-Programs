

/*
 Max Level Sum in Binary Tree
        EasyAccuracy: 54.67%Submissions: 32K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a Binary Tree having positive and negative nodes. Find the maximum sum of a level in the given Binary Tree.

        Example 1:
        Input :               
                    4
                /    \
                2     -5
                / \    / \
            -1   3  -2  6

        Output: 6

        Explanation :
        Sum of all nodes of 0'th level is 4
        Sum of all nodes of 1'th level is -3
        Sum of all nodes of 2'th level is 6
        Hence maximum sum is 6

        Example 2:
        Input :          
                    1
                /   \
                2     3
                / \     \
            4   5     8
                        / \
                    6   7  

        Output :  17
        Explanation: Maximum sum is at level 2.


 */


package Tree.BinaryTree.Easy;

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

public class maxLevelSum {

    static int maxLevelSums(Node root) {
        if(root == null){
            return 0;
        }

        Queue<Node>queue = new LinkedList<>();
        queue.offer(root);

        int maxSum = Integer.MIN_VALUE;

        while(!queue.isEmpty()){
            int queueSize = queue.size();
            int sum = 0;

            for(int i=0;i<queueSize;i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }

                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }

                sum +=queue.poll().data;
            }
            maxSum = Math.max(maxSum,sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(8);
        root.right.right.left= new Node(-2);
        root.right.right.right =  new Node(7);

        System.out.println(maxLevelSums(root));
    }
}
