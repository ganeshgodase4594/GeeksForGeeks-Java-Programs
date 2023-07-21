package Tree.BinaryTree.Easy;
import java.util.ArrayList;


class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class BTPostOrderTraversal{

    
    static ArrayList<Integer> postorder(Node root)
    {
        ArrayList<Integer>ls = new ArrayList<>();

        postorderTraversal(root, ls);

        return ls;
    }

    static void postorderTraversal(Node root,ArrayList<Integer>ls){
        if(root==null){
            return;
        }

        postorderTraversal(root.left,ls);
        postorderTraversal(root.right,ls);
        ls.add(root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);

        ArrayList<Integer>ls = postorder(root);


        System.out.println(ls);
    }

}
