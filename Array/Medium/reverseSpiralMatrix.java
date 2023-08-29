
/*

 Reverse Spiral Form of Matrix
        MediumAccuracy: 57.45%Submissions: 14K+Points: 4
        Win from a prize pool of INR 15K and get exciting merch! Register your team for Hack-A-Thon today!

        Given a matrix as 2D array. Find the reverse spiral traversal of the matrix. 

        Example 1:
        Input: R = 3, C = 3
        a = {{9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}}
        Output: 5 6 3 2 1 4 7 8 9
        Explanation: Spiral form of the matrix
        in reverse order starts from the centre 
        and goes outward.


        Example 2:
        Input: R = 4, C = 4 
        a = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}, 
            {13, 14, 15, 16}}
        Output: 10 11 7 6 5 9 13 14 15 16 12 8 4 3 2 1
        Explanation: 

 */





package Array.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class reverseSpiralMatrix {
    
    static int[] reverseSpiral(int R, int C, int[][] a)
    {
        int[] revSpriral = new int[R*C];
        ArrayList<Integer>ls = new ArrayList<>();
        int left = 0;
        int right = a[0].length-1;
        int top = 0;
        int bottom = a.length-1;

        while(left<=right && top<=bottom){

            for(int i=left;i<=right;i++){
                ls.add(a[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                ls.add(a[i][right]);
            }

            right--;

            if(top<=bottom){

                for(int i=right;i>=left;i--){
                    ls.add(a[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){

                for(int i=bottom;i>=top;i--){
                    ls.add(a[i][left]);
                }
                left++;
            }
        }

        System.out.println(ls);
        Collections.reverse(ls);
        System.out.println(ls);

        int ind = 0;
        for(int x : ls){
            revSpriral[ind] = x;
            ind++;
        }

        return revSpriral;
    }

    public static void main(String[] args) {
        
        int[][] a = {{13,11,8,1}};

        int rev[] = reverseSpiral(1, 4, a);

        for(int i=0;i<rev.length;i++){

            System.out.print(rev[i]+" ");
        }
    }
}
