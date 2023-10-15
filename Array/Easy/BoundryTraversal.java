
/*
 Boundary traversal of matrix
        EasyAccuracy: 35.32%Submissions: 90K+Points: 2
        You've Still got a chance to get on the Leaderboard! Register for GfG Weekly Coding Contest

        banner
        You are given a matrix of dimensions n x m. The task is to perform boundary traversal on the matrix in a clockwise manner.

        Example 1:
        Input:
        n = 4, m = 4
        matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}}
        Output: 1 2 3 4 8 12 16 15 14 13 9 5
        Explanation:
        The matrix is:
        1 2 3 4
        5 6 7 8
        9 10 11 12
        13 14 15 16
        The boundary traversal is:
        1 2 3 4 8 12 16 15 14 13 9 5.


        Example 2:
        Input:
        n = 3, m = 4
        matrrix[][] = {{12, 11, 10, 9},
                {8, 7, 6, 5},
                {4, 3, 2, 1}}
        Output: 12 11 10 9 5 1 2 3 4 8.


 */




package Array.Easy;

import java.util.ArrayList;

public class BoundryTraversal {

    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m){
        
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        
        ArrayList<Integer>ls = new ArrayList<>();
        for(int i=left;i<=right;i++){
            
            ls.add(matrix[top][i]);
        }
        top++;
        
        for(int i= top;i<=bottom;i++){
            ls.add(matrix[i][right]);
        }
        
        right--;
        
        if(top<=bottom){
            
        for(int i=right;i>=left;i--){
            ls.add(matrix[bottom][i]);
        }
        
        bottom--;
        }
        
        if(left<=right){
            
        for(int i=bottom;i>=top;i--){
            ls.add(matrix[i][left]);
        }
        
        left++;
        
        }
        
        
        return ls;
    }

    public static void main(String[] args) {
        
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}};

        ArrayList<Integer>ls = boundaryTraversal(matrix, 0, 0);

        System.out.println(ls);
    }
}
