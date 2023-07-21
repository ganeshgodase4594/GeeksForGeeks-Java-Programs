
/*


 Spiral a
        MediumAccuracy: 41.26%Submissions: 20K+Points: 4
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given a a of size N x M. You have to find the Kth element which will obtain while traversing the a spirally starting from the top-left corner of the a.

        Example 1:
        Input: 
        N = 3, M = 3, K = 4
        A[] = {{1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}}
        Output: 
        6
        Explanation: Spiral traversal of a: 
        {1, 2, 3, 6, 9, 8, 7, 4, 5}. Fourth element
        is 6.


        Example 2:
        Input: 
        N = 2, M = 2, K = 2 
        A[] = {{1, 2},
            {3, 4}} 
        Output: 
        2
        Explanation: Spiral traversal of a: 
        {1, 2, 4, 3}. Second element is 2.
        Your Task:  
        You don't need to read input or print anything. Complete the function findK() which takes the a A[ ][ ], number of rows N, number of columns M, and integer K as input parameters and returns the Kth element in the spiral traversal of the a.


 */


package Array.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    static int findK(int a[][], int n, int m, int k)
	{
        List<Integer>ls = new ArrayList<>();
        int top = 0,left=0,bottom = a.length-1,right=a[0].length-1;

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                ls.add(a[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                ls.add(a[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ls.add(a[bottom][i]);

                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ls.add(a[i][left]);

                left++;
            }
        }

        int count=0;
        for(int x: ls){
            count++;
            if(count==k){
                return x;
            }
        }
        return -1;
	    
	}

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(findK(a, 0, 0, 4));
    }
}
