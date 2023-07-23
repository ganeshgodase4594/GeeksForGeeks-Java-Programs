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


public class reverseLevelOrderTraversal {
    static ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer>ls = new ArrayList<>();
        if(node == null){
            return ls;
        }

        Queue<Node>queue = new LinkedList<>();
        queue.offer(node);

        while(!queue.isEmpty()){
            int queueSize = queue.size();
            for(int i=0;i<queueSize;i++){
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }

                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                ls.add(queue.poll().data);
            }

        }

        ArrayList<Integer>list = new ArrayList<>();

        for(int i=ls.size()-1;i>=0;i--){
            list.add(ls.get(i));
        }

        return list;
    }
    
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        ArrayList<Integer>ls = reverseLevelOrder(root);
        System.out.println(ls);
    }
}
