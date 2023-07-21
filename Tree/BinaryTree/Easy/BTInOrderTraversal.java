package Tree.BinaryTree.Easy;
import java.util.ArrayList;
import java.util.Stack;



class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class BTInOrderTraversal{

    static ArrayList<Integer> inorder(Node root)
    {
        ArrayList<Integer>ls = new ArrayList<>();

        inorderTraversal(root, ls);

        return ls;
    }

    static void inorderTraversal(Node root,ArrayList<Integer>ls){
        if(root==null){
            return;
        }

        inorderTraversal(root.left,ls);
        ls.add(root.data);
        inorderTraversal(root.right,ls);
    }

    // Using Stack

    static ArrayList<Integer> inOrderTraversal(Node root){
         ArrayList<Integer>ls = new ArrayList<>();
        if(root==null){
            return ls;
        }

        Stack<Node>st = new Stack<>();
        Node node = root;

        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }

            else{
                if(st.isEmpty()){
                    break;
                }

                node = st.pop();
                ls.add(node.data);
                node = node.right;
            }
        }
        return ls;
        
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);

        ArrayList<Integer>ls = inorder(root);


        System.out.println(ls);
    }

}
