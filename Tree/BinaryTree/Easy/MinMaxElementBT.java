
/*


 Max and min element in Binary Tree
        EasyAccuracy: 60.57%Submissions: 27K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a Binary Tree, find maximum and minimum elements in it.

        Example 1:
        Input: 
                
        Output: 11 1
        Explanation:                           
        The maximum and minimum element in 
        this binary tree is 11 and 1 respectively.


        Example 2:
        Input: 
                6
                / \
            5   8
            /
            2
        Output: 8 2


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

public class MinMaxElementBT {

    static int findMax(Node root){
        int maxElement = Integer.MIN_VALUE;
        inOrderMax(root, maxElement);
        return maxElement;
    }

    static void inOrderMax(Node root,int maxElement){
        if(root == null){
            return ;
        }
        inOrderMax(root.left, maxElement);
        maxElement = Math.max(maxElement, root.data);
        inOrderMax(root.right, maxElement);

    }
    // static int findMin(Node root){
    //     //code here
    // }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.right = new Node(6);
        root.right.right = new Node(9);
        root.left.right.left = new Node(1);
        root.left.right.right = new Node(11);
        root.right.right.left = new Node(4);

        System.out.println(findMax(root));
    }
}
