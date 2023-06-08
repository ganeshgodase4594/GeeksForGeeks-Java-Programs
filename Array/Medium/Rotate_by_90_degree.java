
/*
Rotate by 90 degree
        EasyAccuracy: 56.88%Submissions: 61K+Points: 2
        Apply for Mega Job-A-Thon: Fresher Edition | 30+ Opportunities | Avg CTC: 3-15 LPA  

        Given a square matrix of size N x N. The task is to rotate it by 90 degrees in anti-clockwise direction without using any extra space. 

        Example 1:
        Input:
        N = 3 
        matrix[][] = {{1, 2, 3},
                    {4, 5, 6}
                    {7, 8, 9}}
        Output: 
        Rotated Matrix:
        3 6 9
        2 5 8
        1 4 7


        Example 2:
        Input:
        N = 2
        matrix[][] = {{1, 2},
                    {3, 4}}
        Output: 
        Rotated Matrix:
        2 4
        1 3

 */




package Array.Medium;

class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

            
        }

        for(int i=0;i<n;i++){
            int left=0;
            int right = n-1;

            while(left<right){
                int temp = matrix[left][i];
                matrix[left][i]= matrix[right][i];
                matrix[right][i] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};

        rotateby90(nums, nums.length);

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                System.out.print(nums[i][j]+" ");
            }

            System.out.println();
        }
    }
}