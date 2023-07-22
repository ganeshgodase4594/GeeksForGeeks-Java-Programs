

/*


 ZigZag Tree Traversal
        EasyAccuracy: 54.05%Submissions: 113K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a Binary Tree. Find the Zig-Zag Level Order Traversal of the Binary Tree.

        

        Example 1:
        Input:
                1
            /   \
            2     3
            / \   /  \
        4   5 6    7
        Output:
        1 3 2 4 5 6 7

        Example 2:
        Input:
                7
                /     \
            9       7
            /  \     /   
            8    8   6     
        /  \
        10   9 
        Output:
        7 7 9 8 8 6 9 10
        
        

 */

package Tree.BinaryTree.Easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class ZigZagTraversal {

    static ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer>ls = new ArrayList<>();
        if(root==null){
            return ls;
        }

        Queue<Node>queue = new LinkedList<>();
        queue.offer(root);
        int height =1;

        while(!queue.isEmpty()){
            int queueSize = queue.size();
            ArrayList<Integer>subls1 = new ArrayList<>();
            ArrayList<Integer>subls2 = new ArrayList<>();

            for(int i=0;i<queueSize;i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }

                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }

                subls1.add(queue.poll().data);
            }

            if(height%2==0){
                for(int i=subls1.size()-1;i>=0;i--){
                    subls2.add(subls1.get(i));
                }

                ls.addAll(subls2);
            }
            else{
                ls.addAll(subls1);
            }
            height++;
        }

        return ls;
	}
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right =new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<Integer>ls = zigZagTraversal(root);

        System.out.println(ls);
    }
}
