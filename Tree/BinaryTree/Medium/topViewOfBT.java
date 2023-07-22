

/*

 Top View of Binary Tree
        MediumAccuracy: 38.43%Submissions: 225K+Points: 4
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given below is a binary tree. The task is to print the top view of binary tree. Top view of a binary tree is the set of nodes visible when the tree is viewed from the top. For the given below tree

            1
            /     \
        2       3
        /  \    /   \
        4    5  6   7

        Top view will be: 4 2 1 3 7
        Note: Return nodes from leftmost node to rightmost node. Also if 2 nodes are outside the shadow of the tree and are at same position then consider the extreme ones only(i.e. leftmost and rightmost). 
        For ex - 1 2 3 N 4 5 N 6 N 7 N 8 N 9 N N N N N will give 8 2 1 3 as answer. Here 8 and 9 are on the same position but 9 will get shadowed.

        Example 1:
        Input:
            1
        /    \
        2      3
        Output: 2 1 3


        Example 2:
        Input:
            10
            /      \
        20        30
        /   \    /    \
        40   60  90    100
        Output: 40 20 10 30 100


 */



package Tree.BinaryTree.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;


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

public class topViewOfBT {

    static ArrayList<Integer> topView(Node root){
       ArrayList<Integer>ls = new ArrayList<>();

       if(root == null){
            return ls;
       }

       Queue<Pair>queue = new LinkedList<>();
       Map<Integer,Integer>mp = new TreeMap<>();

       queue.add(new Pair(root, 0));

       while(!queue.isEmpty()){
            Pair temp = queue.remove();
            int line = temp.line;

            Node node = temp.node;

            if(mp.get(line)==null){
                mp.put(line, node.data);
            }

            if(node.left!=null){
                queue.add(new Pair(node.left, line-1));
            }

            if(node.right!=null){
                queue.add(new Pair(node.right, line+1));
            }

       }

       for(Map.Entry<Integer,Integer>entry : mp.entrySet()){
            ls.add(entry.getValue());
       }

       return ls;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<Integer>ls = topView(root);
        System.out.println(ls);
    }
}
