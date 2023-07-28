
/*


 Spirally traversing a matrix
        MediumAccuracy: 35.2%Submissions: 218K+Points: 4
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given a matrix of size r*c. Traverse the matrix in spiral form.

        Example 1:
        Input:
        r = 4, c = 4
        matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}}
        Output: 
        1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
        Explanation:

        Example 2:
        Input:
        r = 3, c = 4  
        matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}}
        Output: 
        1 2 3 4 8 12 11 10 9 5 6 7
        Explanation:
        Applying same technique as shown above, 
        output for the 2nd testcase will be 
        1 2 3 4 8 12 11 10 9 5 6 7.


 */




package Array.Medium;

import java.util.ArrayList;

public class spirallyTraversingMatrix {

    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c){
        ArrayList<Integer>ls = new ArrayList<>();
        int top = 0, left = 0, bottom = matrix.length - 1, right = matrix[0].length - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                ls.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ls.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ls.add(matrix[bottom][i]);

                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ls.add(matrix[i][left]);

                left++;
            }
        }
        
        return ls;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        ArrayList<Integer>ls = spirallyTraverse(matrix, 0, 0);

        System.out.println(ls);
    }
}
