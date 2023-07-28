

/*
 
Bottom View of Binary Tree
        MediumAccuracy: 54.18%Submissions: 177K+Points: 4
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a binary tree, print the bottom view from left to right.
        A node is included in bottom view if it can be seen when we look at the tree from bottom.

                            20
                            /    \
                        8       22
                        /   \        \
                    5      3       25
                            /   \      
                        10    14

        For the above tree, the bottom view is 5 10 3 14 25.
        If there are multiple bottom-most nodes for a horizontal distance from root, then print the later one in level traversal. For example, in the below diagram, 3 and 4 are both the bottommost nodes at horizontal distance 0, we need to print 4.

                            20
                            /    \
                        8       22
                        /   \     /   \
                    5      3 4     25
                            /    \      
                        10       14

        For the above tree the output should be 5 10 4 14 25.

        Note: The Input/Output format and Example given are used for the system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from the stdin/console. The task is to complete the function specified, and not to write the full code.
        

        Example 1:
        Input:
            1
            /   \
            3     2
        Output: 3 1 2
        Explanation:
        First case represents a tree with 3 nodes
        and 2 edges where root is 1, left child of
        1 is 3 and right child of 1 is 2.

        Thus nodes of the binary tree will be
        printed as such 3 1 2.


        Example 2:
        Input:
                10
            /    \
            20    30
            /  \
            40   60
        Output: 40 20 60 30


 */



package Tree.BinaryTree.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class Pair {
    Node node;
    int line;

    public Pair(Node _node, int _line) {
        node = _node;
        line = _line;
    }
}

public class bottomView {

    static ArrayList <Integer> bottomViews(Node root)
    {
       ArrayList<Integer>ls = new ArrayList<>();
       if(root == null){
            return ls;
       }

       Queue<Pair>queue = new LinkedList<>();
       Map<Integer,Integer>mp = new TreeMap<>();

       queue.offer(new Pair(root, 0));

       while(!queue.isEmpty()){
            Pair temp = queue.remove();
            int line = temp.line;
            Node node = temp.node;

            mp.put(line, node.data);

            if(node.left!=null){
                queue.offer(new Pair(node.left, line-1));
            }

            if(node.right!=null){
                queue.offer(new Pair(node.right, line+1));
            }
       }

       for(Map.Entry<Integer,Integer>entry : mp.entrySet()){
            ls.add(entry.getValue());
       }

      return ls; 
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        ArrayList<Integer>ls = bottomViews(root);
        System.out.println(ls);
    }
}
