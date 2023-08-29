
/*
 Transpose of Matrix
        EasyAccuracy: 66.5%Submissions: 84K+Points: 2
        Win from a prize pool of INR 15K and get exciting merch! Register your team for Hack-A-Thon today!

        Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.

        Example 1:
        Input:
        N = 4
        mat[][] = {{1, 1, 1, 1},
                {2, 2, 2, 2}
                {3, 3, 3, 3}
                {4, 4, 4, 4}}
        Output: 
        {{1, 2, 3, 4},  
        {1, 2, 3, 4}  
        {1, 2, 3, 4}
        {1, 2, 3, 4}} 

        Example 2:
        Input:
        N = 2
        mat[][] = {{1, 2},
                {-9, -2}}
        Output:
        {{1, -9}, 
        {2, -2}}


 */



package Array.Easy;
public class transposeOfMatrix {

    static void transpose(int n,int a[][])
    {
        for(int i=0;i<a.length;i++){
            
            for(int j=i+1;j<a[i].length;j++){
                
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        
    }

    public static void main(String[] args) {
        int mat[][] = {{1, 1, 1, 1},
        {2, 2, 2, 2},
        {3, 3, 3, 3},
        {4, 4, 4, 4}};

        transpose(0, mat);
    }
}
