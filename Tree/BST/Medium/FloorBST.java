
/*

Floor in BST
        MediumAccuracy: 51.06%Submissions: 55K+Points: 4
        Fast-Track your resumes to top tech companies and get the job you deserve! Register for hiring challenge exclusively for Freshers  

        banner
        You are given a BST(Binary Search Tree) with n number of nodes and value x. your task is to find the greatest value node of the BST which is smaller than or equal to x.
        Note: when x is smaller than the smallest node of BST then returns -1.

        Example:
        Input:
        n = 7               2
                            \
                            81
                            /     \
                        42       87
                        \       \
                            66      90
                        /
                        45
        x = 87
        Output:
        87
        Explanation:
        87 is present in tree so floor will be 87.


        Example 2:
        Input:
        n = 4                     6
                                \
                                    8
                                /   \
                                7       9
        x = 11
        Output:
        9.


 */





package Tree.BST.Medium;

class Node {
      int data;
      Node left;
      Node right;
      Node() {}
      Node(int val) { this.data = val; }
      Node(int val, Node left, Node right) {
          this.data = val;
          this.left = left;
          this.right = right;
      }
}



class Tree {

    static int floor(Node root, int x) {
        if(root == null){
            return -1;
        }
        
        int floor = -1;
        while(root!=null){
            if(root.data == x){
                return x;
            }
            
            if(root.data < x){
                floor = root.data;
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
        
        return floor;
    }

    public static void main(String[] args) {
        
    }
}
