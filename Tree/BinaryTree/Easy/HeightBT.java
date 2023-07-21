

/*

 Height of Binary Tree
        EasyAccuracy: 78.58%Submissions: 210K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a binary tree, find its height.


        Example 1:
        Input:
            1
            /  \
        2    3
        Output: 2



        Example 2:
        Input:
        2
        \
            1
        /
        3
        Output: 3

 */


package Tree.BinaryTree.Easy;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class HeightBT {

    static int height(Node node) 
    {
        if(node==null){
            return 0;
        } 

        int left = height(node.left);
        int right = height(node.right);

        return 1+Math.max(left,right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println(height(root));
    }
}
