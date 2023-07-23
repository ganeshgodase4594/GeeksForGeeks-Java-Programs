
/*

Diameter of a Binary Tree
        MediumAccuracy: 47.37%Submissions: 230K+Points: 4
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two end nodes. The diagram below shows two trees each with diameter nine, the leaves that form the ends of the longest path are shaded (note that there is more than one path in each tree of length nine, but no path longer than nine nodes). 



        Example 1:
        Input:
            1
            /  \
            2    3
        Output: 3


        Example 2:
        Input:
                10
                /   \
            20    30
            /   \ 
        40   60
        Output: 4
        
 
 */

package Tree.BinaryTree.Medium;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class diameterBT {
    static int diameter(Node root) {
        int[] diameter = new int[1];
        heightBT(root, diameter);
        return diameter[0]+1;
    }

    static int heightBT(Node root,int[] diameter){
        if(root==null){
            return 0;
        }

        int leftHeight = heightBT(root.left, diameter);
        int rightheight = heightBT(root.right, diameter);
        diameter[0] = Math.max(diameter[0], rightheight+leftHeight);

        return 1+Math.max(leftHeight,rightheight);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(6);
        root.right.left.left = new Node(5);
        root.right.right.right = new Node(7);
        root.right.left.left.left = new Node(9);
        root.right.right.right.right = new Node(8);

        System.out.println(diameter(root));
    }
}
