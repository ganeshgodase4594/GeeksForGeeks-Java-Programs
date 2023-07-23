package Tree.BinaryTree.Easy;

import java.nio.channels.NonWritableChannelException;
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
public class NodeLevelBT {
    static int getLevel(Node node, int data){ 
        if(node == null){
            return 0;
        }

        Queue<Node>queue = new LinkedList<>();
        queue.offer(node);

        int level = 1;

        while(!queue.isEmpty()){
            int queueSize = queue.size();

            for(int i=0;i<queueSize;i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }

                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }

                int queueData = queue.poll().data;

                if(queueData == data){
                    return level;
                }
            }
            level++;
        }

        return 0;
    } 

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);

        System.out.println(getLevel(root, 4));
    }
}
