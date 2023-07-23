
/*


 Maximum Depth Of Binary Tree
        EasyAccuracy: 77.83%Submissions: 27K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a binary tree, find its maximum depth.
        A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

        Example 1:
        Input:
        root  -->     1
                    /   \
                    3     2
                /
                4           
        Output: 3
        Explanation:
        Maximum depth is between nodes 1 and 4, which is 3.

        Example 2:
        Input:
        root -->    10
                /    \
                20    30
                \      \  
                40     60
                        /
                        2 
        Output: 4
        Explanation:
        Maximum depth is between nodes 10 and 2, which is 4


 */

package Tree.BinaryTree.Easy;

public class maxDepthBT {
    public static int maxDepth(Node root) {
         if (root == null) {
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.left.left = new Node(4);

        System.out.println(maxDepth(root));
    }
}
