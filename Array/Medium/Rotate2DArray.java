
/*
 
Rotate a 2D array without using extra space
        MediumAccuracy: 63.1%Submissions: 30K+Points: 4
        Win 2X Geekbits, Get on the Leaderboard & Top the Coding Charts! Register for GFG Weekly Coding Contest

        banner
        Given a N x N 2D matrix Arr representing an image. Rotate the image by 90 degrees (anti-clockwise). You need to do this in place. Note that if you end up using an additional array, you will only receive partial score.

        Example 1:
        Input:
        N = 3
        Arr[][] = {{1,  2,  3}
                {4,  5,  6}
                {7,  8,  9}}
        Output:
        3  6  9 
        2  5  8 
        1  4  7 
        Explanation: The given matrix is rotated
        by 90 degree in anti-clockwise direction.

        Example 2:
        Input:
        N = 4
        Arr[][] = {{1,  2,  3,  4}
                {5,  6,  7,  8}
                {9, 10, 11, 12}
                {13, 14, 15, 16}}
        Output:
        4  8 12 16 
        3  7 11 15 
        2  6 10 14 
        1  5  9 13
        Explanation: The given matrix is rotated
        by 90 degree in anti-clockwise direction.


 */



package Array.Medium;

public class Rotate2DArray {

    static void rotateMatrix(int arr[][], int n) {
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }


        for(int i=0;i<arr[0].length;i++){
            int left = 0;
            int right = arr.length-1;
            while(left<right){
                int temp = arr[left][i];
                arr[left][i] = arr[right][i];
                arr[right][i] = temp;

                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {

        int arr[][] = {{1,  2,  3},
                {4,  5,  6},
                {7,  8,  9}};

        rotateMatrix(arr, 0);

        for(int i=0;i<arr.length;i++){
            
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        

    }
}
