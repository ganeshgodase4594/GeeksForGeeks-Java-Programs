package Tree.BinaryTree.Hard;



class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class MaxPathSum {

    static int maxPathSum(Node root)
    { 
        int maxSum[] = new int[1];
        maxsum(root,maxSum);

        return maxSum[0];
         
    } 

    static int maxsum(Node root,int maxSum[]){
        if(root == null){
            return 0;
        }

        int leftSum = Math.max(0,maxsum(root.left, maxSum));
        int rightSum = Math.max(0,maxsum(root.right, maxSum));

        maxSum[0] = Math.max(maxSum[0], rightSum+leftSum+root.data);

        return root.data+Math.max(leftSum,rightSum);
    }

    public static void main(String[] args) {
        Node root = new Node(-9);
        root.left = new Node(6);
        root.right = new Node(-10);
        // root.left.left = new Node(-10);
        // root.left.right = new Node(4);

        System.out.println(maxPathSum(root));
    }
}
